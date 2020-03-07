package com.bitm.NewToursAutomation.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bitm.NewToursAutomation.Utils.DriverManager;
import com.bitm.NewToursAutomation.Utils.UrlTextUtils;
import com.bitm.NewToursAutomation.Utils.XpathUtils;

public class C_SelectFlightTest {
	
	private WebDriver wd = null;
	
	
	@Test (priority = 1)
	public void SelectFlightTitle () {
		
	wd = DriverManager.dr;	
		
	WebDriverWait wt = 	new WebDriverWait(wd, 20);
	
	WebElement el = wt.until(ExpectedConditions.elementToBeClickable(By.xpath(XpathUtils.SelectFlightTest.Depart)));
	
	Assert.assertEquals(wd.getTitle(),UrlTextUtils.Text.SelectFlightPageTitle);
		
	}
	
	@Test (priority = 2)
	public void SelectFlightTest () {
		
		wd.findElement(By.xpath(XpathUtils.SelectFlightTest.Depart)).click();
		
		wd.findElement(By.xpath(XpathUtils.SelectFlightTest.Return)).click();
		
		wd.findElement(By.xpath(XpathUtils.SelectFlightTest.Continue)).click();
		
		wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
	}

}