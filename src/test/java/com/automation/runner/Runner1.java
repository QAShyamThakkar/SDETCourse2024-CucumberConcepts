package com.automation.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/FeatureFile",
        glue = "com.automation.stepdefinition"

)

public class Runner1 {

}