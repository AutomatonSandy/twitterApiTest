package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Features", 
glue = {"glue"}, 
tags = {" @getSubscribedLists, @getHomeTimeline"})

public class GetRunner {

}