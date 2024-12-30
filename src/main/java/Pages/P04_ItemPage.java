package Pages;

import Utilities.Util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class P04_ItemPage {
    private final WebDriver driver;


    By firstProductColorLocator = By.id("option-label-color-93-item-52");
    By secondProductColorLocator = By.id("option-label-color-93-item-52");
    By fistProductSizeLocator = By.id("option-label-size-143-item-168");
    By secondProductSizeLocator = By.id("option-label-size-143-item-169");
    By addToCartButtonLocator = By.id("product-addtocart-button");
    By secondProductLocator = By.xpath("(//div[@class='product-item-info'])[4]");


    public P04_ItemPage(WebDriver driver) {
        this.driver = driver;
    }


    public P04_ItemPage addFirstProductToCart() throws InterruptedException {
        Util.clickOnElement(driver,fistProductSizeLocator);
        Util.clickOnElement(driver, firstProductColorLocator);
        Util.clickOnElement(driver,addToCartButtonLocator);
        Thread.sleep(5000);

        return this;
    }

    public P04_ItemPage addSecondProductToCart() throws InterruptedException {
        Util.clickOnElement(driver,secondProductSizeLocator);
        Util.clickOnElement(driver, secondProductColorLocator);
        Util.clickOnElement(driver,addToCartButtonLocator);
        Thread.sleep(5000);

        return this;
    }
}
