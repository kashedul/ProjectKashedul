package com.bitm.NewToursAutomation.Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class DriverManager {
	
	static {
		
	
	System.setProperty("WebDriver.gecko.driver","G:\\Communication\\Software Testing\\Save File\\Selenium Files\\Gecko/geckodriver.exe");
	
	}
   
	public static WebDriver dr = new FirefoxDriver();
	
	
	public  DriverManager() {
		
	}
	
	}
		
	
	

