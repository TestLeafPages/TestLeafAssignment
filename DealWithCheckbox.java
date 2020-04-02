package week1.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DealWithCheckbox {

	public static void main(String[] args) throws InterruptedException {

		// add system property -> webdriver.chrome.driver
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");

		// Open the chrome browser
		// ChromeDriver (C) -> Written by Selenium Team
		ChromeDriver driver = new ChromeDriver();

		// Wait (for the element to appear for the max time: 30)
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Load the URL :: get ->
		driver.get("http://www.leafground.com/pages/checkbox.html");
		
		// Find the selenium checkbox
		WebElement eleCheckBox = driver.findElementByXPath("(//label[text()='Confirm Selenium is checked']/following::input)[1]");
		boolean checked = eleCheckBox.isSelected();
		System.out.println(checked);
		
		if(!checked) {
			eleCheckBox.click();
		}
		
		// isSelected -> radio button, checkbox and select.
		
		// isDisplayed -> Visible (true) 
		
	}

}
