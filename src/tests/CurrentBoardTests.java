package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CurrentBoardTests extends TestBase {


    @BeforeMethod
    public void initTests() throws InterruptedException {

        //Open login window
        WebElement loginIcon = driver.findElement(By.xpath("//a[@class='btn btn-sm btn-link text-white']"));
        loginIcon.click();
        Thread.sleep(10000);
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
        WebElement loginSubmitButton = driver.findElement(By.id("login-submit"));
        loginSubmitButton.click();
        Thread.sleep(20000);
        WebElement personalBoard = driver.findElement(By.xpath("//li[@class='boards-page-board-section-list-item'][.//div[@title ='QA Haifa7']]"));
        personalBoard.click();
        Thread.sleep(5000);
    }

    @Test
    public void CreateListPositive() throws InterruptedException {

        //Printed quantity of lists before test
        System.out.println("Quantity of lists before: " + driver.findElements(By.xpath("//div[@class='list js-list-content']")).size());
        //Clicked on the add list button
        WebElement addListButton = driver.findElement(By.xpath("//span[@class='placeholder']"));
        addListButton.click();
        Thread.sleep(3000);
        //Added name new list
        WebElement nameListField = driver.findElement(By.xpath("//input[@name='name']"));
        nameListField.click();
        nameListField.clear();
        nameListField.sendKeys("test");
        Thread.sleep(3000);
        //Created new List
        WebElement addList = driver.findElement(By.xpath("//input[@class='primary mod-list-add-button js-save-edit']"));
        addList.click();
        //Printed quantity of lists after test
        System.out.println("Quantity of lists after: " + driver.findElements(By.xpath("//div[@class='list js-list-content']")).size());
        Thread.sleep(3000);
    }
    @Test
    public void ArchiveListPositive() throws InterruptedException {
        //Printed quantity of lists before test
        System.out.println("Quantity of lists before: " + driver.findElements(By.xpath("//div[@class='list js-list-content']")).size());
        //Clicked on the add list button
        WebElement addListButton = driver.findElement(By.xpath("//span[@class='placeholder']"));
        addListButton.click();
        Thread.sleep(3000);
        //Added name new list
        WebElement nameListField = driver.findElement(By.xpath("//input[@name='name']"));
        nameListField.click();
        nameListField.clear();
        nameListField.sendKeys("test1");
        Thread.sleep(3000);
        //Created new List
        WebElement addList = driver.findElement(By.xpath("//input[@class='primary mod-list-add-button js-save-edit']"));
        addList.click();
        //Clicked on the ListMenu
        WebElement listActionMenu = driver.findElement(By.xpath("//div[@id='board']//div[2]//div[1]//div[1]//div[2]//a[1]"));
        listActionMenu.click();
        Thread.sleep(3000);
        //Clicked on line Archive This List
        WebElement archiveList = driver.findElement(By.xpath("//a[@class='js-close-list']"));
        archiveList.click();
        //Printed quantity of lists after test
        System.out.println("Quantity of lists after: " + driver.findElements(By.xpath("//div[@class='list js-list-content']")).size());
        Thread.sleep(3000);
    }


}
