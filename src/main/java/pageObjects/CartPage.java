package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
WebDriver driver;
	
	public CartPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = ".wc-proceed-to-checkout")
	private WebElement addToCartBtn;
	
	@FindBy(xpath = "//li[@id='nav-menu-item-cart']")
	private WebElement viewCartBtn;
	
	public void clickCheckoutBtn() {
		addToCartBtn.click();
		String txt = addToCartBtn.getText();
		System.out.println("Text for the checkout button is: " + txt);
		driver.navigate().to("http://shop.demoqa.com/checkout/");
	}
	
	public void clickViewCartBtn() {
		viewCartBtn.click();
	}

}
