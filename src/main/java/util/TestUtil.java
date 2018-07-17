package util;

import java.util.List;

import managers.WebDriverManager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import dataProviders.ConfigFileReader;

public class TestUtil{
//	WebDriver driver;
//	WebDriverManager driverManager;
//	ConfigFileReader config = new ConfigFileReader();
//	
//	public void selectOption(String locator, String value) {
////		driverManager = new WebDriverManager();
////		driver = driverManager.getDriver();
//		WebElement autoOptions = driver.findElement(By
//				.id(locator));
//		List<WebElement> allOptions = autoOptions
//				.findElements(By.tagName("li"));
//		
//		for (WebElement option : allOptions) {
//			if (option.getText().contains(value)) {
//				option.click();
//				break;
//			}
//		}
//	}
	
//	public void selectDate(String day, String monthYear){
//		By departInputField = By.id("DepartDate");
//		By monthYearInDatePickerLabel = By.cssSelector("div.calendar div.month tr th.caption");
//		By dayInDatePickerLink = By.cssSelector("div.calendar div.month table tbody tr td a");
//		By nextMonthInDatePickerLink = By.xpath("//a[contains(text(),'Next Month')]");
//			
//			driver.findElement(departInputField).click();
//			
//			List<WebElement> monthYearList = driver.findElements(monthYearInDatePickerLabel);
//			List<WebElement> dayList = driver.findElements(dayInDatePickerLink);
//			
//			outerloop:
//				//Selecting a month
//			for(int i=0; i<monthYearList.size(); i++){
//				if(monthYearList.get(i).getText().equals(monthYear)){
//					
//					//Selecting a day
//					for(int j=0;j<dayList.size();j++){
//						if(dayList.get(j).getText().equals(day)){
//							dayList.get(j).click();
//							break outerloop;
//						}
//					}
//				}else{
//					driver.findElement(nextMonthInDatePickerLink).click();
//					selectDate(day, monthYear);
//					break;
//					
//			}
//			}
//	}
	
//	public boolean isElementPresent(By by) {
//		driver = driverManager.getDriver();
//        try {
//            driver.findElement(by);
//            return true;
//        } catch (NoSuchElementException e) {
//            return false;
//        }
//    }
	
//	public void getElementVisible(WebElement element){
//		driver = driverManager.getDriver();
//		WebDriverWait wait = new WebDriverWait(driver, config.getImplicitlyWait());
//		wait.until(ExpectedConditions.visibilityOf(element));
//	}

}
