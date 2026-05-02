package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import config.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;

// i've implemented ThreadLocal WebDriver to support parallel execution and used WebDriverManger to handle driver binaries dynamically

public class BaseDriver {
	
	//protected WebDriver driver;
	
	protected static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	protected ConfigReader config;

@BeforeMethod	
public void setup() {
	
	config = new ConfigReader();
	
	String browser = config.getBrowser();
	
	
	if(browser.equalsIgnoreCase("chrome")) {
		//driver = new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.set(new ChromeDriver());
		
	}else {
		throw new
	RuntimeException("Browser not supported");	
	}
	
	getDriver().manage().window().maximize();
	getDriver().get(config.getUrl());
}	

public WebDriver getDriver() {
	return driver.get();
}

@AfterMethod
public void tearDown() {
	if (getDriver() !=null) {
		getDriver().quit();
		driver.remove();
	}
	
}
	
}
