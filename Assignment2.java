package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(); // Open a new chrome browser
		driver.manage().window().maximize(); // Maximize the opened chrome browser window
		driver.get("http://www.leafground.com/pages/sorttable.html"); // Loads the URL in the opened browser
		// table rows
		// WebElement tablelist = driver.findElement(By.id("table_id"));

		List<WebElement> colNames = driver.findElements(By.xpath("//table[@id='table_id']//tr/td[2]"));
		List<String> colText = new ArrayList<String>();

		for (int i = 0; i < colNames.size(); i++) {
			String text = colNames.get(i).getText();
			colText.add(text);
		}
		Collections.sort(colText);
//	 Collections.reverse(nameText);
		System.out.println("Sorted the name in asci order:" + colText);

		List <WebElement> headerNames = driver.findElements(By.xpath("//*[@id=\"table_id\"]/thead/tr/th[2]"));
//		((WebElement) headerNames).click();
		List<String> headerText = new ArrayList<String>();

		for (int j = 0; j < headerText.size(); j++) {
			String Text1 =  headerNames.get(j).getText();
			headerText.add(Text1);

		}
		Collections.sort(headerText);
		Collections.reverse(headerText);
		
		System.out.println("Sorted the name in reverse order:" + headerText);
		
		if (colNames.equals(headerNames))
			
		{
			System.out.println("Both the list contains same values.");
		}
		else
		{
			System.out.println("Both the list does not contains same values.");
		}

	}

}
