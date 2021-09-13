package com.Cucumber_exam.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.Cucumber_exam.UiStore.LandingPageUi;


public class LandingPage {
	
	public WebDriver driver;
	LandingPageUi u=new LandingPageUi();
    public LandingPage(WebDriver driver)
    {
    	this.driver=driver;
    }
    public WebElement ourbrands()
    {
		return driver.findElement(u.ourbrands);
    	
    }
    public WebElement jwmarioot()
    {
		return driver.findElement(u.jwmarioot);
    	
    }
    public WebElement destination()
    {
		return driver.findElement(u.destination);
    	
    }
    public WebElement findandfeature()
    {
		return driver.findElement(u.findandfeature);
    	
    }
    public WebElement bonvoy()
    {
		return driver.findElement(u.bonvoy);
    	
    }
    
    

}
