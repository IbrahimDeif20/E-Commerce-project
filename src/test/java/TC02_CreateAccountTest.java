import Pages.P01_HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TC02_CreateAccountTest {
    WebDriver driver;
    @BeforeMethod
    public void setUpBrowser(){
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @Test
    public void createAccountTC() throws InterruptedException {
        new P01_HomePage(driver).clickOnCreateAccount()
                .enterFirstName().enterLastName().enterEmail()
                .enterPassword().enterConfirmationPassword().clickOnCreteAccountButton();

        Assert.assertEquals(driver.getCurrentUrl(),"https://magento.softwaretestingboard.com/customer/account/");
    }



    @AfterMethod
    public void quit(){
        driver.quit();
    }
}
