package pageObjects;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlightsSearchPage{

	WebDriver driver;
	
	@FindBy(id = "OneWay") 
	private WebElement radio_OneWay;
	
	@FindBy(id = "FromTag") 
	private WebElement textBox_From;
	
	@FindBy(id = "ToTag") 
	private WebElement textBox_To;
	
	@FindBy(id = "DepartDate")
	private WebElement textBox_Depart_On;
	
	@FindBy(id = "SearchBtn")
	private WebElement button_SearchFlights;
	
	public FlightsSearchPage(WebDriver driver) {
		this.driver =  driver;
		PageFactory.initElements(driver, this);
	}
	
	public void clickOneWay(){
		radio_OneWay.click();
	}
	
	public void setFrom(String text){
		textBox_From.sendKeys(text);
	}
	
	public void setTo(String text){
		textBox_To.sendKeys(text);
	}
	
	public void setDepartOn(){
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		textBox_Depart_On.sendKeys(dateFormat.format(date));
	}
	
	public void clickSearchFlights(){
		button_SearchFlights.click();
	}
	
	public void selectAutoSuggestOption(String locator, String value) {
		WebElement autoOptions = driver.findElement(By
				.id(locator));
		List<WebElement> allOptions = autoOptions
				.findElements(By.tagName("li"));
		
		for (WebElement option : allOptions) {
			if (option.getText().contains(value)) {
				option.click();
				break;
			}
		}
	}
	
	
	
	public void fillSearchFlightsForm(){
		clickOneWay();
		setFrom("Bangalore");

        //wait for the auto complete options to appear for the origin

//        waitFor(2000);
		selectAutoSuggestOption("ui-id-2", "Bangalore, IN - Kempegowda International Airport");
        

		setTo("Delhi");

        //wait for the auto complete options to appear for the destination

//        waitFor(2000);
        //select the first item from the destination auto complete list
		selectAutoSuggestOption("ui-id-2", "New Delhi, IN - Indira Gandhi Airport");
		
		setDepartOn();

        //all fields filled in. Now click on search
        
		clickSearchFlights();
//        waitFor(5000);
	}
	}
