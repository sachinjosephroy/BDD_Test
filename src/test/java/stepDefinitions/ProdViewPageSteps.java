package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import pageObjects.ProdViewPage;

public class ProdViewPageSteps {
	
	TestContext testContext;
	ProdViewPage prodview;
	
	public ProdViewPageSteps(TestContext context) {
		testContext = context;
		prodview = testContext.getPageObjectManager().getProdViewPage();
	}
	
	@When("^User clicks on Add To Cart$")
	public void user_clicks_on_Add_To_Cart() {
	    prodview.clickAddToCart();
	    
	}

}
