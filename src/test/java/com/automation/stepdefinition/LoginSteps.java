package com.automation.stepdefinition;

import io.cucumber.java.en.*;
import org.junit.Assert;

public class LoginSteps {
    @Given("user open website")
    public void user_open_website() {
        System.out.println("Login_Step1");
       
    }
    @Given("verify user is on the login page")
    public void verify_user_is_on_the_login_page() {
        System.out.println("Login_Step2");
       
    }

    @When("user log in username {string} and password {string}")
    public void user_log_in_username_and_password(String userName, String password) {

        System.out.println(userName);
        System.out.println(password);

    }

    @Then("verify user is on the home page")
    public void verify_user_is_on_the_home_page() {
        System.out.println("Login_Step4");
//        Assert.assertEquals("Some error in Login Steps", 40, 50);
//        Assert.assertTrue("Error in Steps", 50>60);
        }

    @Then("verify error message is displayed")
    public void verifyErrorMessageIsDisplayed() {

        System.out.println("Verifying Login Error");
    }

    @When("user log in username {string}{string} and password {string}{string}")
    public void user_log_in_username_and_password(String string, String string2, String string3, String string4) {

        System.out.println(string);
        System.out.println(string2);
        System.out.println(string3);
        System.out.println(string4);

    }
}
