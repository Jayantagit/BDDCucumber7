package Hooks;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AppHooks {

	private WebDriver driver;
	private DriverFactory factory;


	@Before
	public void setup() {
		factory =new DriverFactory();
		driver=factory.initDriver("chrome");
		
		
	}

	@After
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}

}
