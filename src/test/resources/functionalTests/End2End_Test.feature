Feature: Demo Shop online order

Scenario Outline: Order a product and verify the result
	Given User is on the home page
	When User searches for a product
	And User clicks on the first product in the search
	And User clicks on Add To Cart
	And User goes to the Cart page
	And User clicks on Checkout
	And User enters "<customer>" personal details
	And User selects Check payment option
	And User agrees to the Terms and Conditions
	And User places the order
	Then the total amount should be displayed on the preview page
Examples:
	|customer|
	|Sachin|
	|Virender|