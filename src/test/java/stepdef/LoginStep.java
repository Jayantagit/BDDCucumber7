package stepdef;

import java.util.List;
import java.util.Map;

import factory.DriverFactory;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginStep {

	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());

	@Given("user is on the OpeCart Page")
	public void user_is_on_the_ope_cart_page() {

		DriverFactory.getDriver().get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

	}

	@When("User enter valid credentials in Login Page")
	public void user_enter_valid_credentials_in_login_page(DataTable creds) {
		List<Map<String, String>> credentials = creds.asMaps(String.class, String.class);

		loginPage.enterEmail(credentials.get(0).get("username"));
		loginPage.enterPassword(credentials.get(0).get("password"));
		try {
			Thread.sleep(7000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Then("User navigates to MyAccountsPage")
	public void user_navigates_to_my_accounts_page() {

	}

}
