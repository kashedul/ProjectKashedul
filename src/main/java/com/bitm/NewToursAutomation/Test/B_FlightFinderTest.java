package com.bitm.NewToursAutomation.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bitm.NewToursAutomation.DTO.FlightFinderDTO;
import com.bitm.NewToursAutomation.Provider.FlightFinderProvider;
import com.bitm.NewToursAutomation.Utils.DriverManager;
import com.bitm.NewToursAutomation.Utils.UrlTextUtils;
import com.bitm.NewToursAutomation.Utils.XpathUtils;

public class B_FlightFinderTest {
	
	private WebDriver wc = null;
	
	
	@Test (priority = 1)
	public void CheckFlightFinderTitle () {
		
		wc = DriverManager.dr;
		
		WebDriverWait wt = new WebDriverWait(wc, 20);
		
		WebElement el = wt.until(ExpectedConditions.elementToBeClickable(By.xpath(XpathUtils.FlightFinderTest.Oneway)));
		
		Assert.assertEquals(wc.getTitle(),UrlTextUtils.Text.FlighFlinderPageTitle);
		
		
	}
	
	@Test (priority = 2, dataProvider = "FlightFinderData", dataProviderClass = FlightFinderProvider.class)
	public void CheckFlightFinderTest (List<FlightFinderDTO> FlightFinderdata) {
		
		for(FlightFinderDTO FlightFinder:FlightFinderdata) {
		
		wc.findElement(By.xpath(XpathUtils.FlightFinderTest.Oneway)).click();
		
		
		Select passenger = new Select(wc.findElement(By.xpath(XpathUtils.FlightFinderTest.Passenger)));
		passenger.selectByVisibleText(FlightFinder.getPassenger());
		
		
		Select DepartingFrom = new Select(wc.findElement(By.xpath(XpathUtils.FlightFinderTest.DepartingFrom)));
		DepartingFrom.selectByVisibleText(FlightFinder.getDepartingFrom());
		
		
		Select OnMonth = new Select(wc.findElement(By.xpath(XpathUtils.FlightFinderTest.OnMonth)));
		OnMonth.selectByVisibleText(FlightFinder.getOnMonth());
		
		
		Select OnDay = new Select(wc.findElement(By.xpath(XpathUtils.FlightFinderTest.OnDay)));
		OnDay.selectByVisibleText(FlightFinder.getOnDay());
		
		
		Select ArrivingIn = new Select(wc.findElement(By.xpath(XpathUtils.FlightFinderTest.ArrivingIn)));
		ArrivingIn.selectByVisibleText(FlightFinder.getArrivingIn());
		
		Select ReturningMonth = new Select(wc.findElement(By.xpath(XpathUtils.FlightFinderTest.ReturningMonth)));
		ReturningMonth.selectByVisibleText(FlightFinder.getReturningMonth());
		
		Select ReturningDay = new Select(wc.findElement(By.xpath(XpathUtils.FlightFinderTest.ReturingDay)));
		ReturningDay.selectByVisibleText(FlightFinder.getReturingDay());
		
		
		wc.findElement(By.xpath(XpathUtils.FlightFinderTest.FirstClass)).click();
		
		Select Airlines = new Select(wc.findElement(By.xpath(XpathUtils.FlightFinderTest.Airlines)));
		Airlines.selectByVisibleText(FlightFinder.getAirlines());
		
		wc.findElement(By.xpath(XpathUtils.FlightFinderTest.Continue)).click();
		
		wc.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		
	}

  }
	
}
