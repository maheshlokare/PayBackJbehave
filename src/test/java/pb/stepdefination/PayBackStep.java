package pb.stepdefination;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.testng.Assert;

import com.google.inject.name.Named;


import pb.pageobject.PayBackPage;

public class PayBackStep {
	
	PayBackPage paybackPage ;
	
	@Given("user logins into payback application")
	public void user_logins_into_payback_application() throws InterruptedException {
		paybackPage = new PayBackPage();
		
		paybackPage.clickOnLoginButton();
		Thread.sleep(15000); //Currently we are ding manual login due to security issues. So we placed a small sleep for manual login.
	}
	
	//Below steps follow after the login
	@Given("user clicks on coupons")
	public void user_clicks_on_coupons() {
		paybackPage.clickPartnerErkunden();
		//click on back arrow-page3
		paybackPage.navigateUp();
		paybackPage.clickCoupons();
	}
	
	
	@Given("user saves the number of activated coupons")
	public void user_saves_the_number_of_activated_coupons() {
	}
	
	@Given("user clicks on filter option")
	public void user_clicks_on_filter_option() {
		paybackPage.clickFilterCoupons();
	}

	@Given("user selects required partner")
	public void user_selects_required_partner() {
		paybackPage.selectReweCard();
	}
	
	@When("user click on activation")
	public void user_click_on_activation() {
		paybackPage.activateCard();
	}
	
	
	@Then("verify user activation is successful $expectedMessage")
	public void verify_user_activation_is_successful(@Named("expedctedMessage") String expectedMessage) {
	    // Write code here that turns the phrase above into concrete actions
		String actualMessage = paybackPage.activationMessage();
		Assert.assertEquals(expectedMessage, actualMessage);
	}

	
	@Then("user comes back to coupons page")
	public void user_comes_back_to_coupons_page() {
	}
	
	@Then("verify activated cards number is incresed by one")
	public void verify_activated_cards_number_is_incresed_by_one() {
	}
	
	@Given("user saves the number of not activated coupons")
	public void user_saves_the_number_of_not_activated_coupons() {
	}
	
	@Then("verify not activated cards number is reduced by one")
	public void verify_not_activated_cards_number_is_reduced_by_one() {
	}




}
