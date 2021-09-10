package pageTests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageObjects.LoignPage;
import pageObjects.MainPage;

public class LoginTests {
    private WebDriver driver;
    @BeforeMethod
    public void starUp(){
        System.setProperty("webdriver.chrome.driver","chromedriver");
        driver = new ChromeDriver();
    }
    @AfterMethod
    public void tearDown() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();
    }
    @Test
    public void loginTest(){
        LoignPage loginPage = new LoignPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn("koeluser06@testpro.io","te$t$tudent");
        Assert.assertTrue(mainPage.isLogoutButton());
    }
}
