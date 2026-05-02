package tests;

import org.testng.annotations.Test;

import base.BaseDriver;
import pages.LoginPage;

public class LoginTest extends BaseDriver{
	
	@Test
	public void verifyLoginPageLoads() {
		System.out.println("Title:"+ getDriver().getTitle());
	}
	
	@Test
	public void verifyLogin() {
	
	LoginPage loginPage = new LoginPage(getDriver());
	
	loginPage.login(config.getUsername(), config.getPassword());
	System.out.println("Login attempted using config data");
	
	}
}
