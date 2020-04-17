package learnRelativeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class LearnRelativeMethods {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		// using RelativeLocator
		
		WebElement ele = driver.findElement(RelativeLocator.withTagName("li")
				
				.toLeftOf(By.xpath("//ul[@class='wp-categories-list']/li[8]"))
				
				.below(By.xpath("//ul[@class='wp-categories-list']/li")));
		
		System.out.println(ele.getText());
		
	}

}














