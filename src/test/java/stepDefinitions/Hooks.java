package stepDefinitions;

import org.openqa.selenium.WebDriver;

import managers.FileReaderManager;
import cucumber.TestContext;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	WebDriver driver;
	TestContext testContext;
	
	public Hooks(TestContext testContext){
		this.testContext = testContext;
	}
	
	@Before
	public void setUp(){
		driver = testContext.getWebDriverManager().getDriver();
		driver.get(FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
	}
	
	@After
	public void tearDown(){
		testContext.getWebDriverManager().closeBrowser();
	}
}
