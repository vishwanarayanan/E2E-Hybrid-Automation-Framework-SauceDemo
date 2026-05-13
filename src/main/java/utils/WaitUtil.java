package utils;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import config.ConfigReader;

public class WaitUtil {
          
	WebDriver driver;
	WebDriverWait wait;
	ConfigReader config;
	
	public WaitUtil(WebDriver driver) {
		this.driver =driver;
		config = new ConfigReader();
		wait = new WebDriverWait(driver,Duration.ofSeconds(config.getExplicitWait()));
	}
	
	public WebElement waitForVisibility(By locator) {
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	  
	public WebElement waitForClickability(By locator) {
		return wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	public boolean waitForTitleContains(String title) {
		
		return wait.until(ExpectedConditions.titleContains(title));
	}
	
}
