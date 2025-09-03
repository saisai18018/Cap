package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/features",
        glue = {"stepDefinitions"},
        tags = "@smoke",
        plugin = {"pretty","html:target/smoke.html"}
)
public class SmokeTestRunner extends AbstractTestNGCucumberTests { }
