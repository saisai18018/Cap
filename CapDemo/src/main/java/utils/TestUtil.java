package utils;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestUtil {
    public static WebElement waitForVisible(By locator, int sec) {
        return new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(sec))
                .until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static WebElement waitForClickable(By locator, int sec) {
        return new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(sec))
                .until(ExpectedConditions.elementToBeClickable(locator));
    }

    public static void safeClick(By locator) {
        waitForClickable(locator, 10).click();
    }

    public static void type(By locator, String text) {
        WebElement e = waitForVisible(locator, 10);
        e.clear();
        e.sendKeys(text);
    }

    public static boolean isPresent(By locator) {
        try {
            DriverFactory.getDriver().findElement(locator);
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }
}
