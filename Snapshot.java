package week4.day1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Snapshot {

	public static void main(String[] args) throws IOException {
		
		// To setup the Webdrivermanager which it will takecare of everything..
				// Instead of system.setproperty we can use this..
				WebDriverManager.chromedriver().setup();

				// Open the browser..
				ChromeDriver driver = new ChromeDriver();
				// Load the URL
				driver.get("https://erail.in/");
				// Maximize the browser
				driver.manage().window().maximize();
				
				//Two types..
				File source = driver.getScreenshotAs(OutputType.FILE);
				File dest = new File("./src/main/resources/snaps/Img001.jpg");
				FileUtils.copyFile(source, dest);

	}

}
