package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import selenium.Wait;
import testDataTypes.Customer;

public class CheckoutPage {
	
WebDriver driver;
	
	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#billing_first_name")
	private WebElement firstNameField;

	@FindBy(css = "#billing_last_name")
	private WebElement lastNameField;
	
	@FindBy(css = "#billing_email")
	private WebElement emailField;
	
	@FindBy(css = "#billing_phone")
	private WebElement phoneField;
	
	@FindBy(css = "#billing_address_1")
	private WebElement addressField;
	
	@FindBy(css = "#billing_city")
	private WebElement cityField;
	
	@FindBy(css = "#billing_state_field .select2-arrow")
	private WebElement stateField;
	
	@FindBy(xpath = "//div[@id='select2-drop']//ul//li")
	private List<WebElement> stateBtn;
	
	@FindBy(css = "#billing_postcode")
	private WebElement zipcodeField;
	
	@FindBy(css = "#ship-to-different-address-checkbox")
	private WebElement shipToDifferentChk;
	
	@FindBy(css = "#payment_method_cheque")
	private WebElement checkPaymentRadio;
	
	@FindBy(css = "#terms")
	private WebElement termsRadio;
	
	@FindBy(css = "#place_order")
	private WebElement placeOrderBtn;
	
	public void enterFirstName(String fname) {
		firstNameField.sendKeys(fname);
	}
	
	public void enterLastName(String lname) {
		lastNameField.sendKeys(lname);
	}
	
	public void enterEmail(String email) {
		emailField.sendKeys(email);
	}
	
	public void enterPhone(String phone) {
		phoneField.sendKeys(phone);
	}
	
	public void enterAddress(String address) {
		addressField.sendKeys(address);
	}
	
	public void enterCity(String city) {
		cityField.sendKeys(city);
	}
	
	public void clickStateDropDown() {
		stateField.click();
	}
	
	public void selectState(String state) {
		for(WebElement st : stateBtn){
			if(st.getText().equals(state)) {
				st.click();	
				Wait.untilJqueryIsDone(driver);
				break;
			}		
		}
	}
	
	public void enterZipcode(String zip) {
		zipcodeField.sendKeys(zip);
	}
	
	public void fill_PersonalDetails(Customer customer) throws InterruptedException {
		enterFirstName(customer.firstName);
		enterLastName(customer.lastName);
		enterPhone(customer.phoneNumber.mob);
		enterEmail(customer.emailAddress);
		//select_Country("India");
		enterCity(customer.address.city);
		enterAddress(customer.address.streetAddress);
		enterZipcode(customer.address.postCode);
		clickStateDropDown();
		selectState(customer.address.county);
		
	}
	
	public void selectShipToDiffChk(boolean value) {
		if(value) {
			Actions act = new Actions(driver);
			act.moveToElement(shipToDifferentChk).click().build().perform();
		}
	}
	
	public void selectCheckPaymentRadio() {
		Wait.untilJqueryIsDone(driver);
		Actions act = new Actions(driver);
		act.moveToElement(checkPaymentRadio).click().build().perform();
	}
	
	public void clickTermsRadio() {
		Wait.untilJqueryIsDone(driver);
		Actions act = new Actions(driver);
		act.moveToElement(termsRadio).click().build().perform();
	}
	
	public void clickPlaceOrder() {
		Actions act = new Actions(driver);
		act.moveToElement(placeOrderBtn).click().build().perform();
		Wait.untilJqueryIsDone(driver);
		Wait.untilPageLoadComplete(driver);
	}

}
