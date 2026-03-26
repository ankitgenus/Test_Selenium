package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class BaseTest {

    WebDriver driver;

    @BeforeSuite
    public void setUp(){

        driver = new ChromeDriver();
        driver.get("http://10.58.13.11/#/core/login");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterSuite
    public void tearDown(){

        driver.close();
    }
}
