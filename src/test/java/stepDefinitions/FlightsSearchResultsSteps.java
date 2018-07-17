package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pageObjects.FlightsSearchResultsPage;
import cucumber.TestContext;
import cucumber.api.java.en.When;

public class FlightsSearchResultsSteps {

	WebDriver driver;
	TestContext testContext;
	FlightsSearchResultsPage flightsSearchResultsPage;
	
	public FlightsSearchResultsSteps(TestContext testContext){
		this.testContext = testContext;
		flightsSearchResultsPage = testContext.getPageObjectManager().getFlightsSearchResultsPage();
	}
	
	@When("^result appears for the provided journey search$")
	public void result_appears_for_the_provided_journey_search() {
		Assert.assertTrue(flightsSearchResultsPage.verifySearchResultsDisplayed());
	}
}
