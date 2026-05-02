package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.BaseDriver;

public class LaunchTest extends BaseDriver{
	
	@BeforeMethod
	public void setUp() {
		setup();
	}
	
	@Test
	public void openApplication() {
		System.out.println("Application launched Successfully");
	}
	
	@AfterMethod
	public void tearDownTest() {
		tearDown();
	}

}
