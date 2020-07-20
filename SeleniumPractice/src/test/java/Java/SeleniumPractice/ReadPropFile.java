/**
 * 
 */
package Java.SeleniumPractice;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/**
 * @author Rupak
 *
 */
public class ReadPropFile {
	static WebDriver driver;

	/**
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {

		// To read the property file
		Properties prop = new Properties();

		FileInputStream ip = new FileInputStream(
				"D:\\Java-Practice\\SeleniumPractice\\src\\test\\java\\Java\\SeleniumPractice\\config.properties");

		prop.load(ip);

		String name = prop.getProperty("name");
		System.out.println(name);

		String url = prop.getProperty("url");

		String browserName = prop.getProperty("browser");
		System.out.println(browserName);

		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Library\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browserName.equals("FF")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Library\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browserName.equals("IE")) {
			System.setProperty("webdriver.ie.driver", "D:\\Library\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();

		driver.get(url);

		driver.findElement(By.xpath(prop.getProperty("firstName_xpath"))).sendKeys(prop.getProperty("firstName"));

		driver.findElement(By.xpath(prop.getProperty("lastName_xpath"))).sendKeys(prop.getProperty("lastName"));

		driver.findElement(By.xpath(prop.getProperty("emailid_xpath"))).sendKeys(prop.getProperty("emailid"));
	}

}
