package seleniumProjectActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;


public class Activity5 {
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
    public void editUserInfo() {

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

        //click the Edit button
        WebElement BtnEdit = driver.findElement(By.id("btnSave"));
        BtnEdit.click();

        //Fill the required fields
        driver.findElement(By.id("personal_txtEmpFirstName")).clear();
        driver.findElement(By.id("personal_txtEmpFirstName")).sendKeys("Bala");
        driver.findElement(By.id("personal_txtEmpLastName")).clear();
        driver.findElement(By.id("personal_txtEmpLastName")).sendKeys("Nala");
        driver.findElement(By.id("personal_optGender_1")).click();
        Select drpNation = new Select(driver.findElement(By.id("personal_cmbNation")));
        drpNation.selectByVisibleText("Indian");
        driver.findElement(By.id("personal_DOB")).clear();
        driver.findElement(By.id("personal_DOB")).sendKeys("1991-02-11");

        //click on Save
        driver.findElement(By.id("btnSave")).click();

        WebElement empId = driver.findElement(By.id("personal_txtEmployeeId"));
        String empIdTxt = empId.getAttribute("value");
    }
    @AfterMethod
    public void afterMethod() {
        //Close the browser
        //driver.quit();
    }
    }

