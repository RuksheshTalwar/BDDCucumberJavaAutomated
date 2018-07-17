package managers;
import org.openqa.selenium.WebDriver;

import pageObjects.FlightsSearchPage;
import pageObjects.FlightsSearchResultsPage;
import pageObjects.HomePage;

public class PageObjectManager {
	private WebDriver driver;
	private HomePage homePage;
	private FlightsSearchPage flightsSearchPage;
	private FlightsSearchResultsPage flightsSearchResultsPage;

	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}
	
	public HomePage getHomePage() {
		if (homePage == null)
			return homePage = new HomePage(driver);
		else
			return homePage;
	}

	public FlightsSearchPage getFlightsSearchPage() {
		if (flightsSearchPage == null)
			return flightsSearchPage = new FlightsSearchPage(driver);
		else
			return flightsSearchPage;
	}

	public FlightsSearchResultsPage getFlightsSearchResultsPage() {
		if (flightsSearchResultsPage == null)
			return flightsSearchResultsPage = new FlightsSearchResultsPage(driver);
		else
			return flightsSearchResultsPage;
	}
}