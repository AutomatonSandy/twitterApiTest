package sandy.twittertest;

import twitter4j.Status;
import twitter4j.StatusUpdate;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws TwitterException
    {
        Twitter twitter=TwitterFactory.getSingleton();
        StatusUpdate statusText=new StatusUpdate("This is from eclipse");
        Status status=twitter.updateStatus(statusText);
    }
}
