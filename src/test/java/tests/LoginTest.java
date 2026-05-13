package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseDriver;
import dataproviders.LoginDataProvider;
import pages.InventoryPage;
import pages.LoginPage;

public class LoginTest extends BaseDriver{
	
	@Test
	public void verifyLoginPageLoads() {
		System.out.println("Title:"+ getDriver().getTitle());
	}
	
	@Test(dataProvider ="loginData",
			dataProviderClass =LoginDataProvider.class)
	public void verifyLogin(String username,
            String password) {
	
	LoginPage loginPage = new LoginPage(getDriver());
	
	loginPage.login(username, password);
	
	
	InventoryPage inventoryPage = new InventoryPage(getDriver());
	
	Assert.assertTrue(inventoryPage.IsInventoryPageDisplayed() , "Login failed for user:" + username);
	
	//System.out.println("Login attempted using config data");
	System.out.println("Login attempted using: "  + username);
	
	
	
	
	}
}
