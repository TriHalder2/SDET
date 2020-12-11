package cucumberTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)	
@CucumberOptions(	
    features = "Features",	
    glue = {"stepDefinitions"},	
    //tags = "@activity1_4_JobBoardProject",	
    plugin = {"html:JobBoardProjectreports/html-report.html"},
    monochrome = true
	
)
	
public class ActivitiesRunner {	
    //empty	
}
