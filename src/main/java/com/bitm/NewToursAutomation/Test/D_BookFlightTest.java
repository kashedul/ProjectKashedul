package com.bitm.NewToursAutomation.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bitm.NewToursAutomation.DTO.BookFlightDTO;
import com.bitm.NewToursAutomation.Provider.BookFlightProvider;
import com.bitm.NewToursAutomation.Utils.DriverManager;
import com.bitm.NewToursAutomation.Utils.UrlTextUtils;
import com.bitm.NewToursAutomation.Utils.XpathUtils;

public class D_BookFlightTest {
	
	private WebDriver we = null;
	
	
	@Test (priority = 1)
	public void BookFlightTitle () {
		
	we = DriverManager.dr;	
	
	WebDriverWait wt = new WebDriverWait(we, 20);
	
	WebElement el = wt.until(ExpectedConditions.elementToBeClickable(By.xpath(XpathUtils.BookFlightTest.PassengerFirstName)));
	
	Assert.assertEquals(we.getTitle(),UrlTextUtils.Text.BookFlightPageTitle);
      }
	
	@Test (priority = 2, dataProvider = "BookFlightData", dataProviderClass = BookFlightProvider.class)
	public void BookFlightTest (List<BookFlightDTO> BookFlightdata) {
		
		for(BookFlightDTO BookFlight:BookFlightdata) {
		
		we.findElement(By.xpath(XpathUtils.BookFlightTest.PassengerFirstName)).sendKeys(BookFlight.getPassengerFirstName());
		
		we.findElement(By.xpath(XpathUtils.BookFlightTest.PassengerLastName)).sendKeys(BookFlight.getPassengerLastName());
		
		
		Select Meal = new Select(we.findElement(By.xpath(XpathUtils.BookFlightTest.Meal)));
		Meal.selectByVisibleText(BookFlight.getMeal());
	
		
	   Select CardType = new Select(we.findElement(By.xpath(XpathUtils.BookFlightTest.CardType)));
	   CardType.selectByVisibleText(BookFlight.getCardType());
	
	
	   we.findElement(By.xpath(XpathUtils.BookFlightTest.CardNumber)).sendKeys(BookFlight.getCardNumber());
	   
	   Select ExpirationMonth = new Select(we.findElement(By.xpath(XpathUtils.BookFlightTest.ExpirationMonth)));
	   ExpirationMonth.selectByVisibleText(BookFlight.getExpirationMonth());
	   
	   Select ExpirationYear = new Select(we.findElement(By.xpath(XpathUtils.BookFlightTest.ExpirationYear)));
	   ExpirationYear.selectByVisibleText(BookFlight.getExpirationYear());
	   
	   we.findElement(By.xpath(XpathUtils.BookFlightTest.CardHolderFirstName)).sendKeys(BookFlight.getCardHolderFirstName());
	   
	   we.findElement(By.xpath(XpathUtils.BookFlightTest.CardHolderMiddleName)).sendKeys(BookFlight.getCardHolderMiddleName());
	   
	   we.findElement(By.xpath(XpathUtils.BookFlightTest.CardHolderLastName)).sendKeys(BookFlight.getCardHolderLastName());
	   
	   we.findElement(By.xpath(XpathUtils.BookFlightTest.Address)).sendKeys(BookFlight.getAddress());
	   
	   we.findElement(By.xpath(XpathUtils.BookFlightTest.City)).sendKeys(BookFlight.getCity());
	   
	   we.findElement(By.xpath(XpathUtils.BookFlightTest.State_provinse)).sendKeys(BookFlight.getState_provinse());
	   
	   we.findElement(By.xpath(XpathUtils.BookFlightTest.PostalCode)).sendKeys(BookFlight.getPostalCode());
	   
	   Select Country = new Select(we.findElement(By.xpath(XpathUtils.BookFlightTest.Country)));
	   Country.selectByVisibleText(BookFlight.getCountry());
	   
	   we.findElement(By.xpath(XpathUtils.BookFlightTest.DeliveryAddress)).click();
	   
	   we.findElement(By.xpath(XpathUtils.BookFlightTest.SecurePurchase)).click();
	   
	
	}

}
	
}