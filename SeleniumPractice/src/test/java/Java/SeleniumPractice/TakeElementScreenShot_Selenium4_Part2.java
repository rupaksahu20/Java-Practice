/**
 * 
 */
package Java.SeleniumPractice;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Rupak
 *
 */
public class TakeElementScreenShot_Selenium4_Part2 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// implicit wait...it will wait for every element
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://intranet.attra.com");
		driver.manage().window().maximize();

		WebElement lnk_attendance = driver.findElement(By.xpath("(//div[@class='headline'])//a[1]"));

		WebElement lnk_payrol = driver.findElement(By.xpath("(//div[@class='headline'])//a[2]"));

		WebElement lnk_attraWebSite = driver.findElement(By.xpath("(//div[@class='headline'])//a[3]"));
		takeElementScreenShot(lnk_payrol, "AllSec_HRO");
		
	    driver.quit();
		
	}
	
	public static void takeElementScreenShot(WebElement element, String fileName) {

		TakesScreenshot file = ((TakesScreenshot) element);
		File srcfile = file.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcfile, new File("./target/Screenshots/" + fileName + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
