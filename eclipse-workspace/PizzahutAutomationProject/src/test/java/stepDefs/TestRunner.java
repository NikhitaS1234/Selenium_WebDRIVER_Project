package stepDefs;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
	
		monochrome = true,
		plugin = "pretty",
		features = "src/test/java/features",
		glue = "stepDefs",
		tags = {"@Regression"}
		)

public class TestRunner {

	
}
