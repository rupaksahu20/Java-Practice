/**
 * 
 */
package Java.SeleniumPractice;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Rupak
 *
 */



public class FBLoginPage extends FacebookAccountCreatePage {

	public FBLoginPage(WebDriver driver) {
		super(driver);
	}

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		FacebookAccountCreatePage fap=new FacebookAccountCreatePage(driver);
		
		fap.clickonCreateNewAcnt();
		
//		Set<String> handler = driver.getWindowHandles();
//		Iterator<String> it = handler.iterator();
//		
//
//		// using next(); we can get the window id
//		String parentwindowid = it.next();
//		System.out.println("Parent Window id " + parentwindowid);
//
//		String childwindowid3 = it.next();
//		System.out.println("3rd Child Window id " + childwindowid3);
//		driver.switchTo().window(childwindowid3);
			Thread.sleep(3000);
		
		
		fap.enterFirstName("Rupak");
		Thread.sleep(3000);
		fap.enterLastName("Sahu");
		fap.entermobile_Email("rupaksahu20@gmail.com");
		fap.enterPassword("Rupaksahu123@20");
		fap.checkMaleRadioButton();
	}

}
