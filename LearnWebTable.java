package learnWebTable;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://erail.in/");
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("SBC", Keys.TAB);
		
		
		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("MAS", Keys.TAB);
		
		// Step1: find the table(WebElement):-
		WebElement table = driver.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']");
		
		// Step2: find the row count:- 
		List<WebElement> allRows = table.findElements(By.tagName("tr"));
		
		//Step3: Get the count of Rows:-
		int rows_count = allRows.size();
		System.out.println(rows_count);
		
		//Step4: pick first row from List:-
		WebElement firstRow = allRows.get(0);
		
		//Step5: find the columns of firstRow:- 
		List<WebElement> allColumn = firstRow.findElements(By.tagName("td"));
		
		//Step6: Get the count of columns:- 
		int col_count = allColumn.size();
		System.out.println(col_count);
		
		//Step7: pick second Column from columns List:-
		WebElement sec_cell = allColumn.get(1);
		
		//Step8: Read the train Name
		String trainName = sec_cell.getText();
		System.out.println(trainName);
		
	}

}











