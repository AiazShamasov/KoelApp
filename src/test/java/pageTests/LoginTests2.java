package pageTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoignPage;
import pageObjects.MainPage;

public class LoginTests2 extends BaseTest{
    @Test
    public void loginTestx(){
        LoignPage loginPage = new LoignPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn("koeluser06@testpro.io","te$t$tudent");
        Assert.assertTrue(mainPage.isLogoutButton());
    }
    @Test
    public void wrongLoginTestx(){
        LoignPage loginPage = new LoignPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn("koeluser06@testpro.io","xxxxxx");
        Assert.assertFalse(mainPage.isLogoutButton());
        }
    @Test
    public void loginTest1x(){
        LoignPage loginPage = new LoignPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn("koeluser06@testpro.io","te$t$tudent");
        Assert.assertTrue(mainPage.isLogoutButton());
    }
    @Test
    public void wrongLoginTest1x(){
        LoignPage loginPage = new LoignPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn("koeluser06@testpro.io","xxxxxx");
        Assert.assertFalse(mainPage.isLogoutButton());
    }
    @Test
    public void loginTest2x(){
        LoignPage loginPage = new LoignPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn("koeluser06@testpro.io","te$t$tudent");
        Assert.assertTrue(mainPage.isLogoutButton());
    }
    @Test
    public void wrongLoginTest2x(){
        LoignPage loginPage = new LoignPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn("koeluser06@testpro.io","xxxxxx");
        Assert.assertFalse(mainPage.isLogoutButton());
    }
}
