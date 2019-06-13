package glue;

import cucumber.api.java.en.Given;
import utility.TwitterSingleton;

public class Common_Glue extends TwitterSingleton {

	@Given("I am able to access Twitter api")
	  public void accessTwitter() throws Throwable {
		  twitter = TwitterSingleton.getTwitterInstance();
	  }
}
