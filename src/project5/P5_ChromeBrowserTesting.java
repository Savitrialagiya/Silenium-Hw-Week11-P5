package project5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class P5_ChromeBrowserTesting {
    public static void main(String[] args) {
        String baseUrl = "https://courses.ultimateqa.com/users/sign_in";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Launch Url
        driver.get(baseUrl);
        //Print the title of the page
        System.out.println("The title of the page: " + driver.getTitle());
        //Print the current url
        System.out.println("The current Url: " + driver.getCurrentUrl());
        //Print the page source
        System.out.println("The page source: " + driver.getPageSource());
        //Enter the email to email field
        WebElement emailField = driver.findElement(By.id("user[email]"));
        emailField.sendKeys("admin123@gmail.com");
        //Enter the password to password field
        WebElement passwordField = driver.findElement(By.name("user[password]"));
        passwordField.sendKeys("admin123");
        //Close the browser
        //driver.quit();
    }

}
