package com.facebook.stepDefinitions;

import com.facebook.base.BaseStep;
import com.facebook.loginPages.RegistrationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegistrationStep extends BaseStep{
	RegistrationPage rp;//has  a relationship

	@Given("Open {string} and put {string}")
	public void openAndPut(String browser, String Url) {
		openApp(browser, Url);
}
	@When("Click on registration button")
	public void clickOnRegistrationButton() {
		rp=new RegistrationPage(driver);
		rp.createNewAccountButton();
	}
	
	@When("In put first Name {string}")
	public void inPutFirstName(String enterFName) {
		rp.firstNameField(enterFName);
	}
	@When("Input last Name {string}")
	public void inputLastName(String enterLName) {
		rp.lastNameField(enterLName);
	}
	@When("Input email {string}")
	public void inputEmail(String email) {
		rp.emailField(email);
	}
	@When("Input re enter email {string}")
	public void inputReEnterEmail(String reEnteremail) {
		rp.reEnterEmail(reEnteremail);
	}
	@When("Input password {string}")
	public void inputPassword(String password) {
		rp.passwordField(password);
	}
	@When("Input birth Month {string}")
	public void inputBirthMonth(String BMonth) {
		rp.monthDropDownField(BMonth);
	}
	@When("Input birth Day {string}")
	public void inputBirthDay(String BDay) {
		rp.dayDropDownField(BDay);
	}
	@When("Input birth Year {string}")
	public void inputBirthYear(String Year) {
		rp.yearDropDownField(Year);
	}
	@When("Input gender {string}")
	public void inputGender(String Gender) {
		rp.radioButton(Gender);
	}
	@When("click login button")
	public void clickLoginButton() {
		rp.signupButton();
	}
	@Then("I can create an account")
	public void iCanCreateAnAccount() {
	
	}




}
