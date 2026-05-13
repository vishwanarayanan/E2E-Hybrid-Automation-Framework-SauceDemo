package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InventoryPage {
	
	WebDriver driver;
	
	public  InventoryPage(WebDriver driver ) {
		this.driver =driver;
		
	}
	
	By InventoryTitle = By.className("title");
	
	public boolean IsInventoryPageDisplayed() {
		
		return driver.findElement(InventoryTitle).isDisplayed();
	}

}
