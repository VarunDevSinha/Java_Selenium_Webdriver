package com.test.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( 
monochrome = true, 
features = ".\\src\\test\\resources\\com\\resource\\feature", 
glue = ".\\src\\test\\java\\com\\test\\stepDefinitions", 
dryRun = false, tags = "Scenario1")

public class RunTest {

}
