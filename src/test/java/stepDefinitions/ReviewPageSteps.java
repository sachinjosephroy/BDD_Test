package stepDefinitions;

import org.junit.Assert;

import cucumber.TestContext;
import cucumber.api.java.en.Then;
import enums.Context;
import pageObjects.ReviewPage;

public class ReviewPageSteps {
	
	TestContext testContext;
	ReviewPage review;
	
	public ReviewPageSteps(TestContext context) {
		testContext = context;
		review = testContext.getPageObjectManager().getReviewPage();
	}

	@Then("^the total amount should be displayed on the preview page$")
	public void the_total_amount_should_be_displayed_on_the_preview_page() {
		/*String amount = review.reviewAmount();
	    Assert.assertEquals("£58.00", amount);*/
		
		String productName = (String)testContext.scenarioContext.getContext(Context.PRODUCT_NAME);
		Assert.assertTrue(review.getProductNames().stream().filter(x -> x.contains(productName)).findFirst().get().length()>0);
	}

}
