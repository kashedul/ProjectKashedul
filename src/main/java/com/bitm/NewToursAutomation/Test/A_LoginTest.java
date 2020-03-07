package com.bitm.NewToursAutomation.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.bitm.NewToursAutomation.DTO.LoginDTO;
import com.bitm.NewToursAutomation.Provider.LoginDataProvider;
import com.bitm.NewToursAutomation.Utils.DriverManager;
import com.bitm.NewToursAutomation.Utils.UrlTextUtils;
import com.bitm.NewToursAutomation.Utils.XpathUtils;

public class A_LoginTest {
	
	private WebDriver wb = null;
	
	
	@Test (priority = 1)
	public void LoginPageTitle () {
		
	wb= DriverManager.dr;
	
	wb.get(UrlTextUtils.URL.BaseUrl);
	
	Assert.assertEquals(wb.getTitle(),UrlTextUtils.Text.LoginPageTitle);
		
	}
	
	@Test (priority=2, dataProvider = "LoginData", dataProviderClass = LoginDataProvider.class)  
	public void logintest(List<LoginDTO> logindata) {
		
		
		for(LoginDTO login:logindata) {
		
	wb.findElement(By.xpath(XpathUtils.LoginTest.UserName)).sendKeys(login.getUsername());
	
	wb.findElement(By.xpath(XpathUtils.LoginTest.Password)).sendKeys(login.getPassword());
	
	wb.findElement(By.xpath(XpathUtils.LoginTest.SignIn)).click();
	
	wb.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
		
	}
		
  }

}
