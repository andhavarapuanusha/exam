package com.Cucumber_exam.ReusableComponents;


import java.io.IOException;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DriverClass extends ReusableMethods
{
	
	public static WebDriver driver;
		public static Properties p;
		public  WebDriver initilizedriver() throws IOException
		{
	      
			String browsername=getBrowser(driver);
			if(browsername.equals("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
				driver=new ChromeDriver();
				
			}
			else if(browsername.equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
				driver=new FirefoxDriver();
			}
			
			return driver;
		}
		
			
	}


