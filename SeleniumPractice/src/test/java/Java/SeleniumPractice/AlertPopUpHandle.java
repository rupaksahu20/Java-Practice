/**
 * 
 */
package Java.SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Rupak
 *
 */
public class AlertPopUpHandle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// implicit wait...it will wait for every element
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		WebElement btn_SignIn=driver.findElement(By.name("proceed"));
		click(btn_SignIn);
		
		Alert alert=driver.switchTo().alert();
		String alertMsg=alert.getText();
		if(alertMsg.equals("Please enter a valid user name")) {
			System.out.println("Valid Alert Message");
		}else {
			System.out.println("Invalid alert message");
		}
		alert.accept();
		
		driver.quit();
		
	}
	
	public static void click(WebElement element) {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		element.click();
	}

}
