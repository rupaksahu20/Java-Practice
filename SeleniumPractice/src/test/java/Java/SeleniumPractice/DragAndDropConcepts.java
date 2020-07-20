/**
 * 
 */
package Java.SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Rupak
 *
 */
public class DragAndDropConcepts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("https://jqueryui.com/droppable/");
		// there is a frame so,we have to switch the frame
		driver.switchTo().frame(0);

		Actions action = new Actions(driver);
		try {
			action.clickAndHold(driver.findElement(By.id("draggable")))
					.moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();
		} finally {
			driver.quit();
		}

	}

}
