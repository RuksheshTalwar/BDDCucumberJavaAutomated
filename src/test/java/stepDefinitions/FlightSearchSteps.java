package stepDefinitions;

import pageObjects.FlightsSearchPage;
import cucumber.TestContext;
import cucumber.api.java.en.When;

public class FlightSearchSteps {
	TestContext testContext;
	FlightsSearchPage flightsSearchPage;
	
	public FlightSearchSteps(TestContext testContext){
		this.testContext = testContext;
		flightsSearchPage = testContext.getPageObjectManager().getFlightsSearchPage();
	}

	@When("^user fills search flights form$")
	public void user_fills_search_flights_form()  {
		flightsSearchPage.fillSearchFlightsForm();
	}
}