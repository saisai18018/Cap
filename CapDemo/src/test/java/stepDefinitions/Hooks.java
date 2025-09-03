package stepDefinitions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.*;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.DriverFactory;
import utils.ExtentReportManager;
import utils.ScreenshotUtil;

public class Hooks {
    private static ExtentReports extent;
    public static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    @BeforeAll
    public static void beforeAll() throws IOException {
        extent = ExtentReportManager.getReporter();
    }

    @AfterAll
    public static void afterAll() {
        if (extent != null) extent.flush();
    }

    @Before
    public void beforeScenario(Scenario scenario) {
        ExtentTest t = extent.createTest(scenario.getName());
        test.set(t);
        DriverFactory.initDriver();
    }

    @After
    public void afterScenario(Scenario scenario) {
        if (scenario.isFailed()) {
            String path = ScreenshotUtil.takeScreenshot("FAIL_" + scenario.getName().replace(" ", "_"));
            if (path != null) {
                test.get().addScreenCaptureFromPath(path);
            }
            byte[] shot = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(shot, "image/png", "failure");
        }
        DriverFactory.quitDriver();
    }
}
