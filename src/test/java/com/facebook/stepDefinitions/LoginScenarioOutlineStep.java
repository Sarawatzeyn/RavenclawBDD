package com.facebook.stepDefinitions;



import com.facebook.base.BaseStep;
import com.facebook.loginPages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginScenarioOutlineStep extends BaseStep{
	LoginPage lp;
	@Given("user enter {string} and {string} to open application")
	public void userEnterAndToOpenApplication(String browser, String Url) {
		 openApp(browser,Url);
	}
	@When("user enter {string} and {string} on the input field")
	public void userEnterAndOnTheInputField(String userName, String password) {
		lp= new LoginPage(driver);
		lp.userNameMethod(userName);
		lp.passWordMethod(password);
		
	}
	@Then("user click on the login button")
	public void userClickOnTheLoginButton() {
		lp.logingButton();
	}
	@Then("user close the application")
	public void userCloseTheApplication() {
		closeApp();
		
	}



}
