package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowser {

    public static void main(String[] args) {

        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //Launching the url
        driver.get(baseUrl);
        //maximising the browser window
        driver.manage().window().maximize();
        //giving implicit wait time to the driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //get title of the page
        System.out.println("Page Title is: " + driver.getTitle());
        //get the current url
        System.out.println("Current url is: " + driver.getCurrentUrl());
        //get the page source
        System.out.println("Page source is: " + driver.getPageSource());

        //Find the username field element and input username in the field
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys("Admin");

        //find the password field element and input the password in the field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");

        //closing the browser
        driver.quit();





    }
}
