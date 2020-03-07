package com.bitm.NewToursAutomation.Provider;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import com.bitm.NewToursAutomation.Utils.ExcelUtils;

public class BookFlightProvider {
	
	@DataProvider(name="BookFlightData")
	public static Object [][] getBookFlightData(){
		try {
			return new Object[][]{
					{
						ExcelUtils.getBookFlightData()
					},
				};
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}	        
    }
}

	
	


