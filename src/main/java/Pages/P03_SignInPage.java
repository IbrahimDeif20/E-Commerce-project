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
        Util.enterData(driver,emailLocator,"ibrahim.deif123@gmail.com");
        Util.enterData(driver,passwordLocator,"01115536961iI@");
        Util.clickOnElement(driver,signInButtonLocator);
        //https://magento.softwaretestingboard.com/customer/account/index/
        return new P03_SignInPage(driver);
    }
}
