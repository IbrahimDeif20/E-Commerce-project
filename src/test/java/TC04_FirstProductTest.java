import Listeners.IInvokeMethodListenerClass;
import Listeners.ITestResultListenerClass;
import Pages.P01_HomePage;
import Pages.P04_ItemPage;
import Utilities.LogUtils;
import Utilities.Util;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;
@Listeners({IInvokeMethodListenerClass.class , ITestResultListenerClass.class})
public class TC04_FirstProductTest {
    WebDriver driver;
    By cartNumberLocator = By.className("counter-number");

    @BeforeMethod
    public void setUpBrowser(){
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test
    public void addFirstProductToCartTC() throws InterruptedException {
        new P01_HomePage(driver).signInTab().signIn();
        new P01_HomePage(driver).selectFirstProduct();
        new P04_ItemPage(driver).addFirstProductToCart();
        LogUtils.info("The number of products in cart is " + Util.getText(driver,cartNumberLocator));
        Assert.assertEquals(Util.getText(driver,cartNumberLocator),"1");
    }

    @Test
    public void addSecondProductToCartTC() throws InterruptedException {
        new P01_HomePage(driver).signInTab().signIn();
        new P01_HomePage(driver).selectSecondProduct();
        new P04_ItemPage(driver).addSecondProductToCart();
        LogUtils.info("The number of products in cart is " + Util.getText(driver,cartNumberLocator));
        Assert.assertEquals(Util.getText(driver,cartNumberLocator),"2");
    }


    @AfterMethod
    public void quit(){
        driver.quit();
    }
}
