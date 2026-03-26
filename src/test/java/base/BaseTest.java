package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.*;

public class BaseTest {

    WebDriver driver;

    @BeforeSuite
    public void setUp(){
        System.out.println("BeforeSuite");
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        // 🔥 Required for GitHub Actions / Linux
        options.addArguments("--headless=new");   // run without UI
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-gpu");
        options.addArguments("--window-size=1920,1080");
        driver = new ChromeDriver(options);
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
