package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"classpath:features"},
        glue = {"stepDefinitions"},
        plugin = {"pretty:src/cucumberReports/cucumberReports.txt",
                "html:src/cucumberReports/htmlReports/htmlReport.html",
                "usage:src/cucumberReports/cucumber.json",
                "junit:src/cucumberReports/cucumber-results.xml"
        }

)
public class ApplicationTestRunner {
}
