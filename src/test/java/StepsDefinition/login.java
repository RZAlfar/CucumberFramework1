package StepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login {
	@Given("user is on login page")
	public void user_is_on_login_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("1heere");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("2heere");

	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("3heere");

	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
		System.out.println("4heere");

	}
}
