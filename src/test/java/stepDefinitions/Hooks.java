package stepDefinitions;

import cucumber.TestContext;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	TestContext testContext;
	
	public Hooks(TestContext context) {
		testContext = context;
	}
	
	@Before
	public void setUp() {
		
	}
	
	@After
	public void tearDown() {
		testContext.getWebDriverManager().closeDriver();
	}

}
