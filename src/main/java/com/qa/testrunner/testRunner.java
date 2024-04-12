package com.qa.testrunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features =  "src/main/java/com/qa/features",
				glue = "com.qa.stepdefs",
				plugin = {"pretty", "html:target/cucumber-reports","json:target/cucumber.json"},
				monochrome = true,
				publish =true ,
				dryRun = false

		
		
		
		
		)
public class testRunner extends AbstractTestNGCucumberTests {

	
	@Override
	@DataProvider(parallel = false)
	public Object[][] scenarios(){
		
		return super.scenarios();
		
	}
	

}
