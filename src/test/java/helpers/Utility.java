package helpers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/*
 * This is a 'helper' class that holds a useful method to login to the website.
 * This means the login steps can be re-used in lots of tests, but we only have to code the steps once
 */

public class Utility {
	
	WebDriver driver;
	
	
	public Utility(WebDriver driver) {
		this.driver = driver;
	}
	
	
	
	public void login(String username, String password) {
		


		// Locating web element
		WebElement uName = driver.findElement(By.xpath("//*[@id=\"edit-name\"]"));
		WebElement pswd = driver.findElement(By.xpath("//*[@id=\"edit-pass\"]"));
		WebElement loginBtn = driver.findElement(By.xpath("//*[@id=\"edit-submit\"]"));

		// Peforming actions on web elements
		uName.sendKeys("gurdip.gill@edt.co.uk");
		pswd.sendKeys("gurdip.gill@edt.co.uk");
		try {
			loginBtn.click();
		} catch (InvalidSelectorException e) {
		}

		// Putting implicit wait
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

}
