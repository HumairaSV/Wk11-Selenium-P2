package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class MultiBrowser {
    static String baseUrl = "https://opensource-demo.orangehrmlive.com/";
    static WebDriver driver;
    static String browser = "firefox";

    public static void main(String[] args) {

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.ghecko.driver", "drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        }else {
            System.out.println("Incorrect browser name-Select from Chrome or Edge or Firefox");
        }

        //launch url
        driver.get(baseUrl);
        //maximise the browser window
        driver.manage().window().maximize();
        //give implicit wait time to the driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Print the title of the page
        System.out.println("Page Title is: " + driver.getTitle());
        //Print the current url
        System.out.println("Current url is: "+ driver.getCurrentUrl());
        //Print the page source
        System.out.println("Page source is: " + driver.getPageSource());

        //find the username field and enter data in the field
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys("Admin");

        //Find the password field and send data to the field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");


        //close the browser
        driver.quit();



    }
}
