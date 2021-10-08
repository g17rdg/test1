package testCases;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import helpers.TestBase;



import helpers.TestBase;



public class ResetPassword extends TestBase {
	//This test method is repeated for each set of test data
	@Test
	public void ResetPasswordForAccount() {
		driver.get("http://aps:xtV9M55k@apsvirtual.master.aps-dev2.codeenigma.net/user/login");



		// Navigate to web page
		driver.get("http://apsvirtual.master.aps-dev2.codeenigma.net/user/login");

		// Maximising window
		driver.manage().window().maximize();
		// Putting implicit wait
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

		// Retrieving web page title
				String title2 = driver.getTitle();
				System.out.println("The page title is : " + title2);
				
		// click reset your password
		driver.findElement(By.xpath("//*[@id=\"content\"]/section/nav/ul/li[3]/a")).click();
		
		// type in email address of forgotten password
		driver.findElement(By.xpath("//*[@id=\"edit-name\"]")).sendKeys("gurdip.gill@edt.co.uk");
				
		// click submit
		driver.findElement(By.xpath("//*[@id=\"edit-submit\"]")).click();
	}


}





