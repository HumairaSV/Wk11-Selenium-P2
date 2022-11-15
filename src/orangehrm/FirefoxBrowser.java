package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxBrowser {

    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.ghecko.driver", "drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        //Launch Url
        driver.get(baseUrl);
        //maximise the browser window
        driver.manage().window().maximize();
        //give implicit wait time to the driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Print the page title
        System.out.println("Page title is: " + driver.getTitle());
        //Print the current url
        System.out.println("Current url is: " + driver.getCurrentUrl());
        //Print the page source
        System.out.println("Page source is: " + driver.getPageSource());


        //Find the username field and send data to the field
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys("Admin");

        //Find the password field and send data to the field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");


        //close the browser
        driver.quit();



        //Find the username field and send data to the field

    }
}
