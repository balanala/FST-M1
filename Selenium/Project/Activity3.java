package seleniumProjectActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Activity3 {
    //public static void main(String args[]) {

    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        //Create a new instance of the Firefox driver
        driver = new FirefoxDriver();

        //Open browser
        driver.get("http://alchemy.hguy.co/orangehrm");
    }
    @Test
    public void verifyHomePage() {

        //UserName
        WebElement usernameText =  driver.findElement(By.id("txtUsername"));

        //Password
        WebElement passwordText =  driver.findElement(By.id("txtPassword"));

        //Login
        WebElement BtnLogin =  driver.findElement(By.id("btnLogin"));

        usernameText.sendKeys("orange");
        passwordText.sendKeys("orangepassword123");
        BtnLogin.click();

        //Page Title
        String pageTitle = driver.getTitle();

        //Print the Page Title
        System.out.println("Page Title is: " +pageTitle);

        //Assertion for page title
        Assert.assertEquals("OrangeHRM", pageTitle);
    }
    @AfterMethod
    public void afterMethod() {
        //Close the browser
        //driver.quit();
    }
    }

