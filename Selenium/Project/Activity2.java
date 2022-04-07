package seleniumProjectActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Activity2 {
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
    public void verifyImgURL() {

        //Click the header Image
        WebElement pageLogo =  driver.findElement(By.cssSelector("#divLogo > img:nth-child(1)"));

        // Check the title of the page
        String logoTxt   = pageLogo.getAttribute("src");

        //Print the url of the header page image
        System.out.println("Image Url is: " + logoTxt);

        //Assertion for page title
        //Assert.assertEquals("OrangeHRM", title);
    }
    @AfterMethod
    public void afterMethod() {
        //Close the browser
        driver.quit();
    }
    }

