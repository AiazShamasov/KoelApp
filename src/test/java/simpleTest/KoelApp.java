package simpleTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KoelApp {
    private WebDriver driver;
    private WebDriverWait wait;
    @BeforeMethod
    public void startUp(){
        System.setProperty("webdriver.chrome.driver","chromedriver");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,10);
        driver.get("https://bbb.testpro.io/");
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void loginKoel() throws InterruptedException {
        WebElement email =  driver.findElement(By.cssSelector("[type=\"email\"]"));
        WebElement password = driver.findElement(By.cssSelector("[type=\"password\"]"));
        WebElement loginButton = driver.findElement(By.tagName("button"));

        email.sendKeys("koeluser06@testpro.io");
        password.sendKeys("te$t$tudent");
        loginButton.click();
        Thread.sleep(5000);

    }
}
