package week1.day2;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafTapsLogin {

	public static void main(String[] args) throws InterruptedException {

		// add system property -> webdriver.chrome.driver
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");

		// Open the chrome browser
		// ChromeDriver (C) -> Written by Selenium Team
		ChromeDriver driver = new ChromeDriver();

		// Load the URL :: get ->
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		Thread.sleep(4000); // Wait for 4 seconds
		
		// Find the username
		WebElement eleUserName = driver.findElementById("username");
		eleUserName.clear(); // clear
		eleUserName.sendKeys("DemoSalesManager"); // type
		
		// Find the password and interact
		/*WebElement elePassword = driver.findElementByName("PASSWORD");
		elePassword.sendKeys("crmsfa");*/		
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		
		// Click on the login
		driver.findElementByClassName("decorativeSubmit").click();
		
		// Click on CRM SFA
		driver.findElementByLinkText("CRM/SFA").click();
		
		
		

	}

}
