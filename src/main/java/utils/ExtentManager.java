package utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {
	
	private static  ExtentReports extent;
   public static ExtentReports getInstance() {
		
		if (extent==null) {
			
			String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
			
			ExtentSparkReporter reporter = new ExtentSparkReporter("reports/ExtentReport.html");
			reporter.config().setReportName("Automation Test Report");
			reporter.config().setDocumentTitle("E2E Automation Results");
			
			extent = new ExtentReports();
			extent.attachReporter(reporter);
			
			extent.setSystemInfo("Tester", "Vishwa");
			extent.setSystemInfo("Framework", "Selenium + TestNG");
			
			
		}
		
		return extent;
	}
	
	
	

}
