package steps;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import reporting.Logs;


public class SampleBoatSteps extends BaseClass  {
	 
	
	@Given("user navigate to homepage")
	public void user_navigate_to_homepage() {
	    Logs.log("Before Hook");
	}

	@Then("user click on product element")
	public void user_click_on_product_element() {
	  homePage.clickProduct();
	}

	@Then("user select boat")
	public void user_select_boat() {
	 homePage.clickboat();
	}

	@Then("user input zipcode")
	public void user_input_zipcode() {
	 homePage.inputZip("11230");
	}

	@When("click start quote")
	public void click_start_quote() {
	  homePage.startMyQuote();
	}

	@Then("user will be in about you page")
	public void user_will_be_in_about_you_page() {
	
	}

	@Then("title of the page will be <Information About You>")
	public void title_of_the_page_will_be_information_about_you() {
	   
	}
	@When("homepage steps done with<{string}>")
	public void homepage_st_steps_done(String string) {
		homePage.boatsteps(string);
	}
@Then("about you page steps done")
public void about_you_page_steps_done() {
	addresePage.addressPageSteps("Information About You","Ahad","Ritto", "abcd@gmail", "123","456", "7890","999 e 42ND st", "Brooklyn","11230","April", "14", "1997", "1-3", "Basic");
}

}
