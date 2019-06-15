package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", 
glue = {"glue"}, 
tags = {" @getSubscribedLists or @getHomeTimeline"})
public class Get_RelatedSuite_Test {

}
