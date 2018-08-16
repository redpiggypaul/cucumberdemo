package runner;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

import cucumber.runtime.*;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/java/features",
        glue = {"src/main/java/step_definitions"}
)

public class CucumberTestRunner {
}
