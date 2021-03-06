package cucumberTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "Features",
	    glue = {"stepDefinitions"},
	    tags = "@SimpleAlert",
	    plugin = {"json: test-reports"},
	    monochrome = true
)

public class ActivitiesRunner {
    //empty
}
