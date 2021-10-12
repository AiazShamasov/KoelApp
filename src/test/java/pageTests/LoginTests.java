package pageTests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoignPage;
import pageObjects.MainPage;

public class LoginTests extends BaseTest{
    @Test
    public void loginTest(){
        LoignPage loginPage = new LoignPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn(username,password+"1");
        Assert.assertTrue(mainPage.isLogoutButton());
    }
    @Test(enabled = false)
    // TODO Update later
    public void wrongLoginTest(){
        LoignPage loginPage = new LoignPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn("koeluser06@testpro.io","xxxxxx");
        Assert.assertFalse(mainPage.isLogoutButton());
        }
    @Test
    public void loginTest1(){
        LoignPage loginPage = new LoignPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn(username,password);
        Assert.assertTrue(mainPage.isLogoutButton());
    }
    @Test
    public void wrongLoginTest1(){
        LoignPage loginPage = new LoignPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn("koeluser06@testpro.io","xxxxxx");
        Assert.assertFalse(mainPage.isLogoutButton());
    }
    @Test
    public void loginTest2(){
        LoignPage loginPage = new LoignPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn(username,password);
        Assert.assertTrue(mainPage.isLogoutButton());
    }
    @Test
    public void wrongLoginTest2(){
        LoignPage loginPage = new LoignPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn("koeluser06@testpro.io","xxxxxx");
        Assert.assertFalse(mainPage.isLogoutButton());
    }
}
