package com.automation.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/FeatureFile/Login.feature",
        glue = "com.automation.stepdefinition",
        tags = "@Regression",
        plugin = {"html:target/cucumber1.html","json:target/cucumber.json" },
        dryRun = false
)

public class Runner1 {

}
