package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = {"C:\\Users\\1\\Framework\\DemoQA\\src\\test\\resources\\Features"},
		glue="StepDefinition",
		dryRun = true,
		monochrome = true,
		
		plugin = {"pretty","html:target/cucumber-reports/reports_html.html"}
		)

public class TestRunner {

}
