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
public class TakeScreenShotsConcept {
	static WebDriver driver;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

      WebDriverManager.chromedriver().setup();
      driver =new ChromeDriver();
      
      driver.get("https://intranet.attra.com");
      driver.manage().window().maximize();
      takeScreenShot("Attra_Intranet");
      
      
    
     
     
      
      driver.quit();
	}
	
	public static void takeScreenShot(String filename) {
		// 1. Take screenshot and store it as a file format:
		File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		// 2.now copy the screenshot to desired location using copy file method:
		try {
			FileUtils.copyFile(file,new File( "D:\\Java-Practice\\SeleniumPractice\\" + filename + " .jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	

}
