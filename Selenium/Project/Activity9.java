package seleniumProjectActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;


public class Activity9 {
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
    public void emergencyContact() {

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

        //click on Emergency contact menu
        driver.findElement(By.xpath("//a[text()='Emergency Contacts']")).click();

        //To Retrieve all the contacts
        List<WebElement> cols = driver.findElements(By.xpath("//table/thead/th"));
        System.out.println(cols.size());

        List<WebElement> rows = driver.findElements(By.xpath("//table/tbody/tr"));
        System.out.println(rows.size());

        for(int i=1; i<=rows.size(); i++) {
            WebElement row = driver.findElement(By.xpath("//table/tbody/tr[" + i + "]"));
            System.out.println("Row " + i + ": " + row.getText());
        }
    }
    @AfterMethod
    public void afterMethod() {
        //Close the browser
        //driver.quit();
    }
    }

