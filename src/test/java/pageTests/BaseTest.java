package pageTests;

import enums.BrowserType;
import helper.BrowserFabric;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseTest {
    protected WebDriver driver;
    protected String username;
    protected String password;
    int tt=0;

    @Parameters({"username","password"})
    @BeforeMethod
    public void starUp(String email, String password) throws NoSuchMethodException {
        username = email;
        this.password = password;
        driver = BrowserFabric.getDriver(BrowserType.CHROME);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
}
