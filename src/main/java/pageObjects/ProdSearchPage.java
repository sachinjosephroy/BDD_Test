package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProdSearchPage {
	
WebDriver driver;
	
	public ProdSearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(@href, 'http://shop.demoqa.com/product/39mm-mesh-bracelet-watch/')]")
	private List<WebElement> prodSrchResult;
	
	@FindBy(css = ".noo-product-inner")
	private List<WebElement> prd_List;
	
	public void clickProductSearched() {
		WebElement ele = prodSrchResult.get(1);
	    Actions act = new Actions(driver);
	    act.moveToElement(ele).click().build().perform();
	}
	
	public void select_Product(int productNumber) {
		prd_List.get(productNumber).click();
	}
	
	public String getProductName(int productNumber) {
		return prd_List.get(productNumber).findElement(By.cssSelector("h3")).getText();
	}

}
