package week4.day4;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ManageJs {
	
	public static void main(String[] args) throws IOException {
		// add system property -> webdriver.chrome.driver
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");

		
		
		// Open the chrome browser
		// ChromeDriver (C) -> Written by Selenium Team
		ChromeDriver driver = new ChromeDriver();		
		
		driver.manage().window().maximize();

		// Load the URL :: get ->
		driver.get("http://www.leafground.com/");		
		
		// Position of the element that we have to see
		WebElement disappear = driver.findElementByXPath("//h5[text()='Wait to Disappear']");
		int x = disappear.getLocation().getX();
		
	/*	// Scroll down
		// How do we call Javascript from Selenium Java : x (100), y (0)
		driver.executeScript("window.scrollBy(0, "+(x+200)+");");		
		
		// Snap
		File src = driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("./file1.png"));*/
		//disappear.click(); // This is best preferred -> W3C API 
		driver.executeScript("arguments[0].click()", disappear);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
