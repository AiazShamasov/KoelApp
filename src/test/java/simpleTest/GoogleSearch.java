package simpleTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleSearch {
    @Test
    public void searchJavaGoogle_ResultReturned() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        Thread.sleep(5000);

        driver.quit();
    }
}
