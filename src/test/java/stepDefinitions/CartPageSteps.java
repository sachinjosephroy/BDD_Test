package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import pageObjects.CartPage;

public class CartPageSteps {
	
	TestContext testContext;
	CartPage cart;
	
	public CartPageSteps(TestContext context) {
		testContext = context;
		cart = testContext.getPageObjectManager().getCartPage();
	}
	
	@When("^User goes to the Cart page$")
	public void user_goes_to_the_Cart_page() {
	    cart.clickViewCartBtn();	    
	}

	@When("^User clicks on Checkout$")
	public void user_clicks_on_Checkout() {
	    cart.clickCheckoutBtn();
	}

}
