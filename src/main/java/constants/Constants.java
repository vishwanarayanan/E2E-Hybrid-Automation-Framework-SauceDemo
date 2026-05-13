package constants;

public class Constants {
	
	//Excel Test Data
	public static final String LOGIN_SHEET = "LoginData";
	
	public static final String TEST_DATA_PATH =System.getProperty("user.dir")
            + "/testdata/LoginData.xlsx";

	//Reports - It points to THIS exact file:reports/extent-report.html which is your generated automation report.
	public static final String REPORT_PATH = System.getProperty("user.dir")
            + "/reports/extent-report.html";
	
	//ScreenshotUtil Uses Constants.REPORTS_FOLDER instead of "reports/"
	public static final String REPORTS_FOLDER =
            System.getProperty("user.dir")
            + "/reports/";
	
	//Screenshots 
	 public static final String SCREENSHOT_PATH =
	            System.getProperty("user.dir") + "/screenshots/";

	
}
