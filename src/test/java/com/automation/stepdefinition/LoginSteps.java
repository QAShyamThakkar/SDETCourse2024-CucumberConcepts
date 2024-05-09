package com.automation.stepdefinition;

import io.cucumber.java.en.*;

public class LoginSteps {
    @Given("user open website")
    public void user_open_website() {
        System.out.println("Login_Step1");
       
    }
    @Given("verify user is on the login page")
    public void verify_user_is_on_the_login_page() {
        System.out.println("Login_Step2");
       
    }
    @When("user log in with valid credential")
    public void user_log_in_with_valid_credential() {
        System.out.println("Login_Step3");
       
    }
    @Then("verify user is on the home page")
    public void verify_user_is_on_the_home_page() {
        System.out.println("Login_Step4");
    }
  
}
