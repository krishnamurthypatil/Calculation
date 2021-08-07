package com.krishna.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


@RunWith(Cucumber.class)
@CucumberOptions(  
	    features = "src/test/resources/Features",
	    		glue="com.krishna.run",
	    		monochrome = true,
	    		plugin = {"pretty","html:target/HTMLReports",
	    				"json:target/JSONReports/report.json",
	    				"junit:target/JUNITReports/report/xml"},
	    		
	    		tags="@SDETCucumberAssignments1")

public class TestRunner  extends AbstractTestNGCucumberTests {

}
