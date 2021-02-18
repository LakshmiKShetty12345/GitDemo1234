package stepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

@RunWith(Cucumber.class)

public class stepDefinition {

    @Given("^User is on landing page$")
    public void user_is_on_landing_page() throws Throwable {
    	 
        
     System.out.println("Navigated to landing page");
    
    }

    @When("^User logs in valid username and passwor$")
    public void user_logs_in_valid_username_and_password() throws Throwable {
        System.out.println("Logged in valid credentials");
    }

    @Then("^Home page is populated$")
    public void home_page_is_populated() throws Throwable {

    	
        

    }
    @When("^user login into the application with \"([^\"]*)\" and password=\"([^\"]*)\"$")
    public void user_login_into_the_application_with_something_and_passwordsomething(String strArg1, String strArg2) throws Throwable {
        throw new PendingException();
    }



    @And("^The card is displayed$")
    public void the_card_is_displayed() throws Throwable {
        System.out.println("Card is displayed");

    }


	
}