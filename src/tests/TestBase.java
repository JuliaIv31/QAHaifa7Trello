package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class TestBase {
    public static final String LOGIN = "taro.julyena@gmail.com";
    public static final String PASSWORD = "FJcQz8_h";
    WebDriver driver;

    @BeforeMethod
    public void StartApp1() throws InterruptedException {

        //Driver initialization. Open Trello application.
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--lang=" + "en");
        driver = new ChromeDriver(options);
        driver.get("https://trello.com/");
        Thread.sleep(10000);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
