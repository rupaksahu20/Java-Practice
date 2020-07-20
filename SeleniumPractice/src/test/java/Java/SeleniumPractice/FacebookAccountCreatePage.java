/**
 * 
 */
package Java.SeleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Rupak
 *
 */
public class FacebookAccountCreatePage {

	public FacebookAccountCreatePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@name='firstname']")
	public WebElement txtbx_FirstName;

	@FindBy(xpath = "//input[@name='lastname']")
	public WebElement txtbx_LastName;

	@FindBy(xpath = "//input[@name='reg_email__']")
	public WebElement txtbx_mobile_Email;

	@FindBy(xpath = "//input[@name='reg_passwd__']")
	public WebElement txtbx_newPassword;

	@FindBy(xpath = "(//input[@name='sex'])[2]")
	public WebElement rbtn_male;

	
	
	public void enterFirstName(String fName) {
		
       txtbx_FirstName.sendKeys(fName);
	}
	
	public void enterLastName(String lName) {
		txtbx_LastName.sendKeys(lName);
	}
	
	
	public void entermobile_Email(String email) {
		txtbx_mobile_Email.sendKeys(email);
	}
	
	public void enterPassword(String pswd) {
		txtbx_newPassword.sendKeys(pswd);
	}
	
	public void checkMaleRadioButton() {
		rbtn_male.click();
	}
}
