package learnWindowHandles;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandles {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://www.leafground.com/pages/Window.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		

		driver.findElementById("home").click();
		
//		String fWindow = driver.getWindowHandle();
//		System.out.println(fWindow);
		
		System.out.println(driver.getTitle());

// Way 1:- Switch  to Window
		Set<String> allWin = driver.getWindowHandles();
		List<String> lst = new ArrayList<>(allWin);
		driver.switchTo().window(lst.get(1));
		
// **************************************************************************************		

// Way 2:- switch to last window
//		for (String eachWin : allWin) {
//			driver.switchTo().window(eachWin);
//		}
// **************************************************************************************	

// Way 3:- using Iterator
//		Iterator<String> iterator = allWin.iterator();
//		iterator.next();
//		System.out.println(driver.getTitle());
//		iterator.next();
//		System.out.println(driver.getTitle());
		
// **************************************************************************************
				
// Snapshot:-
		File src = driver.getScreenshotAs(OutputType.FILE);
		File dest = new File("./snaps/img.png");
		FileUtils.copyFile(src, dest);
		
	}

}
