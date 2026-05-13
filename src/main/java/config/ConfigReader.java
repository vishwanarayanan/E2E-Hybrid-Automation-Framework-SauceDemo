package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	
	private Properties properties ;
	public ConfigReader() {
		try {
			
			FileInputStream file = new FileInputStream("src/test/resources/config.properties");
			properties = new Properties();
			properties.load(file);	
		}
		catch(IOException e){
			e.printStackTrace();
			throw new 
			RuntimeException("Failed to load config.properties");
			
		}
	}
	
	public String getBrowser() {
		  return properties.getProperty("browser");
	}
	public String getUrl() {
		return properties.getProperty("url");
	}
	public String getUsername() {
		return properties.getProperty("username");	
	}
	public String getPassword() {
		return properties.getProperty("password");
	}
	
	public int getExplicitWait() {
		
		return Integer.parseInt(properties.getProperty("explicitWait"));
	}

	
	
	
	
	
	
	
	
	
	
	

}
