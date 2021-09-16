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

public class Homepage extends TestBase {

	
	@Test
	//This test method is repeated for each set of test data
	public void Homepage1() {
    

		driver.get("http://aps:xtV9M55k@apsvirtual.master.aps-dev2.codeenigma.net/user/login");


		JavascriptExecutor js = (JavascriptExecutor) driver;
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
				String title2 = driver.getTitle();
				System.out.println("The page title is : " + title2);
				
		// register interest for virtual event
		driver.findElement(By.xpath("//*[@id=\"block-views-block-webinars-block-1\"]/div/div/div/div[2]/div[1]/div/div[5]/span/div/a")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// view webinar for virtual event
		driver.findElement(By.xpath("//*[@id=\"block-views-block-webinars-block-1\"]/div/div/div/div[2]/div[1]/div/div[6]/div/a")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		// check register interest for virtual event on webinar page
		driver.findElement(By.xpath("//*[@id=\"block-system-main-block\"]/div/article/div/div/div")).click();
		
		// This  will scroll down the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(0,1000)");
		
		// check agenda virtual event on webinar page
		driver.findElement(By.xpath("//*[@id=\"quicktabs-apslive-event-content\"]/div[1]/ul/li[2]/a")).click();
		// check Faculty virtual event on webinar page
		driver.findElement(By.xpath("//*[@id=\"quicktabs-apslive-event-content\"]/div[1]/ul/li[3]/a")).click(); 
		
		
		// check register interest for virtual event on webinar page
		driver.findElement(By.xpath("//*[@id=\"block-system-main-block\"]/div/article/div/div/div")).click();
		
		// This  will scroll down the page by  1000 pixel vertical		
        js.executeScript("window.scrollBy(0,1000)");
		
		// check agenda virtual event on webinar page
		driver.findElement(By.xpath("//*[@id=\"quicktabs-apslive-event-content\"]/div[1]/ul/li[2]/a")).click();
		
		// check Faculty virtual event on webinar page
		driver.findElement(By.xpath("//*[@id=\"quicktabs-apslive-event-content\"]/div[1]/ul/li[3]/a")).click(); 
		
		// check Faculty virtual event on webinar page faculty A
		driver.findElement(By.xpath("//*[@id=\"quicktabs-tabpage-apslive-event-content-2\"]/div/div/div/span/article/div/div/div[1]/article/div/div/div[2]/a")).click(); 
		
		// close agenda virtual event on webinar page faculty A
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/button")).click(); 
		
		// check agenda virtual event on webinar page faculty B
		driver.findElement(By.xpath("//*[@id=\"quicktabs-tabpage-apslive-event-content-2\"]/div/div/div/span/article/div/div/div[2]/article/div/div/div[2]/a")).click(); 
		
		// close agenda virtual event on webinar page faculty B 
		driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div/button")).click(); 
		
		
		//check ask a question virtual event on webinar page
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div[2]/div/div/main/section/div[5]/div/div/div/div/div/div[1]/ul/li[4]/a")).click();
		  
		//type in question virtual event on webinar page
		driver.findElement(By.xpath("//*[@id=\"edit-field-question-0-value\"]")).sendKeys("did the automation test script work? test in maintest enviroment");
		
//		//Submit question virtual event on webinar page 
//		driver.findElement(By.xpath("//*[@id=\"edit-ajax-comments-reply-form-node-9-comment-0-0\"]")).click();	
		
		//Live voting virtual event on webinar page 
		driver.findElement(By.xpath("//*[@id=\"quicktabs-apslive-event-content\"]/div[1]/ul/li[5]/a")).click();
		
		//select answer a
		driver.findElement(By.xpath("/html/body/div/div/div/div/div[1]")).click(); 
		
		//Break out rooms virtual event on webinar page 
		driver.findElement(By.xpath("//*[@id=\"quicktabs-apslive-event-content\"]/div[1]/ul/li[6]/a")).click();
		
		//Break out rooms virtual event on webinar page External Webinar1
		driver.findElement(By.xpath("//*[@id=\"quicktabs-tabpage-apslive-event-content-5\"]/div/div/div/span/article/div/div[1]/div[1]/article/div/div[2]/a")).click();
		
		//close tab
		ArrayList<String> tabs2 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs2.get(1));
		driver.close();
		driver.switchTo().window(tabs2.get(0));


	        
	    //Break out rooms virtual event on webinar page External Webinar2
		driver.findElement(By.xpath("//*[@id=\"quicktabs-tabpage-apslive-event-content-5\"]/div/div/div/span/article/div/div[1]/div[2]/article/div/div[2]/a")).click();
		
		//close tab
		ArrayList<String> tabs3 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs3.get(1));
		driver.close();
		driver.switchTo().window(tabs3.get(0));

		//Break out rooms virtual event on webinar page External Webinar2
		driver.findElement(By.xpath("//*[@id=\"quicktabs-tabpage-apslive-event-content-5\"]/div/div/div/span/article/div/div[1]/div[3]/article/div/div[2]/a")).click();
		
		//close tab
		ArrayList<String> tabs4 = new ArrayList<String> (driver.getWindowHandles());
		driver.switchTo().window(tabs4.get(1));
		driver.close();
		driver.switchTo().window(tabs4.get(0));
		
		//Resources virtual event on webinar page 
		driver.findElement(By.xpath("//*[@id=\"quicktabs-apslive-event-content\"]/div[1]/ul/li[7]/a")).click();

		//Resources download 1 virtual event on webinar page 
		driver.findElement(By.cssSelector("#quicktabs-tabpage-apslive-event-content-6 > div > div > div > span > article > div > div.row > div:nth-child(1) > article > div > div.field.field--name-field-files.field--type-file.field--label-hidden.field__item > a")).click();

		//Resources download 2 virtual event on webinar page 
		driver.findElement(By.cssSelector("#quicktabs-tabpage-apslive-event-content-6 > div > div > div > span > article > div > div.row > div:nth-child(2) > article > div > div.field.field--name-field-files.field--type-file.field--label-hidden.field__item > a")).click();

		//Resources download 3 virtual event on webinar page 
		driver.findElement(By.cssSelector("#quicktabs-tabpage-apslive-event-content-6 > div > div > div > span > article > div > div.row > div:nth-child(3) > article > div > div.field.field--name-field-files.field--type-file.field--label-hidden.field__item > a")).click();

		
		//evaluation virtual event on webinar page 
		driver.findElement(By.xpath("//*[@id=\"quicktabs-apslive-event-content\"]/div[1]/ul/li[8]/a")).click();
		
		//evaluation Radio button virtual event on webinar page 
		driver.findElement(By.xpath("//*[@id=\"edit-question-1\"]/div[1]/label")).click();
		
		// evaluation check boxes button virtual event on webinar page 
		driver.findElement(By.xpath("//*[@id=\"edit-example-checkboxes\"]/div[1]/label")).click();
		
		// This  will scroll down the page by  1000 pixel vertical		
		js.executeScript("window.scrollBy(0,1000)");
		
		// evaluation type in text fields button virtual event on webinar page 
		driver.findElement(By.xpath("//*[@id=\"edit-example-text-field\"]")).sendKeys("did sdifniunienijnfvijnv fjvniv vivnie vivnievijev iefvnienije veijneinijfn the automation test script work? test in maintest enviroment");
		
		//evaluation type in text area button virtual event on webinar page 
		driver.findElement(By.xpath("//*[@id=\"edit-example-text-area\"]")).sendKeys("didjdnvhdfnvidfnv vidjfjncidfnfviudf divnidufvnf divfniudfnv  the automation test script work? test in maintest enviroment");
		
//		//evaluation Submit button virtual event on webinar page 
//		driver.findElement(By.xpath("//*[@id=\"edit-submit--2\"]")).click();
		
		driver.navigate().back();
		
		// register interest for Health care event
		driver.findElement(By.xpath("//*[@id=\"block-views-block-webinars-block-1\"]/div/div/div/div[2]/div[2]/div/div[5]/span/div/a")).click();
		// view webinar for health care event
		driver.findElement(By.xpath("//*[@id=\"block-views-block-webinars-block-1\"]/div/div/div/div[2]/div[2]/div/div[6]/div/a")).click();
		
		// view webinar for health care event click tech support
		driver.findElement(By.xpath("//*[@id=\"ui-id-1\"]")).click();
		
		//evaluation type in text area button heatlh care on webinar page 
		driver.findElement(By.xpath("//*[@id=\"edit-message\"]")).sendKeys("test tech support message in health care event  hgojodfjg dopgdfoidfj oihdfgoidfh didjdnvhdfnvidfnv vidjfjncidfnfviudf divnidufvnf divfniudfnv  the automation test script work? test in maintest enviroment");

//		//evaluation Submit button health care on webinar page 
//		driver.findElement(By.xpath("//*[@id="edit-actions-submit"]")).click();
		
		driver.navigate().back();
		
		// register interest for another event
		driver.findElement(By.xpath("//*[@id=\"block-views-block-webinars-block-1\"]/div/div/div/div[2]/div[3]/div/div[5]/span/div/a")).click();
		// view webinar for health care event
		driver.findElement(By.xpath("//*[@id=\"block-views-block-webinars-block-1\"]/div/div/div/div[2]/div[3]/div/div[6]/div/a")).click();
		
		// view webinar for another event click tech support
		driver.findElement(By.xpath("//*[@id=\"ui-id-1\"]")).click();
		
		//evaluation type in text area button another event on webinar page 
		driver.findElement(By.xpath("//*[@id=\"edit-message\"]")).sendKeys("test tech support message in Another event  hgojodfjg dopgdfoidfj oihdfgoidfh didjdnvhdfnvidfnv vidjfjncidfnfviudf divnidufvnf divfniudfnv  the automation test script work? test in maintest enviroment");

//		//evaluation Submit button another event on webinar page 
//		driver.findElement(By.xpath("//*[@id="edit-actions-submit"]")).click();
		
		driver.navigate().back();
		
		// Click privacy policy on homepage
		driver.findElement(By.xpath("//*[@id=\"block-block-content-footer-branding\"]/div/div/p[2]/a[1]")).click();
		// Retrieving web page title
		String privacy = driver.getTitle();
		System.out.println("The page title is : " + privacy);
		
		driver.navigate().back();
		
		// Click cookie policy on homepage
		driver.findElement(By.xpath("//*[@id=\"block-block-content-footer-branding\"]/div/div/p[2]/a[2]")).click();
		
		// Retrieving web page title
		String cookie = driver.getTitle();
		System.out.println("The page title is : " + cookie);
		
		driver.navigate().back();
		
		// Click faq policy on homepage
		driver.findElement(By.xpath("//*[@id=\"block-block-content-footer-branding\"]/div/div/p[2]/a[3]")).click();
		
		// Retrieving web page title
		String faq = driver.getTitle();
		System.out.println("The page title is : " + faq);
		driver.navigate().back();
		
		// Click FAQ tech support on homepage
		driver.findElement(By.xpath("//*[@id=\"block-block-content-footer-branding\"]/div/div/p[2]/a[4]")).click();
		
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
		//	file.close();

		}
		file.close();
		return records;
	}



}





