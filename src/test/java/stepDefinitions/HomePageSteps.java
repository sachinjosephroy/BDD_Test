package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import pageObjects.HomePage;

public class HomePageSteps {
	
	TestContext testContext;
	HomePage home;
	
	public HomePageSteps(TestContext context) {
		testContext = context;
		home = testContext.getPageObjectManager().getHomePage();
	}
	
	@Given("^User is on the home page$")
	public void user_is_on_the_home_page() {
	    home.getURL();
	}

	@When("^User searches for a product$")
	public void user_searches_for_a_product() {
	    home.navigateToURL();   
	}

}
