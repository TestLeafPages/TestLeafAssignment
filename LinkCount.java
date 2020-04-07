package week2.day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCount {

	public static void main(String[] args) throws InterruptedException {


		// add system property -> webdriver.chrome.driver
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");

		// Open the chrome browser
		// ChromeDriver (C) -> Written by Selenium Team
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// Load the URL :: get ->
		driver.get("http://www.leafground.com/pages/Link.html");

		
		/*// 1) How many links are available?
		List<WebElement> allLinks = driver.findElementsByTagName("a");
		System.out.println(allLinks.size());
		
		// 2) Click on the first link
		allLinks.get(0).click();
		
		// print title
		System.out.println(driver.getTitle());*/
		
		//Click on the last 'Go to Home Page' link
		/*List<WebElement> eles = driver.findElementsByLinkText("Go to Home Page");
		System.out.println(eles.size());
		eles.get(eles.size()-1).click();*/
		
		WebElement ele = driver.findElementByXPath("(//a[text()='Go to Home Page'])[last()]/following-sibling::label");
		System.out.println(ele.getText());
	}

}
