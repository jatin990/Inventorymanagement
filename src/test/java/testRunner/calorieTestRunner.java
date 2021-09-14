package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"features"},
        glue = {"stepDefinitions"},
        plugin = {"pretty:src/cucumberReports/cucumberReports.txt",
                "html:src/cucumberReports/htmlReports/htmlReport.html",
                "usage:src/cucumberReports/cucumber.json",
                "junit:src/cucumberReports/cucumber-results.xml"
        }

)
public class calorieTestRunner {
}
