/**
 * 
 */
package Java.SeleniumPractice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Rupak
 *
 */
public class WindowHandleConceptUsingForEachloop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);

		driver.get("http://popuptest.com/goodpopups.html");

		WebElement window3 = driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #3')]"));
		window3.click();
		
		Set<String>handler =driver.getWindowHandles();
		
		for(String window:handler) {
			if(!window.equals(handler)) {
				driver.switchTo().window(window);
				driver.manage().window().maximize();
			}
			
		}
		driver.quit();

	}

}
