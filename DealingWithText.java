package week1.day3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DealingWithText {

	public static void main(String[] args) throws InterruptedException {

		// add system property -> webdriver.chrome.driver
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");

		// Open the chrome browser
		// ChromeDriver (C) -> Written by Selenium Team
		ChromeDriver driver = new ChromeDriver();

		// Wait (for the element to appear for the max time: 30)
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Load the URL :: get ->
		driver.get("http://www.leafground.com/pages/Edit.html");
		
		driver.findElementById("email").sendKeys("babu@testleaf.com");
		
		driver.findElementByXPath("//input[@value='Append ']").sendKeys("babu@testleaf.com",Keys.TAB);
		
		String attribute = driver.findElementByName("username").getAttribute("value");
		System.out.println(attribute);
		
		driver.findElementByXPath("(//input[@name='username'])[2]").clear();
		
		boolean enabled = driver.findElementByXPath("//input[@disabled='true']").isEnabled();
		System.out.println(enabled);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
