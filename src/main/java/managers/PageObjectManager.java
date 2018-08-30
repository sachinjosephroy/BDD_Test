package managers;

import org.openqa.selenium.WebDriver;

import dataProvider.ConfigFileReader;
import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import pageObjects.ProdSearchPage;
import pageObjects.ProdViewPage;
import pageObjects.ReviewPage;

public class PageObjectManager {
	
	private WebDriver driver;
	private HomePage homepage;
	private CartPage cartpage;
	private CheckoutPage checkoutpage;
	private ProdSearchPage prodsearchpage;
	private ProdViewPage prodviewpage;
	private ReviewPage reviewpage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public HomePage getHomePage() {
		return (homepage == null) ? homepage = new HomePage(driver) : homepage;
	}
	
	public CartPage getCartPage() {
		return (cartpage == null) ? cartpage = new CartPage(driver) : cartpage;
	}
	
	public CheckoutPage getCheckoutPage() {
		return (checkoutpage == null) ? checkoutpage = new CheckoutPage(driver) : checkoutpage;
	}
	
	public ProdSearchPage getProdSearchPage() {
		return (prodsearchpage == null) ? prodsearchpage = new ProdSearchPage(driver) : prodsearchpage;
	}
	
	public ProdViewPage getProdViewPage() {
		return (prodviewpage == null) ? prodviewpage = new ProdViewPage(driver) : prodviewpage;
	}
	
	public ReviewPage getReviewPage() {
		return (reviewpage == null) ? reviewpage = new ReviewPage(driver) : reviewpage;
	}

}
