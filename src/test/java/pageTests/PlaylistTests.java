package pageTests;

import helper.TestDataGenerator;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LoignPage;
import pageObjects.MainPage;


public class PlaylistTests extends BaseTest{
    @Test
    public void createPlaylistTest() {
        String name = TestDataGenerator.randomString(8);
        LoignPage loginPage = new LoignPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn(username,password);
        String playlistId = mainPage.createPlaylist(name);
        Assert.assertTrue(mainPage.isPlaylistExist(playlistId));
     }
    @Test
    public void renamePlaylistTest() {
        String name = TestDataGenerator.randomString(8);
        LoignPage loginPage = new LoignPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn(username,password);
        String playlistId = mainPage.createPlaylist(name);

        String newName = TestDataGenerator.randomString(8);
        mainPage.renamePlaylist(playlistId, newName);

        Assert.assertTrue(mainPage.isPlaylistExist(playlistId));
    }
    @Test
    public void createPlaylistTest2() {
        String name = TestDataGenerator.randomString(8);
        LoignPage loginPage = new LoignPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn(username,password);
        String playlistId = mainPage.createPlaylist(name);
        Assert.assertTrue(mainPage.isPlaylistExist(playlistId));
    }
    @Test
    public void renamePlaylistTest2() {
        String name = TestDataGenerator.randomString(8);
        LoignPage loginPage = new LoignPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn(username,password);
        String playlistId = mainPage.createPlaylist(name);

        String newName = TestDataGenerator.randomString(8);
        mainPage.renamePlaylist(playlistId, newName);

        Assert.assertTrue(mainPage.isPlaylistExist(playlistId));
        
    }
}
