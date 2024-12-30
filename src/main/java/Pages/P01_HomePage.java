package Pages;

import Utilities.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P01_HomePage {
    WebDriver driver;
    By createAccountLocator = By.linkText("Create an Account");
    By signInLocator = By.xpath("/html/body/div[2]/header/div[1]/div/ul/li[2]/a");
    By hotSellerLocator = By.xpath("//h2[@class='title']");
    By firstProductLocator = By.xpath("(//div[@class='product-item-info'])[3]");
    By secondProductLocator = By.xpath("(//div[@class='product-item-info'])[4]");

    public P01_HomePage(WebDriver driver){
        this.driver = driver;
    }

    public P02_CreateAccountPage clickOnCreateAccount(){
        Util.clickOnElement(driver,createAccountLocator);
        return new P02_CreateAccountPage(driver);
    }

    public P03_SignInPage signInTab(){
        Util.clickOnElement(driver,signInLocator);
        return new P03_SignInPage(driver);
    }

    public P01_HomePage scrollToHotSellers(){
        Util.scrollingUsingJS(driver,hotSellerLocator);
        return this;
    }

    public P04_ItemPage selectFirstProduct(){
        Util.clickOnElement(driver,firstProductLocator);
        return new P04_ItemPage(driver);
    }

    public P04_ItemPage selectSecondProduct(){
        Util.clickOnElement(driver,secondProductLocator);
        return new P04_ItemPage(driver);
    }



}
