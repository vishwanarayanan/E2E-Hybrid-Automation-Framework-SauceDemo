package listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import base.BaseDriver;
import utils.ExtentManager;
import utils.ScreenshotUtil;

public class TestListener extends BaseDriver implements ITestListener{

	ExtentReports extent =  ExtentManager.getInstance();
	ThreadLocal<ExtentTest>test= new ThreadLocal<>();
	//ExtentTest test;
	
	
	
	@Override 
	public void onTestStart(ITestResult result) {
		ExtentTest extentTest = extent.createTest(result.getName());
	   test.set(extentTest);
	}
	
	
	@Override
	public void onTestSuccess(ITestResult result) {
	    test.get().pass("Test Passed");
	  }
	
	
	@Override
	public void onTestFailure(ITestResult result) {
		   test.get().fail(result.getThrowable());
		   
		   
		   String screenshotPath = ScreenshotUtil.captureScreenShot(getDriver(), result.getName());
		   test.get().addScreenCaptureFromPath(screenshotPath);
		  }
	
	 @Override
	    public void onTestSkipped(ITestResult result) {

	        test.get().skip("Test Skipped");
	    }

	
	
	  @Override
	    public void onFinish(ITestContext context) {
	        extent.flush();
	    }
	}
	

	
	
	
