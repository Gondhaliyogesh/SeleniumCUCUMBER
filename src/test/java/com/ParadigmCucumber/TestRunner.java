package com.ParadigmCucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="F:\\CUCUMBER\\ParadigmCucumber\\src\\main\\java\\Features\\Login.feature",glue={"com.ParadigmCucumber"},
				 format= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"} ,//to generate different types of reporting
				 monochrome = true,
				 strict = true, 
				 dryRun = false)
public class TestRunner 
{

}
