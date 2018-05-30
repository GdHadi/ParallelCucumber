package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions(
		features ="/Users/gdhadi/eclipse-workspace/cucumberTest/feature/login.feature",
		glue = {"stefDef"}
		//format = {"pretty","html:test-output"}
		)
         
public class testRunner {
	
}
