/**
 * 
 */
package Java.SeleniumPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author Rupak
 *
 */
public class JavaScriptExecuterConcepts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		WebElement btn_login=driver.findElement(By.xpath("//input[@value='Log In']"));
		
		flash(btn_login, driver);
	}
	
	public static void flash(WebElement element,WebDriver driver) {
		JavascriptExecutor js=(JavascriptExecutor)(driver);
		String bgcolor=element.getCssValue("backgroundColor");
		for(int i=0;i<100;i++) {
		changecolor("rgb(0,200,0)", element, driver);//1
		changecolor(bgcolor, element, driver);//2
		}
	}
	
	public static void changecolor(String color,WebElement element,WebDriver driver) {
		JavascriptExecutor js= (JavascriptExecutor)(driver);
		js.executeScript("arguments[0].style.backgroundColor='"+color+"'", element);
		
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
