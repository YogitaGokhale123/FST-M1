package cucumberTest;

import io.cucumber.junit.CucumberOptions;

@CucumberOptions(
	    features = "Features",
	    glue = {"stepDefinitions"},
	    tags = "@SmokeTest",
	    plugin = {"pretty"},
	    monochrome = true
	)

public class ActivtiesRunner6 {

}