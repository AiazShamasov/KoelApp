package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class MainPage extends BasePage{
    public MainPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getCreatePlaylistButton(){
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[title=\"Create a new playlist\"]")));
        return driver.findElement(By.cssSelector("[title=\"Create a new playlist\"]"));
    }

    public WebElement getNewPlaylistButton(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[.=\"New Playlist\"]")));
        return driver.findElement(By.xpath("//*[.=\"New Playlist\"]"));
    }
    private WebElement getEditPlaylistField(String playlistId) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@href='#!/playlist/" + playlistId + "']/following-sibling::input")));
        return driver.findElement(By.xpath("//*[@type='text']"));
    }

    public WebElement getNewPlaylistNameField(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@placeholder, 'to save')]")));
        return driver.findElement(By.xpath("//*[contains(@placeholder, 'to save')]"));
    }


    public boolean isLogoutButton(){
        try{
            wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".logout")));
        } catch (TimeoutException err) {
            return false;
        }
        return true;
    }
    public String createPlaylist(String name){
        getCreatePlaylistButton().click();
        getNewPlaylistButton().click();
        getNewPlaylistNameField().sendKeys(name);
        getNewPlaylistNameField().sendKeys(Keys.ENTER);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@class='success show']")));

        return driver.getCurrentUrl().split("/")[5];
    }

    public boolean isPlaylistExist(String playlistId){
        List<WebElement> list = driver.findElements(By.xpath("//*[@href='#!/playlist/"+playlistId+"']"));
        return list.size() > 0;
    }

    public void renamePlaylist(String playlistId, String newName) {
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[@href='#!/playlist/"+playlistId+"']")));
        WebElement playlist = driver.findElement(By.xpath("//*[@href='#!/playlist/"+playlistId+"']"));

        jsExecutor.executeScript ("arguments[0].scrollIntoView();",playlist);
        Actions actions = new Actions(driver);
        actions.doubleClick(playlist).perform();
        actions.doubleClick(getEditPlaylistField(playlistId)).perform();



        //// "//*[@class='playlist playlist editing']/input"
//        driver.findElement(By.xpath("//*[@class='playlist playlist editing']/input"));
//        WebElement editPlaylistField = driver.findElement(By.xpath("//*[@class='playlist playlist editing']/input"));

//        getEditPlaylistField(playlistId).sendKeys(Keys.CONTROL+"a");
        getEditPlaylistField(playlistId).sendKeys(newName);
        getEditPlaylistField(playlistId).sendKeys(Keys.ENTER);
    }
}
