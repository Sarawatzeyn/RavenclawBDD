package com.facebook.stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginStep {
WebDriver driver;
	@Given("I open facebook application")
	public void iOpenFacebookApplication() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
	}
	@When("I enter my valid user name")
	public void iEnterMyValidUserName() {
		driver.findElement(By.id("email")).sendKeys("jjj");
		
	}
	@When("I enter my valid password")
	public void iEnterMyValidPassword() {
		driver.findElement(By.id("pass")).sendKeys("jjj");
	}
	@When("I click login button")
	public void iClickLoginButton() {
		
	}
	@Then("I can be logged in")
	public void iCanBeLoggedIn() {
		
	}



	
	
}
