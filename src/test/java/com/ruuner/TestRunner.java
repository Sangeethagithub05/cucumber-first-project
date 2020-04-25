package com.ruuner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources"},glue= {"com.stepdefenition"},monochrome=true,plugin= {"html:C:\\Users\\home\\eclipse-workspace\\cucumber\\target","json:C:\\Users\\home\\eclipse-workspace\\cucumber\\target\\report.json"})
public class TestRunner {
	
	
	
}
