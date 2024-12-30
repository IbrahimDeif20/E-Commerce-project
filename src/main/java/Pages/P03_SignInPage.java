package Pages;

import Utilities.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P03_SignInPage {
    private final WebDriver driver;
    By emailLocator = By.id("email");
    By passwordLocator = By.name("login[password]");
    By signInButtonLocator = By.xpath("//button[contains(@class,'primary')]");

    public P03_SignInPage(WebDriver driver) {
        this.driver = driver;
    }

    public P03_SignInPage signIn(){
        Util.enterData(driver,emailLocator,"decaja4621@pixdd.com");
        Util.enterData(driver,passwordLocator,"Test@1234");
        Util.clickOnElement(driver,signInButtonLocator);
        //https://magento.softwaretestingboard.com/customer/account/index/
        return new P03_SignInPage(driver);
    }
}
