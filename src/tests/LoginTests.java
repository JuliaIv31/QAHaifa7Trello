package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @BeforeMethod
    public void initTests() throws InterruptedException {

        //Open login window
        WebElement loginIcon = driver.findElement(By.
                xpath("//a[@class='btn btn-sm btn-link text-white']"));
        loginIcon.click();
        //Thread.sleep(10000);
    }

    @Test
    public void loginNegativeLoginEmpty() throws InterruptedException {
        //Enter empty login and password
        waitUntilElementIsClickable(By.id("password"),15);
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.click();
        passwordField.clear();
        passwordField.sendKeys(PASSWORD);
        //Thread.sleep(10000);
        //Press loginButton
        waitUntilElementIsClickable(By.id("login"),10);
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
        //Thread.sleep(10000);
        //Print error message
        System.out.println("Error: "+driver.findElement(By.id("error")).getText());

    }
        @Test
        public void loginNegativeWrongPassword(){
        // throws InterruptedException
        //Enter wrong login and password
        WebElement loginUser = driver.findElement(By.xpath("//input[@id='user']"));
        loginUser.click();
        loginUser.sendKeys(LOGIN);
        waitUntilElementIsClickable(By.id("user"),10);
        //Press loginButton
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
        waitUntilElementIsClickable(By.id("login"),10);
        //Thread.sleep(5000);
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.click();
        passwordField.clear();
        passwordField.sendKeys("sdkfjd3");
        waitUntilElementIsClickable(By.id("password"),20);
        //Thread.sleep(5000);
        //Clicked loginSubmintButton
        WebElement loginSubmintButton = driver.findElement(By.xpath("//button[@id='login-submit']//span[@class='css-t5emrf']"));
        loginSubmintButton.click();
        waitUntilElementIsClickable(By.xpath("//button[@id='login-submit']//span[@class='css-t5emrf']"),20);
        //Thread.sleep(10000);
        //Print error message
        waitUntilElementIsClickable(By.xpath("'//span[contains(text(),'.')]'"),40);
        System.out.println("Error: "+driver.findElement(By.xpath("//span[contains(text(),'.')]")).getText());
        //Thread.sleep(10000);

    }
    @Test
    public  void loginNegative(){
    //throws InterruptedException
        //Enter wrong login and password
        WebElement loginUser = driver.findElement(By.xpath("//input[@id='user']"));
        loginUser.click();
        loginUser.sendKeys("taro@gmail.com");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.click();
        passwordField.clear();
        passwordField.sendKeys("z8_hlk");
        // Clicked loginButton
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
        waitUntilElementIsClickable(By.id("login"),10);
        //Thread.sleep(2000);
        //Print error message
        System.out.println("Error: "+driver.findElement(By.xpath("//div[@id='error']//p[@class='error-message']")).getText());

    }
    @Test
    public void loginPositive(){
        //throws InterruptedException
        //Enter login and password
        waitUntilElementIsClickable(By.id("user"),15);
        WebElement loginUserField = driver.findElement(By.xpath("//input[@id='user']"));
        loginUserField.click();
        loginUserField.clear();
        loginUserField.sendKeys(LOGIN);
        //Thread.sleep(10000);
        //Press loginButton
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
        waitUntilElementIsClickable(By.id("login"),10);
        //Thread.sleep(10000);
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.click();
        passwordField.clear();
        passwordField.sendKeys(PASSWORD);
        waitUntilElementIsClickable(By.id("password"),20);
        //Thread.sleep(10000);
        //Click loginSubmitButton
        WebElement loginSubmitButton = driver.findElement(By.id("login-submit"));
        loginSubmitButton.click();
        waitUntilElementIsClickable(By.id("login-submit"),40);
        //Thread.sleep(20000);
        //Print name button Boards
        waitUntilElementIsClickable(By.className("MEu8ZECLGMLeab"),50);
        System.out.println("Button: " +driver.findElement(By.className("MEu8ZECLGMLeab")).getText());
        //Thread.sleep(20000);

    }




}
