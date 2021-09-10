package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoignPage extends BasePage{

    public LoignPage(WebDriver driver) {
        super(driver);
    }

    private WebElement getEmail(){
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[type=\"email\"]")));
        return driver.findElement(By.cssSelector("[type=\"email\"]"));
    }

    private WebElement getPassword(){
        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[type=\"password\"]")));
        return driver.findElement(By.cssSelector("[type=\"password\"]"));
    }

    private WebElement getLoginButton(){
        return driver.findElement(By.tagName("button"));
    }

    public void open() {
        driver.get("https://bbb.testpro.io/");
    }

    public MainPage logIn(String email, String password) {
        getEmail().sendKeys(email);
        getPassword().sendKeys(password);
        getLoginButton().click();
        return new MainPage(driver);

    }
}
