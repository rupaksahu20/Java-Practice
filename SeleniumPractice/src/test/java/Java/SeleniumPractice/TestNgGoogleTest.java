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

/**
 * @author Rupak
 *
 */
public class TestNgGoogleTest {
	
	WebDriver driver;
	
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
	
	@Test(priority=1,groups="Title test")
	public void googleTitleTest() {
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Google");
	}
	
	@Test(priority=2,groups="Logo Test")
	public void googleLogoTest() {
		boolean b=driver.findElement(By.id("hplogo")).isDisplayed();
	}
	
	@Test(priority=3,groups="Link Test")
	public void googleMailLnikTest() {
		boolean b=driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	
	@Test(priority=4,groups="Test")
	public void test1() {
		System.out.println("Test 1");
	}
	
	@Test(priority=5,groups="Test")
	public void test2() {
		System.out.println("Test 2");
	}
	
	@Test(priority=6,groups="Test")
	public void test3() {
		System.out.println("Test 3");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}

}
