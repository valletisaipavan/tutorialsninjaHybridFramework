package stepDefnations;


//	
//import io.cucumber.java.Before;
//import io.cucumber.java.Scenario;
import io.cucumber.java.en.And;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
	public class SEARCH {
		
		
//	@Before
//    public void setup(Scenario scenario) {
//     System.out.println(">>user opens the application before ----"+scenario.getName());
//
//	}
//	
//	@After
//    public void teardown(Scenario scenario) {
//     System.out.println(">>user opens the application after---- "+scenario.getName() );
//
//    }
//	
	
	
	    @Given("user open the application")
	    public void user_opens_the_application()  {
	        System.out.println(">>user open the application");
	    }

	    @When("user enters the valid product in search fields")
	    public void user_enters_the_valid_product_in_search_fields()  {
	       System.out.println(">>user enters the valid product in search fields");
	    }

	    @When("user enter the existing product in search fields")
	    public void user_enter_the_non_existing_product_in_search_fields()  {
	       System.out.println(">>user enter the non- existing product in search fields");
	    }

	    @Then("valid product get displayed in search result")
	    public void valid_product_get_displayed_in_search_result()  {
	       System.out.println(">>valid product get displayed in search result");
	    }


	    @And("user enter the search button")
	    public void user_click_the_search_button()  {
	    	 
	      System.out.println(">>user click the search button");
	    }}

	   

	


