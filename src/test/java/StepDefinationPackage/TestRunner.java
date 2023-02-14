package StepDefinationPackage;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\feature", glue= {"StepDefinationPackage"},
monochrome= true,
plugin= {"pretty","html:target/HtmlReports/report.html"} )
public class TestRunner {
	
}
