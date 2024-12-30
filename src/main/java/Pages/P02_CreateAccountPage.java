package Pages;

import Utilities.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class P02_CreateAccountPage {
    private final WebDriver driver;
    By firstNameLocator = By.id("firstname");
    By lastNameLocator = By.id("lastname");
    By emailLocator = By.id("email_address");
    By passwordLocator = By.xpath("(//input[@class='input-text'])[3]");
    By confirmPasswordLocator = By.id("password-confirmation");
    By createAccountButton = By.xpath("(//div[@class='primary'] /button[contains(@class,'action')])[1]");


    public P02_CreateAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public P02_CreateAccountPage enterFirstName() {
        Util.enterData(driver,firstNameLocator,"Ibrahim");
        return this;
    }

    public P02_CreateAccountPage enterLastName() {
        Util.enterData(driver,lastNameLocator,"Deif");
        return this;
    }

    public P02_CreateAccountPage enterEmail() {
        Util.enterData(driver,emailLocator,"decaja4621@pixdd.com");
        return this;
    }

    public P02_CreateAccountPage enterPassword() {
        Util.enterData(driver,passwordLocator,"Test@1234");
        return this;
    }

    public P02_CreateAccountPage enterConfirmationPassword() throws InterruptedException {
        try {
            Util.enterData(driver, confirmPasswordLocator, "Test@1234");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return this;
    }

    public P02_CreateAccountPage clickOnCreteAccountButton() {
        Util.clickOnElement(driver,createAccountButton);
        return this;
    }
}
