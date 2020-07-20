/**
 * 
 */
package Java.SeleniumPractice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * @author Rupak
 *
 */
public class TestNGBasics {
	
	
	//Pre-conditions annotations --starting with @Before 
	
//	@BeforeSuite---Set system property for chrome--I
//	@BeforeTest---Launch Chrome Browser--II
//	@BeforeClass---login to app--III
	
//	@BeforeMethod---Enter URL
//	@Test---Google logo test
//	@AfterMethod---logout form app
	
//	@BeforeMethod---Enter URL
//	@Test---Google Title Test
//	@AfterMethod---logout form app
	
//	@BeforeMethod---Enter URL
//	@Test--Search Test
//	@AfterMethod---logout form app
	
//	@AfterClass---close browser
//	@AfterTest---Delete All Cookies
	
	@BeforeSuite //1
	public void setup() {
		System.out.println("@BeforeSuite---Set system property for chrome");
	}
	
	
	@BeforeTest//2
	public void launchBrowser() {
		System.out.println("@BeforeTest---Launch Chrome Browser");
	}
	
	@BeforeClass//3
	public void login() {
		System.out.println("@BeforeClass---login to app");
	}
	
	
	
	@BeforeMethod//4
	public void enterURL() {
		System.out.println("@BeforeMethod---Enter URL");
		
	}
	
	
	//test --cases --Starting with @Test
	@Test//5
	public void googleTitleTest() { 
		System.out.println("@Test---Google Title Test");
	}
	
	@Test
	public void searchTest() {
		System.out.println("@Test--Search Test");
	}
	
	@Test
	public void googleLogoTest() {
		System.out.println("@Test---Google logo test");
	}
	//post conditions --starting with @After 
	@AfterMethod//6
	public void logout() {
		System.out.println("@AfterMethod---logout form app");
	}
	
	@AfterClass//7
	public void closeBrowser() {
		System.out.println("@AfterClass---close browser");
	}
	
	@AfterTest//8
	public void deleteAllCookies() {
		System.out.println("@AfterTest---Delete All Cookies");
	}
	
	
	
	/*@AfterSuite//9 
	public void generateTestReport() {
		System.out.println("Generate Test Report");
	}*/

}

