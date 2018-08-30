package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProdViewPage {
	
WebDriver driver;
	
	public ProdViewPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = ".single_add_to_cart_button.button.alt")
	private WebElement addToCartBtn;
	
	public void clickAddToCart() {
		addToCartBtn.click();
	}

}
