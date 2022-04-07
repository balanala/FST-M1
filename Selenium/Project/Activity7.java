package seleniumProjectActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;


public class Activity7 {
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
    public void infoMenu() {

        //UserName
        WebElement usernameText = driver.findElement(By.id("txtUsername"));

        //Password
        WebElement passwordText = driver.findElement(By.id("txtPassword"));

        //Login
        WebElement BtnLogin = driver.findElement(By.id("btnLogin"));

        usernameText.sendKeys("orange");
        passwordText.sendKeys("orangepassword123");
        BtnLogin.click();

        //click the Info Menu
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();

        //click the Qualifications menu
        driver.findElement(By.xpath("(//a[text()='Qualifications'])[2]")).click();

        //click on Add button
        driver.findElement(By.id("addWorkExperience")).click();

        //Add Work Experience
        driver.findElement(By.id("experience_employer")).sendKeys("IBM");
        driver.findElement(By.id("experience_jobtitle")).sendKeys("Test Specialist");
        driver.findElement(By.id("experience_from_date")).clear();
        driver.findElement(By.id("experience_from_date")).sendKeys("Test Specialist");
        driver.findElement(By.id("experience_comments")).sendKeys("Test");

        //click on Save
        driver.findElement(By.id("btnWorkExpSave")).click();
    }
    @AfterMethod
    public void afterMethod() {
        //Close the browser
        //driver.quit();
    }
    }

