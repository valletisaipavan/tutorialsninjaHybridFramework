package stepDefnations;

import java.util.Map;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class registration {
	@Given("user navigates to register account")
	public void user_navigates_to_register_account() {
	}

	@When("user enters below details into the fields")
	public void user_enters_below_details_into_the_fields(DataTable datatable) {
		Map<String, String> map = datatable.asMap(String.class , String.class);
		System.out.println("firstname--" + map.get("firstname"));
		System.out.println("lastname--" + map.get("lastname"));
		//System.out.println("emailaddress--" + map.get("emailaddress"));
		System.out.println("telephone--" + map.get("telephone"));
		System.out.println("password--" + map.get("password"));
	}

	@And("select privacy policy field")
	public void select_privacy_policy_field() {
	}

	@And("click on continue button")
	public void click_on_continue_button() {

	}

	@Then("account should get sucessfully")
	public void account_should_get_sucessfully() {

	}

}