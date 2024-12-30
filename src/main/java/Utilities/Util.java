package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Util {

    public static void enterData(WebDriver driver, By locator, String Text) {
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOfElementLocated(locator));
        driver.findElement(locator).sendKeys(Text);
    }

    public static void clickOnElement(WebDriver driver, By locator) {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(locator));
        driver.findElement(locator).click();
    }

    public static WebElement bytoWebElement(WebDriver driver, By locator) {
        return driver.findElement(locator);
    }

    public static void scrollingUsingJS(WebDriver driver, By locator){
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();",bytoWebElement(driver,locator)) ;
    }

    public static void hover(WebDriver driver, By locator){
        new Actions(driver).moveToElement(bytoWebElement(driver,locator)).perform();
    }

    public static String getText(WebDriver driver, By locator) {
        new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOfElementLocated(locator));
        return driver.findElement(locator).getText();
    }
    public static WebDriverWait generalWait(WebDriver driver) {
        return new WebDriverWait(driver, Duration.ofSeconds(10));
    }
}