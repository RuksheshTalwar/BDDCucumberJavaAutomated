package stepDefinitions;

import org.openqa.selenium.WebDriver;

import managers.PageObjectManager;
import managers.WebDriverManager;
import pageObjects.HomePage;
import cucumber.TestContext;
import cucumber.api.java.en.Given;

public class HomePageSteps {

	WebDriver driver;
	TestContext testContext;
	HomePage homePage;
	PageObjectManager pageObjectManager;
	WebDriverManager webDriverManager;
	
	public HomePageSteps(TestContext testContext){
		this.testContext = testContext;
		homePage = testContext.getPageObjectManager().getHomePage();
	}
	
	@Given("^user is on Flights Search page$")
	public void user_is_on_flights_search_page(){
		homePage.navigateTo("flights");
	}
	
	@Given("^user is on Hotels Search page$")
	public void user_is_on_hotels_search_page(){
		homePage.navigateTo("hotels");
	}
}
