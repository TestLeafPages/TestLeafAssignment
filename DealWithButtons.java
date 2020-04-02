package week1.day4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DealWithButtons {

	public static void main(String[] args) throws InterruptedException {

		// add system property -> webdriver.chrome.driver
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");

		// Open the chrome browser
		// ChromeDriver (C) -> Written by Selenium Team
		ChromeDriver driver = new ChromeDriver();

		// Wait (for the element to appear for the max time: 30)
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		// Load the URL :: get ->
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		
		// Leaftaps Login -> bg color
		String bgColor = driver.findElementByTagName("h2").getCssValue("background-color");
		System.out.println("The Bg color is: "+ bgColor);
		
		// Find the font size of the username
		String fontSize = driver.findElementByXPath("//label[@for='username']").getCssValue("font-size");
		System.out.println("The font size is: "+fontSize);
		
		// Find the width of the login button
		int width = driver.findElementByClassName("decorativeSubmit").getSize().getWidth();
		System.out.println("The width is: "+width);
		
		// Find the x position of the username textbox
		WebElement eleUserName = driver.findElementById("username");
		System.out.println("The x value is: "+eleUserName.getLocation().getX());
		
		/*//Click button to travel home page
		WebElement eleButton1 = driver.findElement(By.id("home"));
		eleButton1.click();
		
		// Come back to the page
		driver.navigate().back();
		
		// Find position of button (x,y)
		WebElement elePosition = driver.findElement(By.id("position"));
		Point location = elePosition.getLocation();
		System.out.println(location);
		
		System.out.println(location.getY());
		
		// What color am I?
		String color = driver.findElementById("color").getCssValue("background-color");
		System.out.println(color);
		
		
		// What is my size?
		Dimension dim = driver.findElementById("size").getSize();
		System.out.println(dim);
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
