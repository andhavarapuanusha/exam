package com.Cucumber_exam.Runner;

import org.junit.runner.RunWith;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;


	@RunWith(Cucumber.class)
	@CucumberOptions(
	features="src/test/resources",
    glue="com.Cucumber_exam.StepDefination",
	monochrome = true)
	public class Runner extends AbstractTestNGCucumberTests /////to run the test with testng we extends this class  AbstractTestNGCucumberTests 
	{

	}



