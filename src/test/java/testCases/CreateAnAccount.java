package testCases;


import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import helpers.TestBase;



public class CreateAnAccount extends TestBase {
	
	

	//This test method is repeated for each set of test data
	@Test
	public void CreateAccount() {
		driver.get("http://aps:xtV9M55k@apsvirtual.master.aps-dev2.codeenigma.net/user/login");



		// Navigate to web page
		driver.get("http://apsvirtual.master.aps-dev2.codeenigma.net/user/login");

		// Maximising window
		driver.manage().window().maximize();
		// Putting implicit wait
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

		// click on create new account
		WebElement CreateNewAccount = driver.findElement(By.xpath("//*[@id=\"content\"]/section/nav/ul/li[2]/a"));
		CreateNewAccount.click();

		// Locating web element
		WebElement FirstName = driver.findElement(By.xpath("//*[@id=\"edit-field-first-name-0-value\"]"));
		WebElement Surname = driver.findElement(By.xpath("//*[@id=\"edit-field-second-name-0-value\"]"));
		WebElement Country = driver.findElement(By.xpath("//*[@id=\"edit-field-country\"]"));
		WebElement Email = driver.findElement(By.xpath("//*[@id=\"edit-mail\"]"));
		WebElement Password = driver.findElement(By.xpath("//*[@id=\"edit-pass-pass1\"]"));
		WebElement ConfirmPassword = driver.findElement(By.xpath("//*[@id=\"edit-pass-pass2\"]"));


		// Retrieving web page title
		String title = driver.getTitle();
		System.out.println("The page title is : " + title);

		// Performing actions on web elements
		FirstName.sendKeys("gurdip.gill@edt.co.uk");
		Surname.sendKeys("gurdip.gill@edt.co.uk");
		Country.sendKeys("u");
		Email.sendKeys("gurdip.gill@edt.co.uk");
		Password.sendKeys("gurdip.gill@edt.co.uk");
		ConfirmPassword.sendKeys("gurdip.gill@edt.co.uk");
		try {
		    Thread.sleep(10000);
		} catch (InterruptedException e) {
		    e.printStackTrace();
		};
		

		WebElement CreateNewAccountbtn = driver.findElement(By.id("edit-submit"));
		CreateNewAccountbtn.click();

		 WebElement ele =
		 driver.findElement(By.xpath("//*[@id=\"content\"]/section/div[2]/div"));
		 System.out.println("The header text is - " +ele.getText());

	}
}





