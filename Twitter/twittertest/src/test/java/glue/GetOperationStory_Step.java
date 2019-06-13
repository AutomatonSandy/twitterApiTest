package glue;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import steps.GetOperations;

public class GetOperationStory_Step{
	GetOperations getOperations = new GetOperations();
	
  @When("I perform a get operation on list")
  public void perform_get() throws Throwable {
	  getOperations.getActualLists();	  
  }
  
  @Then("I get {int} list members")
  public void verifyList(int expectedUserListCount) throws Throwable{
        getOperations.validate_userList(expectedUserListCount);
  }

  @When("I perform a get operation on my timeline")
  public void i_perform_a_get_operation_on_my_timeline() {
     getOperations.getTimeline();
  }

  @Then("I want to store top {int}")
  public void i_want_to_store_top_to_database(int numberOfTweets) {
     getOperations.store_Timeline_withId(numberOfTweets);
  }

  @Then("I want to store the screen name of the tweets")
  public void i_want_to_store_the_screen_name_of_the_tweets() {
	  getOperations.storeUniqueUserScreenName();
  }


}
