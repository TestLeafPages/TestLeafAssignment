package week3.day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {

		// add system property -> webdriver.chrome.driver
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");

		// Open the chrome browser
		// ChromeDriver (C) -> Written by Selenium Team
		ChromeDriver driver = new ChromeDriver();

		// Wait (for the element to appear for the max time: 30)
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Load the URL :: get ->
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		// Click Alert Box
		driver.findElementByXPath("//button[text()='Prompt Box']").click();
		
		// switch to alert
		Alert alert = driver.switchTo().alert();
		
		// Implemented by which class -> RemoteAlert
		String text = alert.getText();
		System.out.println(text);
		
		// Type something
		alert.sendKeys("HP");		
		
		// Close the alert
		alert.accept();
		
		// Whatever operation you do in Alert by Selenium -> You cannot notice
		// Javascript Injection (WebDriver API)
		
		
	}
}
