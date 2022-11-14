package project5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class P5_EdgeBrowserTesting {
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        //Launch Browser
        driver.get(baseUrl);
        //Print the title of the page
        System.out.println("The title of the page is:" + driver.getTitle());
        //Print the current Url
        System.out.println("The current Url is: " + driver.getCurrentUrl());
        //Print the page source
        System.out.println("The page sourse is: " + driver.getPageSource());
        //Enter the email to email field
        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("admin@gmail.com");
        //Enter the password to password field
        WebElement passwordField = driver.findElement(By.name("user[password]"));
        passwordField.sendKeys("admin123");
        //Close the browser
        //driver.quit();

    }
}
