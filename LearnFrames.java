package week3.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {

	public static void main(String[] args) throws InterruptedException {

		// add system property -> webdriver.chrome.driver
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");

		// Open the chrome browser
		// ChromeDriver (C) -> Written by Selenium Team
		ChromeDriver driver = new ChromeDriver();

		// Wait (for the element to appear for the max time: 30)
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// affects 2 methods: findElement, findElements
		
		// Load the URL :: get ->
		driver.get("https://dev49243.service-now.com/");
		
		// switch to the frame
		driver.switchTo().frame(1); // Control moved to frame		
		
		// Enter the username
		driver.findElementById("user_name").sendKeys("admin");
		
		// Go out of the frame
		driver.switchTo().defaultContent();
		
		//driver.switchTo().parentFrame();
		
		String text = driver.findElementByXPath("//span[text()='Service Management']").getText();
		System.out.println(text);
		
	}
}
