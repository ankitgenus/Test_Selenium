package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class BaseTest {

    WebDriver driver;

    @BeforeSuite
    public void setUp(){
        System.out.println("BeforeSuite");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    public void test(){
        System.out.println("Test running");
        driver.get("https://www.google.com");
    }

    @AfterSuite
    public void tearDown(){
        System.out.println("AfterSuite");
        driver.quit();
    }
}
