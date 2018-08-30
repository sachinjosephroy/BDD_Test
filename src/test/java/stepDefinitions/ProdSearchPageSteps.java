package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import enums.Context;
import pageObjects.ProdSearchPage;

public class ProdSearchPageSteps {
	
	TestContext testContext;
	ProdSearchPage prodsearch;
	
	public ProdSearchPageSteps(TestContext context) {
		testContext = context;
		prodsearch = testContext.getPageObjectManager().getProdSearchPage();
	}
	
	@When("^User clicks on the first product in the search$")
	public void user_clicks_on_the_first_product_in_the_search() {
		String productName = prodsearch.getProductName(0); 
		testContext.scenarioContext.setContext(Context.PRODUCT_NAME, productName);
		prodsearch.clickProductSearched();
	}

}
