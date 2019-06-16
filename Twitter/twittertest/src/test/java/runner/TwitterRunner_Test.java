package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", 
glue = {"glue"}, 
plugin= {"pretty", "html:target/cucumber", "json:target/cucumber.json"})
public class TwitterRunner_Test {

}
//tags = {" @getSubscribedLists or @getHomeTimeline"}
