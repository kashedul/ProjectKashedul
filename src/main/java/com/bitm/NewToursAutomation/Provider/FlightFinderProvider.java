package com.bitm.NewToursAutomation.Provider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.bitm.NewToursAutomation.Utils.ExcelUtils;

public class FlightFinderProvider {
	
	@DataProvider(name="FlightFinderData")
	public static Object [][] getFlightFinderData(){
		try {
			return new Object[][]{
					{
						ExcelUtils.getFlightFinderData()
					},
				};
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}	        
    }

}
