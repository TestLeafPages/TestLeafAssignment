package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnMultiple {

	public static void main(String[] args) throws InterruptedException {


		// add system property -> webdriver.chrome.driver
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");

		// Open the chrome browser
		// ChromeDriver (C) -> Written by Selenium Team
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Load the URL :: get ->
		driver.get("http://leaftaps.com/opentaps/control/main");

		// Login
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();

		// CRM SFA
		driver.findElementByLinkText("CRM/SFA").click();

		// Leads
		driver.findElementByLinkText("Leads").click();

		// Find Leads
		driver.findElementByLinkText("Find Leads").click();
		
		// Find all first names
		List<WebElement> allFirstNames = driver.findElementsByXPath("//label[text()='First name:']");
		
		
		// 2 Methods in List
		// 1) to get the count : size() -> int (the count of list items)
		// 2) to pick one item from the list: get(index) -> WebElement  [Java index starts at 0]
		
		// Print the count of all first names 
		int size = allFirstNames.size();
		System.out.println(size);
		
		// Print the first element
		WebElement firstMatch = allFirstNames.get(0);
		System.out.println(firstMatch.getAttribute("class"));
		
		
		
		
		
		
		
		
		
	}

}
