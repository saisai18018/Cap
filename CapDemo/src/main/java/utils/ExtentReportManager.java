package utils;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {
    private static ExtentReports extent;

    public static ExtentReports getReporter() throws IOException {
        if (extent == null)
			try {
				{
				    String reportPath = "reports/ExtentReports/index.html";
				    ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
				    spark.loadXMLConfig("src/test/resources/extent-config.xml");
				    extent = new ExtentReports();
				    extent.attachReporter(spark);
				    extent.setSystemInfo("Project", "nopCommerce Automation");
				    extent.setSystemInfo("Browser", ConfigReader.get("browser"));
				    extent.setSystemInfo("Base URL", ConfigReader.get("baseUrl"));
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        return extent;
    }
}
