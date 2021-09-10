package helpers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
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

public class TestBaseNeg {
	
	public WebDriver driver; 
	public UtilityNeg util;
	
	

	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\EdgeV\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		
		driver = new ChromeDriver();
		// Maximizing window
		driver.manage().window().maximize();
		// Putting implicit wait
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		
		util = new UtilityNeg(driver);
		
		driver.get("http://aps:xtV9M55k@apsvirtual.master.aps-dev2.codeenigma.net/user/login");
		
		driver.findElement(By.xpath("//*[@id=\"edit-submit\"]")).click();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
