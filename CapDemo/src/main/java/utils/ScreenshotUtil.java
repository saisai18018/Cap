package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtil {

    public static String takeScreenshot(String namePrefix) {
        try {
            File src = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
            String ts = new SimpleDateFormat("yyyyMMdd_HHmmss_SSS").format(new Date());
            String path = "reports/Screenshots/" + namePrefix + "_" + ts + ".png";
            File dest = new File(path);
            dest.getParentFile().mkdirs();
            FileUtils.copyFile(src, dest);
            return path;
        } catch (Exception e) {
            return null;
        }
    }
}
