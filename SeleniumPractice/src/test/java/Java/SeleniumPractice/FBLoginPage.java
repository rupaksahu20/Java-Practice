/**
 * 
 */
package Java.SeleniumPractice;

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
	 */
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		FacebookAccountCreatePage fap=new FacebookAccountCreatePage(driver);
		fap.enterFirstName("Rupak");
		fap.enterLastName("Sahu");
		fap.entermobile_Email("rupaksahu20@gmail.com");
		fap.enterPassword("Rupaksahu123@20");
		fap.checkMaleRadioButton();
	}

}
