package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseDriver;
import pages.LoginPage;

public class LaunchTest extends BaseDriver{
	
	@BeforeMethod
	public void setUp() {
		setup();
	}
	
	@Test
	public void openApplication() {
		System.out.println("Application launched Successfully");
	}
	
	
	public void loginTest() {
		
		LoginPage loginPage = new LoginPage(getDriver());
		loginPage.login(config.getUsername(),config.getPassword());
		
		System.out.println("Login executed");
	}
	
	
	
	
	
	
	
	@AfterMethod
	public void tearDownTest() {
		tearDown();
	}

}
