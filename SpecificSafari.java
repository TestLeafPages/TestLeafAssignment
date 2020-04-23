package week4.day4;

import java.util.Map.Entry;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Keys;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SpecificSafari {

	public static void main(String[] args) {

		// add system property -> webdriver.chrome.driver
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");

		// Open the chrome browser
		// ChromeDriver (C) -> Written by Selenium Team
		
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability("unhandledPromptBehavior", UnexpectedAlertBehaviour.IGNORE);
		
		ChromeDriver driver = new ChromeDriver(cap);		

		driver.manage().window().maximize();

		// Load the URL :: get ->
		driver.get("http://www.leafground.com/pages/Alert.html");	
		
		
		// Clear -> IE, Chrome -> 1) DesiredCapabilities 2) Capabilities
		
		
		// Safari (11) -> backspace (n)
		String browserName = driver.getCapabilities().getBrowserName();
		System.out.println(browserName);
		String version = driver.getCapabilities().getVersion();
		System.out.println(version);
		
		/*Capabilities capabilities = driver.getCapabilities();
		for (String eachCap : capabilities.getCapabilityNames()) {
			System.out.println(eachCap);
		}
		
		WebElement ele = driver.findElementByXPath("//label[text()='Append a text and press keyboard tab']/following::input[1]");	
		
		if(browserName.equalsIgnoreCase("safari")) {
			System.out.println(ele.getAttribute("value"));
			int length = ele.getAttribute("value").length();
			for (int i = 0; i < length; i++) {
				ele.sendKeys(Keys.BACK_SPACE);
			}
		}else {
			ele.clear();
		}*/
		
		Capabilities capabilities = driver.getCapabilities();
		for (Entry<String, Object> eachCap : capabilities.asMap().entrySet()) {
			System.out.println(eachCap.getKey());
			System.out.println(eachCap.getValue());
		}
		
		driver.findElementByXPath("//button[text()='Alert Box']").click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		WebElement loader = driver.findElementByClassName("loader");
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOf(loader));
		
		
	}

}
