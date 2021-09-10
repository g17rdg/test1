package helpers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/*
 * This is a 'helper' class that holds a useful method to login to the website.
 * This means the login steps can be re-used in lots of tests, but we only have to code the steps once
 */

public class UtilityNeg {
	
	WebDriver driver;
	
	
	public UtilityNeg(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	public void login(String username, String password) {
		


		// Locating web element
		WebElement uName = driver.findElement(By.xpath("//*[@id=\"edit-name\"]"));
		WebElement pswd = driver.findElement(By.xpath("//*[@id=\"edit-pass\"]"));
		WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"edit-submit\"]"));

		// Peforming actions on web elements
		uName.sendKeys("gu");
		pswd.sendKeys("g");
		//try {
			loginBtn.click();
//		} catch(Exception e) {
//			System.out.println(e.toString());
//		}

		// Putting implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

}
