package utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerUtil {

	public static final Logger logger = LogManager.getLogger(LoggerUtil.class);
	
	
	//Info logs 
	public static void info(String message) {
		logger.info(message);
		
	}
	
	//Error logs 
	public static void error(String message) {
		logger.error(message);
	}
	
	//Debug Logs 
	public static void debug(String message) {
		logger.debug(message);
	}
	
	
}