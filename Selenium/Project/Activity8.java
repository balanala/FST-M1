package seleniumProjectActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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


public class Activity8 {
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

        //click the Apply Leave in DashBoard Page
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        JavascriptExecutor ex=(JavascriptExecutor)driver;
        ex.executeScript("arguments[0].click()", driver.findElement(By.xpath("//span[text()='Apply Leave']")));
        driver.findElement(By.xpath("//span[text()='Apply Leave']")).click();

        //fill the details for applying leave
        Select leaveType = new Select(driver.findElement(By.id("applyleave_txtLeaveType")));
        leaveType.selectByVisibleText("DayOff");
        driver.findElement(By.id("applyleave_txtFromDate")).clear();
        driver.findElement(By.id("applyleave_txtFromDate")).sendKeys("2022-04-07");
        driver.findElement(By.id("applyleave_txtToDate")).clear();
        driver.findElement(By.id("applyleave_txtToDate")).sendKeys("2022-04-08");

        //click apply Button
        driver.findElement(By.id("applyBtn")).click();

        //Navigate to My Leave Page
        driver.findElement(By.id("menu_leave_viewMyLeaveList")).click();
        String status = driver.findElement(By.xpath("//table[@id='resultTable']//tr//td[6]")).getText();
        if(status.contains("Pending Approval")){
            System.out.println("Status is as Expected");
        }
        else{
            System.out.println("status is not as Expected");
        }
    }
    @AfterMethod
    public void afterMethod() {
        //Close the browser
        //driver.quit();
    }
    }

