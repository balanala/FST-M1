package seleniumProjectActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;


public class Activity6 {
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
    public void directoryMenu() {

        //UserName
        WebElement usernameText = driver.findElement(By.id("txtUsername"));

        //Password
        WebElement passwordText = driver.findElement(By.id("txtPassword"));

        //Login
        WebElement BtnLogin = driver.findElement(By.id("btnLogin"));

        usernameText.sendKeys("orange");
        passwordText.sendKeys("orangepassword123");
        BtnLogin.click();

        //Locate the Directory Menu
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        String menuTxt = driver.findElement(By.id("menu_directory_viewDirectory")).getText();
        Assert.assertEquals("Directory", menuTxt);
        JavascriptExecutor ex=(JavascriptExecutor)driver;
        ex.executeScript("arguments[0].click()", driver.findElement(By.id("menu_directory_viewDirectory")));

        //click the Directory Menu
        driver.findElement(By.id("menu_directory_viewDirectory")).click();

        //verify the Heading of the Page
        String pageHeading = driver.findElement(By.xpath("//div[@class='head']//h1")).getText();
        Assert.assertEquals("Search Directory", pageHeading);
    }
    @AfterMethod
    public void afterMethod() {
        //Close the browser
        //driver.quit();
    }
    }

