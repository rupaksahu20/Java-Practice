/**
 * 
 */
package Java.SeleniumPractice;

import org.testng.annotations.Test;

/**
 * @author Rupak
 *
 */
public class TestNgDependsOn {
	
	@Test
	public void loginTest() {
		System.out.println("Login Test");
		int i=9/0;
	}
	
	@Test(dependsOnMethods="loginTest")
	public void searchTest() {
		System.out.println("Search Test");
	}

}
