package pageObjects;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HotelsSearchPage {
	
	WebDriver driver;

	@FindBy(xpath = "//input[@title='Where do you want to go']")
	private WebElement textBox_Where;
	
	@FindBy(id = "CheckInDate")
	private WebElement textBox_CheckInDate;
	
	@FindBy(id = "CheckOutDate")
	private WebElement textBox_CheckOutDate;
	
	@FindBy(id = "travellersOnhome")
	private WebElement dropDown_Travellers;
	
	@FindBy(id = "SearchHotelsButton")
	private WebElement button_SearchHotels;
	
	public HotelsSearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setWhere(String text){
		textBox_Where.sendKeys(text);
	}
	
	public void setCheckInDate(){
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		textBox_CheckInDate.sendKeys(dateFormat.format(date));
	}
	
	
//	public static void selectDate(String day, String month, String year){
//	
//	List<WebElement> monthYearList = driver.findElements(monthYearInDatePickerLabel);
//	List<WebElement> dayList = driver.findElements(dayInDatePickerLink);
//	
//	outerloop:
//		//Selecting a month
//	for(int i=0; i<monthYearList.size(); i++){
//		if(monthYearList.get(i).getText().equals(monthYear)){
//			
//			//Selecting a day
//			for(int j=0;j<dayList.size();j++){
//				if(dayList.get(j).getText().equals(day)){
//					dayList.get(j).click();
//					break outerloop;
//				}
//			}
//		}else{
//			driver.findElement(nextMonthInDatePickerLink).click();
//			selectDate(day, monthYear);
//			break;
//			
//	}
//	}
//}
	
	
	public void clickSearchHotels(){
		button_SearchHotels.click();
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
	
//	public void fillSearchHotelsForm() {
//        localityTextBox.sendKeys("Indiranagar, Bangalore");
//
//        new Select(travellerSelection).selectByVisibleText("1 room, 2 adults");
//        searchButton.click();
//
//        driver.quit();
//
//    }
}
