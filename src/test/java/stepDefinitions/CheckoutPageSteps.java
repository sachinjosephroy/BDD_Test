package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.When;
import managers.FileReaderManager;
import pageObjects.CheckoutPage;
import testDataTypes.Customer;

public class CheckoutPageSteps {
	
	TestContext testContext;
	CheckoutPage checkout;
	
	public CheckoutPageSteps(TestContext context) {
		testContext = context;
		checkout = testContext.getPageObjectManager().getCheckoutPage();
	}

	@When("^User enters \\\"(.*)\\\" personal details$")
	public void user_enters_personal_details(String customerName) throws InterruptedException {
		Customer customer = FileReaderManager.getInstance().getJsonReader().getCustomerByName(customerName);
		checkout.fill_PersonalDetails(customer);
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

}
