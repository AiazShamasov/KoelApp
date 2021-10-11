package pageTests;

import helper.TestDataGenerator;
import listeners.RetryAnalyzer;
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
        MainPage mainPage = loginPage.logIn(username,password);
        String playlistId = mainPage.createPlaylist(name);
        Assert.assertTrue(mainPage.isPlaylistExist(playlistId));
     }
    @Test
    public void renamePlaylistTestx() {
        String name = TestDataGenerator.randomString(8);
        LoignPage loginPage = new LoignPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn(username,password);
        String playlistId = mainPage.createPlaylist(name);

        String newName = TestDataGenerator.randomString(8);
        mainPage.renamePlaylist(playlistId, newName);

        Assert.assertTrue(mainPage.isPlaylistExist(playlistId));
    }
    @Test(retryAnalyzer = RetryAnalyzer.class)
    public void createPlaylistTest2x() {
        String name = TestDataGenerator.randomString(8);
        LoignPage loginPage = new LoignPage(driver);
        loginPage.open();
        MainPage mainPage = loginPage.logIn(username,password);
        String playlistId = mainPage.createPlaylist(name);
        boolean xx = false;
        if(tt==2){
            xx=true;
        }
        tt++;
        Assert.assertTrue(xx);
    }
    @Test
    public void renamePlaylistTest2x() {
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
