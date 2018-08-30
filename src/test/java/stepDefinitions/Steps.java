/*package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import dataProvider.ConfigFileReader;
import managers.FileReaderManager;
import managers.PageObjectManager;
import managers.WebDriverManager;
import pageObjects.CartPage;
import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import pageObjects.ProdSearchPage;
import pageObjects.ProdViewPage;
import pageObjects.ReviewPage;

public class Steps {
	
	WebDriver driver;
	CheckoutPage checkout;
	PageObjectManager pageobjmgr;
	HomePage home;
	CartPage cart;
	ProdSearchPage prodsearch;
	ProdViewPage prodview;
	ReviewPage review;
	ConfigFileReader config;
	FileReaderManager fileReader;
	WebDriverManager webDriverMgr;
	
	@Given("^User is on the home page$")
	public void user_is_on_the_home_page() throws Throwable {
		webDriverMgr = new WebDriverManager();
		driver = webDriverMgr.getDriver();
		pageobjmgr = new PageObjectManager(driver);
		home = pageobjmgr.getHomePage();
	    home.getURL();
	}

	@When("^User searches for a product$")
	public void user_searches_for_a_product() throws Throwable {
	    home.navigateToURL();
	    
	}

	@When("^User clicks on the first product in the search$")
	public void user_clicks_on_the_first_product_in_the_search() throws Throwable {
	    prodsearch = pageobjmgr.getProdSearchPage();
		prodsearch.clickProductSearched();
	}

	@When("^User clicks on Add To Cart$")
	public void user_clicks_on_Add_To_Cart() throws Throwable {
	    prodview = pageobjmgr.getProdViewPage();
	    prodview.clickAddToCart();
	    
	}

	@When("^User goes to the Cart page$")
	public void user_goes_to_the_Cart_page() throws Throwable {
	    home.clickViewCartBtn();	    
	}

	@When("^User clicks on Checkout$")
	public void user_clicks_on_Checkout() throws Throwable {
	    cart = pageobjmgr.getCartPage();
	    cart.clickCheckoutBtn();
	}
	
	@When("^User enters personal details$")
	public void user_enters_personal_details() throws Throwable {
		checkout = pageobjmgr.getCheckoutPage();
		checkout.enterFirstName();
		checkout.enterLastName();
		checkout.enterEmail();
		checkout.enterPhone();
		checkout.enterAddress();
		checkout.enterCity();
		checkout.clickStateDropDown();
		checkout.selectState();
		checkout.enterZipcode();
		checkout.selectShipToDiffChk(true);
	}
	
	@When("^User selects Check payment option$")
	public void user_selects_Check_payment_option() throws Throwable {
		checkout.selectCheckPaymentRadio();
	}
	
	@When("^User agrees to the Terms and Conditions$")
	public void user_agrees_to_the_Terms_and_Conditions() throws Throwable {
		checkout.clickTermsRadio();	    
	}
	
	@When("^User places the order$")
	public void user_places_the_order() throws Throwable {
		checkout.clickPlaceOrder();   
	}
	
	@Then("^the total amount should be displayed on the preview page$")
	public void the_total_amount_should_be_displayed_on_the_preview_page() throws Throwable {
	    Thread.sleep(3000);
		review = pageobjmgr.getReviewPage();
		String amount = review.reviewAmount();
	    Assert.assertEquals("£58.00", amount);
	}

}
*/