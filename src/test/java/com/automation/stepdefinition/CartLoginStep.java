package com.automation.stepdefinition;

import io.cucumber.java.en.*;

public class CartLoginStep {

    @When("user enters valid credential")
    public void user_enters_valid_credential() {

        System.out.println("CartTest_Step5");
    }

    @Then("verify use is on the homepage")
    public void verify_use_is_on_the_homepage() {

        System.out.println("CartTest_Step6");
    }

    @When("user click on AddtoCart button")
    public void user_click_on_addto_cart_button() {

        System.out.println("CartTest_Step7");
    }

    @Then("verify it show cart button with qty")
    public void verify_it_show_cart_button_with_qty() {

        System.out.println("CartTest_Ste8");
    }

    @When("user click on cart icon")
    public void user_click_on_cart_icon() {

        System.out.println("CartTest_Step9");
    }

    @Then("verify use is on the Cart page")
    public void verify_use_is_on_the_cart_page() {

        System.out.println("CartTest_Step10");
    }

    @When("user removes the item")
    public void user_removes_the_item() {

        System.out.println("CartTest_Step11");
    }

    @Then("verify cart is empty")
    public void verify_cart_is_empty() {

        System.out.println("CartTest_Step5");
    }


}
