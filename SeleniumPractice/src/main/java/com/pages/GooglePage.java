package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GooglePage extends BasePage {
	
	//page actions:
	
	public void googleSearchTest() {
		WebElement searchbox=driver.findElement(By.name("q"));
		searchbox.clear();
		searchbox.sendKeys("naveen automation labs");
		searchbox.submit();
		
		driver.findElements(By.xpath("//h3")).stream().forEach(ele ->System.out.println(ele.getText()));
		
	}
	
	public void tearDown() {
		driver.quit();
	}

}
