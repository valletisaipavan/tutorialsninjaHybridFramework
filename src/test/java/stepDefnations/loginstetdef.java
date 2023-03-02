package stepDefnations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginstetdef {

	@Given("user opens the application")
	public void user_opens_the_application() {
System.out.println("user opens the application");
	}

	@When("user enters the valid email address {string}")
	public void user_enters_the_valid_email_address_something(String string ) {
System.out.println("user enters the valid email address");
	}
	@When("user enters the invalid email address {string}")
	public void user_enters_the_invalid_email_address_something(String string ) {
System.out.println("user enters the invalid email address");
	}
	@Then("account open sucessfully")
	public void account_open_sucessfully() {
System.out.println("account open sucessfully");
	}

	@Then("it giver error messege")
	public void it_giver_error_messege() {
System.out.println("it giver error messege");
	}

//	@And("enters the valid password {int}")
//	public void enters_the_valid_password_something(String password) {
//System.out.println("enters the valid password ");
//	}
//	@And("enters the invalid password {int}")
//	public void enters_the_invalid_password_something(String password) {
//System.out.println("enters the invalid password ");
//	}
	@And("user click the login button")
	public void user_click_the_login_button() {
System.out.println("user click the login button ");
	}

}