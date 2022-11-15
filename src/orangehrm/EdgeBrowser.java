package orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeBrowser {

    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.edge.driver", "drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();

        //Launch the url
        driver.get(baseUrl);
        //maximise the browser window
        driver.manage().window().maximize();
        //give implicit wait time to the driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        //get the title of the page
        String pageTitle = driver.getTitle();
        System.out.println("Page title is: " + pageTitle);
        //get the current url
        String currentUrl = driver.getCurrentUrl();
        System.out.println("Current url is: " + currentUrl);
        //get the page  source
        String pageSource = driver.getPageSource();
        System.out.println("Page source is: " + pageSource );

        //Find the username field element and input the username
        WebElement usernameField = driver.findElement(By.name("username"));
        usernameField.sendKeys("Admin");

        //Find the password field element and input the password
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("admin123");

        //closing the browser
        driver.quit();



    }
}
