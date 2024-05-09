package com.automation.stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

    @Before
    public void setUp(){
        System.out.println("Opening Chrome");
    }

    @After
    public void cleanUp(){
        System.out.println("Closing Chrome");
    }

}
