package dataproviders;

import org.testng.annotations.DataProvider;

import utils.ExcelUtil;

public class LoginDataProvider {

	    @DataProvider(name = "loginData")
	    public Object[][] getLoginData() {

	        String path =
	                System.getProperty("user.dir")
	                + "/testdata/LoginData.xlsx";

	        System.out.println("Excel Path: " + path);
	        
	        return ExcelUtil.getTestData(
	                path,
	                "LoginData");
	    }
	}
	

