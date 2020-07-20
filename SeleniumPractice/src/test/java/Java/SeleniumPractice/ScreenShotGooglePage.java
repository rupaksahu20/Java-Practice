/**
 * 
 */
package Java.SeleniumPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Rupak
 *
 */
public class ScreenShotGooglePage {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		//Take Screenshot and store as a file format 
		File file=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		
		//now copy the screenshot to desired location using copy file method
		
		FileUtils.copyFile(file, new File("./target/Screenshots/google.png"));
		
		driver.quit();
		
	}

}
