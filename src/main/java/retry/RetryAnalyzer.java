package retry;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import utils.LoggerUtil;

public class RetryAnalyzer implements IRetryAnalyzer {

	private int retrycount = 0;
	private static final int MAX_RETRY =2;
	
	@Override
	public boolean retry(ITestResult result) {
		
		if(retrycount<MAX_RETRY) {
			
			retrycount++;
			
			LoggerUtil.info("Retrying test:"+ result.getName() + "|RetryCount " + retrycount);
			
			return true;
		}
		
		
		return false;
	}

}
