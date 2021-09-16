package helpers;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import org.testng.annotations.BeforeMethod;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
/*
 * This is a 'helper' class that lets us re-use common setup and teardown methods.
 * All of our tests will start by creating a WebDriver and navigating to the same URL, so we have extracted that code into a single place.
 * Use the 'extends' keyword in your test cases to access these methods and variables.
 */
public class TestBase {
    
    public WebDriver driver; 
    public Utility util;
    //
    
    @BeforeMethod
    public WebDriver setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("chrome.switches", "--disable-extensions");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("test-type=browser");
        options.setPageLoadStrategy(PageLoadStrategy.EAGER);
        options.addArguments("enable-automation"); // https://stackoverflow.com/a/43840128/1689770
//      options.addArguments("--headless"); // only if you are ACTUALLY running headless
        options.addArguments("--no-sandbox"); //https://stackoverflow.com/a/50725918/1689770
        options.addArguments("--disable-infobars"); //https://stackoverflow.com/a/43840128/1689770
        options.addArguments("--disable-dev-shm-usage"); //https://stackoverflow.com/a/50725918/1689770
        options.addArguments("--disable-browser-side-navigation"); //https://stackoverflow.com/a/49123152/1689770
        options.addArguments("--disable-gpu"); //https://stackover
        driver = new ChromeDriver(options);
        return driver;
    }
    
    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}