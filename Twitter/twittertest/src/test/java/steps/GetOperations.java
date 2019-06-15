package steps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Assert;

import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.UserList;
import utility.TwitterSingleton;

public class GetOperations extends TwitterSingleton {
	private final String ownerScreenName = "Sandipa13311183";
	ResponseList<UserList> userList;
	ResponseList<Status> timeLineList;
	List<String> actualResult;

	// ------------ begin code get lists -----------------
	public void getActualLists() throws TwitterException {
		userList = twitter.getUserLists(ownerScreenName);
		System.out.println("--------------------------"+userList);
		actualResult = new ArrayList<String>();
		for (int i = 0; i < userList.size(); i++) {
			actualResult.add(userList.get(i).getName());
		}
	}

	public void validate_userList(int expectedUserListCount) {
		System.out.println(" actual result "+actualResult);
		int actualNumberOfList=actualResult.size();
		Assert.assertTrue("acutal number of list "+actualNumberOfList
				+" real number expected "+expectedUserListCount,actualResult.size() == expectedUserListCount);
	}

	// --------------------- end code get lists ----------------------

	// ---------------------- begin code get time lines -----------------
	public void getTimeline() {
		try {
			timeLineList = twitter.getHomeTimeline();
		} catch (TwitterException e) {
			e.printStackTrace();
			}
	   }
	
	public void store_Timeline_withId(int specificNumberOfTweets) {
		Map<Long, String> tweetTimeLineMap = new HashMap<Long, String>();
		if(specificNumberOfTweets > timeLineList.size()) {
			Assert.assertTrue("The number of tweets in the timeline is less then the tweets you want to store", false);
		}else {
			Status status;
			for( int i=0; i<specificNumberOfTweets; i++) {
				status=timeLineList.get(i);
				tweetTimeLineMap.put(status.getId(), status.getText());
			}
		}
		System.out.println(tweetTimeLineMap);
	}
	
	public void storeUniqueUserScreenName() {
		Set<String> screenNameInTimeline = new HashSet<String>();
		for(int i=0; i<timeLineList.size();i++) {
			screenNameInTimeline.add(timeLineList.get(i).getUser().getScreenName());
		}
		System.out.println(screenNameInTimeline);
	}
	
}
