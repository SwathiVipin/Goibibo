package wiproassignment.goibibo_TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(

		
		features = {"./src/test/java/wiproassignment/goibibo_features"},
		glue = {"goibibo_stepDefenitions"},
		//tags = {"@Registration","@Login","@ForgotPassword","@ResetPassword"},
		monochrome = true,// It display the console o/p in good readable format
		strict = true,// It will check any step is not defined in stepDef with respect to feature file
		dryRun = false,// to check the mapping is matching with feature file and stepDef
		//plugin = {"html:target/htmlReports/cucumber-html-report","json:target/jsonReports/cucumber.json","pretty:target/textreports/cucumber-pretty.txt"}			
		plugin = {"pretty"}
		)

public class TestRunner {
	

}
