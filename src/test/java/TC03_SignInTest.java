import Pages.P01_HomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;

public class TC03_SignInTest {
    WebDriver driver;

    @BeforeMethod
    public void setUpBrowser(){
        driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }

    @Test
    public void signInTC(){
        new P01_HomePage(driver).signInTab().signIn();
        Assert.assertEquals(driver.getCurrentUrl(),"https://magento.softwaretestingboard.com/");
    }


    @AfterMethod
    public void quit(){
        driver.quit();
    }
}
