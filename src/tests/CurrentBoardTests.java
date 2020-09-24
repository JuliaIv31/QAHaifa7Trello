package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CurrentBoardTests extends TestBase {


    @BeforeMethod
    public void initTests() throws InterruptedException {
            //Open login window
            WebElement loginIcon = driver.findElement(By.xpath("//*[@class='btn btn-sm btn-link text-white']"));
            loginIcon.click();
            waitUntilElementIsClickable (By.xpath(("//*[@class='btn btn-sm btn-link text-white']")), 10);
            // Enter login field for attlassian
            WebElement loginField = driver.findElement(By.id("user"));
            loginField.click();
            loginField.clear();
            loginField.sendKeys(LOGIN);
            waitUntilElementIsClickable(By.id("user"),10);
            //Submit login attlassian
            WebElement loginAttlButton = driver.findElement(By.id("login"));
            loginAttlButton.click();
            waitUntilElementIsClickable(By.id("login"),10);
            //Enter attlassian password and submit it
            WebElement passwordAttlField = driver.findElement(By.id("password"));
            passwordAttlField.click();
            passwordAttlField.clear();
            passwordAttlField.sendKeys(PASSWORD);
            driver.findElement(By.id("login-submit")).click();
            Thread.sleep(5000);
            //waitUntilElementIsClickable(By.id("password"), 50);
            //Open QA7Haifa board
            WebElement qa7HaifaBoard = driver.findElement(By
                    .xpath("//li[@class='boards-page-board-section-list-item'][.//div[@title ='QA Haifa7']]"));
            qa7HaifaBoard.click();
            Thread.sleep(15000);
        }


    @Test
    public void CreateListPositive() throws InterruptedException {

        //Printed quantity of lists before test
        System.out.println("Quantity of lists before: " + driver.findElements(By.xpath("//div[@class = 'list js-list-content']")).size());
        //Clicked on the add list button
        WebElement addListButton = driver.findElement(By.xpath("//span[@class='placeholder']"));
        addListButton.click();
        waitUntilElementIsClickable(By.xpath("//span[@class='placeholder']"),20);
        //Thread.sleep(3000);
        //Fill the name of new list and submit it
        WebElement nameListField = driver.findElement(By.xpath("//input[@name='name']"));
        nameListField.click();
        nameListField.clear();
        nameListField.sendKeys("test");
        waitUntilElementIsClickable(By.xpath("//input[@name='name']"),40);
        //Thread.sleep(3000);
        WebElement addList = driver.findElement(By.xpath("//input[@type='submit']"));
        addList.click();
        //Printed quantity of lists after test
        System.out.println("Quantity of lists after: " + driver.findElements(By.xpath("//div[@class = 'list js-list-content']")).size());
        waitUntilElementIsClickable(By.xpath("//div[@class = 'list js-list-content']"),40);
    }
    @Test
    public void ArchiveListPositive() throws InterruptedException {
        //Print the quantity of lists
        System.out.println("Lists quantity before: " + driver
                .findElements(By.xpath("//div[@class = 'list js-list-content']"))
                .size());
        //If there are no lists create the new list
        WebElement addListButton = driver.findElement(By.cssSelector("a.open-add-list"));
        System.out.println("Text on the button: " + addListButton.getText());
        if (addListButton.getText().equals("Add a list")){
            addListButton.click();
            //Fill the name of new list and submit it
            WebElement addNamelistField = driver.findElement(By.xpath("//input[@name='name']"));
            addNamelistField.click();
            addNamelistField.clear();
            addNamelistField.sendKeys("test");
            WebElement submitNewList = driver.findElement(By.xpath("//input[@type='submit']"));
            submitNewList.click();
            //Cancel the new adding list control
            WebElement xButton = driver.findElement(By.cssSelector("a.icon-close.dark-hover"));
            xButton.click();
            System.out.println("Lists quantity after adding the new list: " + driver
                    .findElements(By.xpath("//div[@class = 'list js-list-content']"))
                    .size());
        }
        Thread.sleep(2000);
        addListButton = driver.findElement(By.cssSelector("a.open-add-list"));
        System.out.println("Text on the button: " + addListButton.getText());
        //Open the extra menu for any list
        WebElement extraMenu = driver.findElement(By.cssSelector("a.list-header-extras-menu"));
        extraMenu.click();
        // Put the list to the archive
        WebElement closeExtraMenu = driver.findElement(By.cssSelector("a.js-close-list"));
        closeExtraMenu.click();
        //Print the quantity of lists
        System.out.println("Lists quantity at the end: " + driver
                .findElements(By.xpath("//div[@class = 'list js-list-content']"))
                .size());
    }


}
