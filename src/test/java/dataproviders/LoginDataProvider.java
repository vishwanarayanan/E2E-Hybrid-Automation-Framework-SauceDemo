package dataproviders;
import constants.Constants;
import org.testng.annotations.DataProvider;

import utils.ExcelUtil;

public class LoginDataProvider {

	    @DataProvider(name = "loginData")
	    public Object[][] getLoginData() {

	     //   String path = System.getProperty("user.dir")+ "/testdata/LoginData.xlsx";
	    	
	    	String path = Constants.TEST_DATA_PATH;

	        System.out.println("Excel Path: " + path);
	        
	        return ExcelUtil.getTestData(
	                path,
	                Constants.LOGIN_SHEET);
	    }
	}
	

