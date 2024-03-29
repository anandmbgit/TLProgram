package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/test/java/Features",
		glue= {"StepDefinitions"},
		plugin= {"pretty","html:target/htmlReports"},
		monochrome=true)
public class TestRunner {

}
