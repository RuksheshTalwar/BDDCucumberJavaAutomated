package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightsSearchResultsPage {

	@FindBy(className = "searchSummary")
	private WebElement label_SearchSummary;
	
	public FlightsSearchResultsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public boolean verifySearchResultsDisplayed(){
		return label_SearchSummary.isDisplayed();
	}
	
	
}
