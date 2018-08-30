package dataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import enums.DriverType;
import enums.EnvironmentType;

public class ConfigFileReader {
	
	Properties prop;
	String configFilePath = "C:\\Users\\simir\\eclipse-workspace\\CRM_BDD_08272018\\configuration\\config.properties";
	
	public ConfigFileReader(){
		try {
			prop = new Properties();
			FileInputStream fis = new FileInputStream(configFilePath);
			prop.load(fis);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public String getDriverPath() {
		String driverpath = prop.getProperty("driverPath");
		return driverpath;
	}
	
	public Long getImplicitlyWait() {
		String iw = prop.getProperty("implicitWait");
		Long implicitwait = Long.parseLong(iw);
		return implicitwait;
		}
	
	public String getURL() {
		String appurl = prop.getProperty("url");
		return appurl;
	}
	
	public DriverType getBrowser() {
		DriverType dType = null;
		String browser = prop.getProperty("browser");
		if(browser == null || browser.equalsIgnoreCase("firefox")) {
			dType = DriverType.FIREFOX;
		}
		else if(browser.equalsIgnoreCase("chrome")) {
			dType = DriverType.CHROME;
		}
		else if(browser.equalsIgnoreCase("internetexplorer")) {
			dType = DriverType.INTERNETEXPLORER;
		}
		return dType;
	}
	
	public EnvironmentType getEnvironment() {
		EnvironmentType eType = null;
		String env = prop.getProperty("environment");
		if(env == null || env.equalsIgnoreCase("local")) {
			eType = EnvironmentType.LOCAL;
		}
		else if(env.equals("remote")) {
			eType = EnvironmentType.REMOTE;
		}
		return eType;
	}
	
	public Boolean getWindowSize() {
		Boolean bool = false;
		String windowSize = prop.getProperty("windowMaximize");
		if(windowSize != null) {
			bool = Boolean.valueOf(windowSize);
		}
		return bool;
	}

	public String getTestDataResourcePath(){
		String testDataResourcePath = prop.getProperty("testDataResourcePath");
		return testDataResourcePath;
	}
}