package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dataProvider.ConfigFileReader;
import managers.FileReaderManager;
import managers.PageObjectManager;
import managers.WebDriverManager;

public class HomePage {
	
	WebDriver driver;
	PageObjectManager pageobjmgr;
	ConfigFileReader config;
	FileReaderManager fileReader;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void getURL() {
		fileReader = new FileReaderManager();
		driver.get(fileReader.getInstance().getConfigReader().getURL());
	}
	
	public void navigateToURL() {
		driver.navigate().to(fileReader.getInstance().getConfigReader().getURL() + "?s=dress&post_type=product");
	}
	
}
