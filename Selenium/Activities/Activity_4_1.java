package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_4_1 {
    public static void main (String args[]){

        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.training-support.net");
        String title = driver.getTitle();
        System.out.println("The Page title is: " +title);

       //WebElement elementId =  driver.findElement(By.id("about-link"));
       //WebElement elementClass = driver.findElement(By.className("ui inverted huge green button"));
       //WebElement elementLink = driver.findElement(By.linkText("About Us"));
       //WebElement elementCss = driver.findElement(By.cssSelector("a#about-link"));
       WebElement elementXpath = driver .findElement(By.xpath("//*[@id='about-link']"));
        String elementText  = elementXpath.getText();
        System.out.println(elementText);

        driver.close();
    }
}
