package helpers;

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
	public void setUp() { 
		System.setProperty("webdriver.chrome.driver","//C:\\Users\\EdgeV\\Downloads\\chromedriver_win321\\chromedriver.exe");
		
		
		driver = new ChromeDriver();
		// Maximizing window
		driver.manage().window().maximize();
		// Putting implicit wait
		//driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		// Retrieving web page title
		String title = driver.getTitle();
		System.out.println("The page title is : " + title);
		util = new Utility(driver);
		
		driver.get("http://aps:xtV9M55k@apsvirtual.master.aps-dev2.codeenigma.net/user/login");
		
		
		
		// http://username:password@test.com
		
		driver.findElement(By.xpath("//*[@id=\"edit-submit\"]")).click();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
