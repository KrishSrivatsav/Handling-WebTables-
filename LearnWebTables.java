package week4.day1;


import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTables {

	public static void main(String[] args) {
	
		// To setup the Webdrivermanager which it will takecare of everything..
		// Instead of system.setproperty we can use this..
		WebDriverManager.chromedriver().setup();

		// Open the browser..
		ChromeDriver driver = new ChromeDriver();
		// Load the URL
		driver.get("https://erail.in/");
		// Maximize the browser
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        WebElement from = driver.findElement(By.id("txtStationFrom"));
        from.clear();
        from.sendKeys("TPJ", Keys.TAB);
        WebElement to = driver.findElement(By.id("txtStationTo"));
        to.clear();
        to.sendKeys("MDU", Keys.TAB);
        
        driver.findElement(By.id("chkSelectDateOnly")).click();
        
        //To get all the train names...
     // Finding element through a locator from a webpage
     		WebElement elementTable = driver.findElement(By.xpath("//table[@class='DataTable TrainList TrainListHeader']"));

     		// Finding the row from the elementTable found
     		List<WebElement> listRows = elementTable.findElements(By.tagName("tr"));

     		// Iterating Rows from the table
     		for (int i = 0; i < listRows.size(); i++) {
     			WebElement currentRow = listRows.get(i);
     			List<WebElement> listColumns = currentRow.findElements(By.tagName("td"));

     			// Iterating Cols from the row
     			for (int j = 0; j < listColumns.size(); j++) {
     				System.out.println(listColumns.get(j).getText());
     			}


}
	
}
}
