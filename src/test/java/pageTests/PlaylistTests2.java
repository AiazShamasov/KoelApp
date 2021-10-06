package pageTests;

import helper.TestDataGenerator;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoignPage;
import pageObjects.MainPage;


public class PlaylistTests2 extends BaseTest{
    @Test
    public void createPlaylistTestx() {
        String name = TestDataGenerator.randomString(8);
        LoignPage loginPage = new LoignPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn("koeluser06@testpro.io","te$t$tudent");
        String playlistId = mainPage.createPlaylist(name);
        Assert.assertTrue(mainPage.isPlaylistExist(playlistId));
     }
    @Test
    public void renamePlaylistTestx() {
        String name = TestDataGenerator.randomString(8);
        LoignPage loginPage = new LoignPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn("koeluser06@testpro.io","te$t$tudent");
        String playlistId = mainPage.createPlaylist(name);

        String newName = TestDataGenerator.randomString(8);
        mainPage.renamePlaylist(playlistId, newName);

        Assert.assertTrue(mainPage.isPlaylistExist(playlistId));
    }
    @Test
    public void createPlaylistTest2x() {
        String name = TestDataGenerator.randomString(8);
        LoignPage loginPage = new LoignPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn("koeluser06@testpro.io","te$t$tudent");
        String playlistId = mainPage.createPlaylist(name);
        Assert.assertTrue(mainPage.isPlaylistExist(playlistId));
    }
    @Test
    public void renamePlaylistTest2x() {
        String name = TestDataGenerator.randomString(8);
        LoignPage loginPage = new LoignPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn("koeluser06@testpro.io","te$t$tudent");
        String playlistId = mainPage.createPlaylist(name);

        String newName = TestDataGenerator.randomString(8);
        mainPage.renamePlaylist(playlistId, newName);

        Assert.assertTrue(mainPage.isPlaylistExist(playlistId));
    }
}
