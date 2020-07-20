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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Rupak
 *
 */
public class TakeElementScreenShot_Selenium4 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// implicit wait...it will wait for every element
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://app.hubspot.com/signup/crm/step/user-info");
		driver.manage().window().maximize();

//		WebElement lnk_attendance = driver.findElement(By.xpath("(//div[@class='headline'])//a[1]"));
//
//		WebElement lnk_payrol = driver.findElement(By.xpath("(//div[@class='headline'])//a[2]"));
//
//		WebElement lnk_attraWebSite = driver.findElement(By.xpath("(//div[@class='headline'])//a[3]"));
//		
//		WebElement img_AttraLogo=driver.findElement(By.xpath("//header[@id='masthead']//img"));
//		
//		WebElement img_blink365=driver.findElement(By.xpath("//div[@id='aF']//blink"));
//		
//		WebElement img_entirelink=driver.findElement(By.xpath("//div[@class='headline']"));
//		
//		WebElement tbl_HtmlTable=driver.findElement(By.id("customers"));
		WebElement formregister=driver.findElement(By.xpath("//form"));
		
//		takeElementScreenshot(lnk_attendance, "AMS");
//		takeElementScreenshot(lnk_payrol, "Allsec");
//		takeElementScreenshot(lnk_attraWebSite, "AttraWebSite");
//		takeElementScreenshot(img_AttraLogo, "Attra_Logo");
//		takeElementScreenshot(img_blink365, "Blink365");
//		takeElementScreenshot(img_entirelink, "HeaderAllLink");
		
		takeElementScreenshot(formregister, "Register");
		
		
		driver.quit();
	}
	
	public static void takeElementScreenshot(WebElement element, String fileName) {

		File file = element.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File("./target/Screenshots/" + fileName + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
