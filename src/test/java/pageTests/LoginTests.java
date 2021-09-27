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
        MainPage mainPage = loginPage.logIn("koeluser06@testpro.io","te$t$tudent");
        Assert.assertTrue(mainPage.isLogoutButton());
    }
}
