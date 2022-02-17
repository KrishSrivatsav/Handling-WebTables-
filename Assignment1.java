package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver(); // Open a new chrome browser
		driver.manage().window().maximize(); // Maximize the opened chrome browser window
		driver.get("http://www.leafground.com/pages/table.html"); // Loads the URL in the opened browser
		// rows.
		WebElement tab = driver.findElement(By.id("table_id"));
		List<WebElement> listrows = driver.findElements(By.tagName("tr"));
		int rowSize = listrows.size();
		System.out.println("Row Count: " + rowSize);
		// table header
		List<WebElement> listheader = driver.findElements(By.tagName("th"));
		int headSize = listheader.size();
		System.out.println("header Count: " + headSize);
		// columns
		List<WebElement> listcolumns = driver.findElements(By.tagName("td"));
		int colSize = listcolumns.size();
		System.out.println("columns Count: " + colSize);

		WebElement learn = driver.findElement(By.xpath("//td[text()='Learn to interact with Elements']/following-sibling::td"));
		String Value = learn.getText();
		System.out.println(Value);

		WebElement chkbox = driver.findElement(By.xpath("//*[@id=\"table_id\"]/tbody/tr[3]/td[3]/input"));

		chkbox.click();
	}

}
