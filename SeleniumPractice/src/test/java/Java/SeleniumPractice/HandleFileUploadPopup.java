/**
 * 
 */
package Java.SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Rupak
 *
 */
public class HandleFileUploadPopup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// implicit wait...it will wait for every element
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://html.com/input-type-file/");
		driver.manage().window().maximize();
		driver.findElement(By.name("fileupload")).sendKeys("C:\\Users\\Rupak\\Downloads\\Attra CV_Rupak Sahu.docx");
		
	}

}
