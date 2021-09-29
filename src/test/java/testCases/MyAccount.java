package testCases;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import helpers.TestBase;


//JUnit will run this test using dynamic test data as parameters

public class MyAccount extends TestBase {


	

	//This test method is repeated for each set of test data
	@Test
	public void MyAccount1() {

		driver.get("http://aps:xtV9M55k@apsvirtual.master.aps-dev2.codeenigma.net/user/login");
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

		// Retrieving web page title
				String title6 = driver.getTitle();
				System.out.println("The page title is : " + title6);

		// Retrieving web page title
				String title2 = driver.getTitle();
				System.out.println("The page title is : " + title2);
				
		// To to my acoount
		driver.findElement(By.linkText("MY ACCOUNT")).click();
		
		// click on another event register insterst 
		driver.findElement(By.xpath("//*[@id=\"block-views-block-apslive-my-events-block-1\"]/div/div/div/div/div[1]/div/div[3]/span/div/a")).click();
		
		// click on virtual event register insterst
		driver.findElement(By.xpath("//*[@id=\"block-views-block-apslive-my-events-block-1\"]/div/div/div/div/div[2]/div/div[3]/span/div/a")).click();

		 
		// click on health care event register insterst 
		//driver.findElement(By.xpath("//*[@id=\"block-views-block-apslive-my-events-block-1\"]/div/div/div/div/div[3]/div/div[3]/span/div/a")).click();

		//clieck newsletters
		driver.findElement(By.linkText("Newsletters")).click();
		
		// click news letter check box event 1
		driver.findElement(By.xpath("//*[@id=\"edit-subscriptions-new-newsletter\"]")).click();
		
		// click save news letter
		driver.findElement(By.xpath("//*[@id=\"edit-update\"]")).click();
		
		// To to my acoount
		driver.findElement(By.linkText("Edit")).click();
		
		// Locating web element
		WebElement FirstName = driver.findElement(By.xpath("//*[@id=\"edit-field-first-name-0-value\"]"));
		WebElement Surname = driver.findElement(By.xpath("//*[@id=\"edit-field-second-name-0-value\"]"));
		WebElement Country = driver.findElement(By.xpath("//*[@id=\"edit-field-country\"]"));
		WebElement CurrentPassword = driver.findElement(By.xpath("//*[@id=\"edit-current-pass\"]"));
		WebElement Email = driver.findElement(By.xpath("//*[@id=\"edit-mail\"]"));
		WebElement Username = driver.findElement(By.xpath("//*[@id=\"edit-name\"]"));
		WebElement Password = driver.findElement(By.xpath("//*[@id=\"edit-pass-pass1\"]"));
		WebElement ConfirmPassword = driver.findElement(By.xpath("//*[@id=\"edit-pass-pass2\"]"));


		// Retrieving web page title
		String title = driver.getTitle();
		System.out.println("The page title is : " + title);

		// Performing actions on web elements
		FirstName.sendKeys("gurdip.gill@edt.co.uk");
		Surname.sendKeys("gurdip.gill@edt.co.uk");
		Country.sendKeys("u");
		CurrentPassword.sendKeys("gurdip.gill@edt.co.uk");
		Email.sendKeys("gurdip.gill@edt.co.uk");
		Username.sendKeys("testautomation");
		Password.sendKeys("gurdip.gill@edt.co.uk2");
		ConfirmPassword.sendKeys("gurdip.gill@edt.co.uk2");
		try {
		    Thread.sleep(10000);
			// click save news letter
			driver.findElement(By.xpath("//*[@id=\"edit-submit\"]")).click();
			
		} catch (InterruptedException e) {
		    e.printStackTrace();
		};

		
		
		
		
		// check register interest for virtual event on webinar page
//		driver.findElement(By.xpath("//*[@id=\"block-system-main-block\"]/div/article/div/div/div")).click();
//		
//		// This  will scroll down the page by  1000 pixel vertical		
//        js.executeScript("window.scrollBy(0,1000)");
//		
//		// check agenda virtual event on webinar page
//		driver.findElement(By.xpath("//*[@id=\"quicktabs-apslive-event-content\"]/div[1]/ul/li[2]/a")).click();
//		// check Faculty virtual event on webinar page
//		driver.findElement(By.xpath("//*[@id=\"quicktabs-apslive-event-content\"]/div[1]/ul/li[3]/a")).click(); 
//		
		
		
		
		
		
	
	
}
	

	
	@Parameters
	public static Collection<String[]> testData() throws IOException {
		return getTestData("src/loginTestData.csv");
	}

	
	public static Collection<String[]> getTestData(String fileName) throws IOException {
		List<String[]> records = new ArrayList<String[]>();
		String record;
		BufferedReader file = new BufferedReader(new FileReader(fileName));
		while ((record = file.readLine()) != null) {
			String fields[] = record.split(",");
			records.add(fields);
			
		}
		file.close();
		return records;
	}



}





