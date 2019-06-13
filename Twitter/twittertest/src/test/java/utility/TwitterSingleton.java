package utility;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;

public class TwitterSingleton {
    protected static Twitter twitter;
    
   public static Twitter getTwitterInstance(){
    	twitter = TwitterFactory.getSingleton();
    	return twitter;
    }
}
