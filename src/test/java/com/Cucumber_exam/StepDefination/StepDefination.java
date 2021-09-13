package com.Cucumber_exam.StepDefination;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.Cucumber_exam.PageObject.LandingPage;
import com.Cucumber_exam.ReusableComponents.DriverClass;
import com.Cucumber_exam.ReusableComponents.ReusableMethods;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefination extends DriverClass{
	
	    Logger log=Logger.getLogger(DriverClass.class);
	    ReusableMethods rm=new ReusableMethods();
	    @Given("^intilize the browser$")
	    public void intilize_the_browser() throws Throwable {
	    	
	    	driver=initilizedriver();
	    	log.info("intilized");
	        
	    }

	    @Then("^navigate to marioot website$")
	    public void navigate_to_marioot_website() throws Throwable {
	    	
	    	ReusableMethods.getURL(driver);
	    	log.info("visited to website");
	    	
	        
	    }

	    @Then("click on ourbrands from topnavigation")
	    public void click_on_ourbrands_from_topnavigation() throws Throwable {
	    	
	    	LandingPage l=new LandingPage(driver);
			/* driver.findElement(By.cssSelector("a[role='button']")).click(); */
	    	l.ourbrands().click();
	    	Thread.sleep(2000L);
	    	log.info("clicked on brands");
	        
	    }
	    @Then("^check jw marioot$")
	    public void check_jw_marioot() throws Throwable {
	    	LandingPage l=new LandingPage(driver);
			Assert.assertTrue(l.jwmarioot().isDisplayed());
			log.info("checked the jw marioot");
	        
	    }
	    @Then("^click on find reserve$")
	    public void click_on_find_reserve() throws Throwable {
	    	LandingPage l=new LandingPage(driver);
	    	l.findandfeature().click();
	    	log.info("clicked on find and feature");
	    }
	    @And("^click on destination and give (.+)$")
	    public void click_on_destination_and_give(String destination) throws Throwable {
	    	
			/*
			 * LandingPage l=new LandingPage(driver); l.destination().click();
			 * l.destination().sendKeys(destination); l.destination().sendKeys(Keys.ENTER);
			 */
	        
	    }
	    @Then("^click on bonvoy$")
	    public void click_on_bonvoy() throws Throwable {
	    	
	    	LandingPage l=new LandingPage(driver);
	    	l.bonvoy().click();
	    	log.info("clicked on bonvoy");
	        
	    }
	    
	    @Then("^close the browser$")
	    public void close_the_browser() throws Throwable {
	        driver.close();
	        log.info("browser closed");
	    }


}
