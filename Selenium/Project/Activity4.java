package seleniumProjectActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.NoSuchElementException;

import static java.util.concurrent.TimeUnit.SECONDS;


public class Activity4 {
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
    public void verifyEmployee() {

        //UserName
        WebElement usernameText = driver.findElement(By.id("txtUsername"));

        //Password
        WebElement passwordText = driver.findElement(By.id("txtPassword"));

        //Login
        WebElement BtnLogin = driver.findElement(By.id("btnLogin"));

        usernameText.sendKeys("orange");
        passwordText.sendKeys("orangepassword123");
        BtnLogin.click();

        //click the PIM Menu
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.id("menu_pim_viewPimModule")).click();

        //click the Add button
        WebElement BtnAdd = driver.findElement(By.id("btnAdd"));
        BtnAdd.click();

        //Fill the required fields
        driver.findElement(By.id("firstName")).sendKeys("Bala");
        driver.findElement(By.id("lastName")).sendKeys("Nala");

        //click on Save
        driver.findElement(By.id("btnSave")).click();

        WebElement empId = driver.findElement(By.id("personal_txtEmployeeId"));
        String empIdTxt = empId.getAttribute("value");

        new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']")).click();

        driver.findElement(By.id("empsearch_id")).sendKeys(empIdTxt);
        driver.findElement(By.id("searchBtn")).click();

        //Verify the Employee presence
      String empIdTable = driver.findElement(By.xpath("//a[text()='"+empIdTxt+"']")).getText();

        //Assertion for Employee Record
        Assert.assertEquals(empIdTxt, empIdTable);

    }
    @AfterMethod
    public void afterMethod() {
        //Close the browser
        //driver.quit();
    }
    }

