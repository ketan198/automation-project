package com.qa.stepdefs;

import org.testng.Assert;

import com.qa.pages.loginPage;
import com.qa.utils.Base_Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class loginStepdefs extends Base_Test{

 
	public loginPage logp;
	
	
	@Given("^user is on the login page$")
	public void user_is_on_the_login_page() {
		Base_Test.initialization();
		
	    
	}

	@When("^title of login page is swag labs$")
	public void title_of_login_page_is_swag_labs() {
		logp = new loginPage();
		String title = logp.loginpagetitle();
		Assert.assertEquals(title, "Swag Labs");
		
	}

	@Then("^user enter \"(.*)\" and \"(.*)\"$")
	public void user_enter_and(String un, String pw) {
	   logp.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	

	@Then("^user is on homepage$")
	public void user_is_on_homepage() {
	    logp.sleeper();
	    
	}
	
	@Then("^user says print$")
	public void user_says_print() {
	  System.out.println("print something on console");
	}

}
