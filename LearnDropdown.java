package week2.day3;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropdown {

	public static void main(String[] args) throws InterruptedException {


		// add system property -> webdriver.chrome.driver
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");

		// Open the chrome browser
		// ChromeDriver (C) -> Written by Selenium Team
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Load the URL :: get ->
		driver.get("http://www.leafground.com/pages/Dropdown.html");

		// Step 1) Find the dropdown -> WebElement
		WebElement dropdown1 = driver.findElementByXPath("(//select)[last()]");
		
		// Step 2) Convert the WebElement -> Select 
		Select dd = new Select(dropdown1);
		
		boolean multiple = dd.isMultiple();
		System.out.println(multiple);
		
		// select
		/*1) selectByVisible
		2) selectByIndex*/
		
		dd.selectByIndex(1);
		dd.selectByIndex(2);
				
		// Step 3) Interact with dropdown using method
		//dd.selectByVisibleText("UFT/QTP");
		// Visible Text -> Use data for specific language (EN)
		
		/*// If you are using multi-lingual application, then preferred to use value
		dd.selectByValue("2");
		
		// Using Index
		// Choose any 
		dd.selectByIndex(4);
		
		
		// I want to pick the last drop down item 
		// How to find how many options are available
		List<WebElement> options = dd.getOptions();
		
		// Find the count of the list item -> size()
		int count = options.size();
		
		// Pick the last one
		dd.selectByIndex(count-1);*/
		
		/*
		 * visibleText (black color inside the option tag) -> String
		 * value (orange attribute of the option tag) -> String
		 * index (number starting from 0 -> count of option tags inside the Select) -> int
		 * 
		 */
		
		
	}

}
