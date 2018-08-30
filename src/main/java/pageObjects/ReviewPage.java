package pageObjects;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import selenium.Wait;

public class ReviewPage {
	
WebDriver driver;
	
	public ReviewPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//ul[@class='woocommerce-thankyou-order-details order_details']//span[@class='woocommerce-Price-amount amount']")
	private WebElement amountText;
	
	@FindAll(@FindBy(css = ".order_item"))
	private List<WebElement> prd_List;
	
	public String reviewAmount() {
		Wait.untilJqueryIsDone(driver);
		String amt = amountText.getText();
		return amt;
	}
	
	public List<String> getProductNames() {
		List<String> productNames = new ArrayList<>();
		for(WebElement element : prd_List) {
			productNames.add(element.findElement(By.cssSelector(".product-name")).getText());
		}
		return productNames;
	}

}
