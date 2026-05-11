package utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {

	public static String captureScreenShot(WebDriver driver, String testName) {
		
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String path  = "reports/" + testName + ".png";
		
		try {
			Files.copy(src.toPath(), new File(path).toPath());
			}catch(IOException e) {
				
				e.printStackTrace();
				
			//	LoggerUtil.error("Screenshot failed", e);
			}
		
		return path;
		
	}
	
	
}
