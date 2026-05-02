package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import config.ConfigReader;



public class BaseDriver {
	
	protected WebDriver driver;
	protected ConfigReader config;

public void setup() {
	
	config = new ConfigReader();
	
	String browser = config.getBrowser();
	
	
	if(browser.equalsIgnoreCase("chrome")) {
		driver = new ChromeDriver();
	}else {
		throw new
	RuntimeException("Browser not supported");	
	}
	
	driver.manage().window().maximize();
	driver.get(config.getUrl());
}	


public void tearDown() {
	if (driver !=null) {
		driver.quit();
	}
	
}
	
}
