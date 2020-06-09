/**
 * 
 */
package Java.SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * @author Rupak
 *
 */

//Here is the Singleton pattern we used  for our BaseClass
public class DriverInit {
	
	private static DriverInit instanceDriver=null;
	private WebDriver driver;
	
	private DriverInit() {
		
	}
	
	public WebDriver openBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
		driver = new ChromeDriver();
		return driver;
	}
	
	public static DriverInit getInstance() {
		if(instanceDriver==null)
			instanceDriver=new DriverInit();
		return instanceDriver;
	}

}
