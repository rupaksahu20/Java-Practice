/**
 * 
 */
package Java.SeleniumPractice;

import java.util.Iterator;
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
public class HandleWindowPopup {

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
		WebElement window1 = driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #1')]"));
		window1.click();

		// to handle the 3rd window popup
		// it will return Set of Strings
		Set<String> handler = driver.getWindowHandles();
		Iterator<String> it = handler.iterator();

		// using next(); we can get the window id
		String parentwindowid = it.next();
		System.out.println("Parent Window id " + parentwindowid);

		String childwindowid3 = it.next();
		System.out.println("3rd Child Window id " + childwindowid3);

		String childwindowid1 = it.next();
		System.out.println("1st Child Window id " + childwindowid1);

		// to switch the window from parent to 3rd child window popup
		driver.switchTo().window(childwindowid3);
		driver.manage().window().maximize();
		String childwindowTitle3 = driver.getTitle();
		System.out.println("3rd Child Window title " + childwindowTitle3);
		driver.close();

		// to switch the window from parent to 3rd child window popup
		driver.switchTo().window(childwindowid1);
		driver.manage().window().maximize();
		String childwindowTitle1 = driver.getTitle();
		System.out.println("1st Child Window title " + childwindowTitle1);
		driver.close();

		// Again Switch to the parent Window
		driver.switchTo().window(parentwindowid);
		String parentWindowtitle = driver.getTitle();
		System.out.println("Parent window Title " + parentWindowtitle);
		driver.quit();

	}

}
