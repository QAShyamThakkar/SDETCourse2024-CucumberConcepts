package com.automation.stepdefinition;

import io.cucumber.java.en.*;

import java.util.List;

public class UserSteps {

    @Given("user open website1")
    public void user_open_website1() {
        System.out.println("Opening the Website");
    }
    @Given("user open the registration form")
    public void user_open_the_registration_form(List<String> data) {
        for (String eachData : data){
            System.out.println(eachData);

        }
    }
    @Then("verify registration form is successful")
    public void verify_registration_form_is_successful() {

    }


}
