/**
 * 
 */
package Java.SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Rupak
 *
 */
public class TestNGVerbose_Concept {
	WebDriver driver;
	
	@BeforeMethod
	public void setup() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		System.out.println("@BeforeMethod invoked");
	}
	
	@Test(priority=-2)
	public void fbTitleTest() {
		String title=driver.getTitle();
		System.out.println("The title is : "+ title);
		Assert.assertEquals(title, "Facebook – log in or sign up");
		
	}
	
	@Test(priority=-3)
	public void logoTest() {
		String logo=driver.findElement(By.xpath("//*[@id=\"blueBarDOMInspector\"]//i//u")).getText();
		System.out.println("The logo name is : " + logo);
		Assert.assertEquals(logo, "Facebook");
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
