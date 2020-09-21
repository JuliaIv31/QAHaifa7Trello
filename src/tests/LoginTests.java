package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @BeforeMethod
    public void initTests() throws InterruptedException {

        //Open login window
        WebElement loginIcon = driver.findElement(By.xpath("//a[@class='btn btn-sm btn-link text-white']"));
        loginIcon.click();
        Thread.sleep(10000);
    }

    @Test
    public void loginNegativeLoginEmpty() throws InterruptedException {
        //Enter empty login and password
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.click();
        passwordField.clear();
        passwordField.sendKeys(PASSWORD);
        Thread.sleep(10000);
        //Press loginButton
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
        Thread.sleep(10000);
        //Print error message
        System.out.println("Error: "+driver.findElement(By.id("error")).getText());

    }
        @Test
        public void loginNegativeWrongPassword() throws InterruptedException{
        WebElement loginUser = driver.findElement(By.xpath("//input[@id='user']"));
        loginUser.click();
        loginUser.sendKeys(LOGIN);
        Thread.sleep(5000);
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
        Thread.sleep(5000);
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.click();
        passwordField.clear();
        passwordField.sendKeys("sdkfjd3");
        Thread.sleep(5000);
        WebElement loginSubmintButton = driver.findElement(By.xpath("//button[@id='login-submit']//span[@class='css-t5emrf']"));
        loginSubmintButton.click();
        Thread.sleep(10000);
        System.out.println("Error: "+driver.findElement(By.xpath("//span[contains(text(),'.')]")).getText());
        Thread.sleep(10000);

    }
    @Test
    public  void loginNegative() throws InterruptedException {
        WebElement loginUser = driver.findElement(By.xpath("//input[@id='user']"));
        loginUser.click();
        loginUser.sendKeys("taro@gmail.com");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.click();
        passwordField.clear();
        passwordField.sendKeys("z8_hlk");
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
        Thread.sleep(2000);
        System.out.println("Error: "+driver.findElement(By.xpath("//div[@id='error']//p[@class='error-message']")).getText());

    }
    @Test
    public void loginPositive() throws InterruptedException {
        WebElement loginUserField = driver.findElement(By.xpath("//input[@id='user']"));
        loginUserField.click();
        loginUserField.clear();
        loginUserField.sendKeys(LOGIN);
        Thread.sleep(10000);
        WebElement loginButton = driver.findElement(By.id("login"));
        loginButton.click();
        Thread.sleep(10000);
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.click();
        passwordField.clear();
        passwordField.sendKeys(PASSWORD);
        Thread.sleep(10000);
        //WebElement loginSubmitButton = driver.findElement(By.xpath("//button[@id='login-submit']//span[@class='css-t5emrf']"));
        WebElement loginSubmitButton = driver.findElement(By.id("login-submit"));
        loginSubmitButton.click();
        Thread.sleep(20000);
        System.out.println("Button: " +driver.findElement(By.className("MEu8ZECLGMLeab")).getText());
        Thread.sleep(20000);

    }


}