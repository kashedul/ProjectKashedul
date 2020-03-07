package com.bitm.NewToursAutomation.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Test2 {
	
	public static void main (String[]args) throws IOException {
		
		                  //take: File(String Pathname)
		File excelFile = new File("data.xlsx");
		
		
		                           //take:FileInputStream(File File)
		FileInputStream fis = new FileInputStream(excelFile);
		
		                          // take:XSSFWorkbook()
		XSSFWorkbook workbook = new XSSFWorkbook(fis);  // We create an XSSF Workbook object for Excel
		
		                            // take: getSheetAt(int index)
		XSSFSheet sheet = workbook.getSheetAt(1);      // We get from First Excel Sheet
		
		
      // import: row (org.apache.poi.ss.usermodel.Row)
		Iterator<Row> rowIt = sheet.rowIterator();     // We iterate on Row
		
		while(rowIt.hasNext()) {
			
			Row row = rowIt.next();
			
			Iterator<Cell> cellIterator = row.cellIterator(); //Iterate on cells for the current row
			
			while(cellIterator.hasNext()) {
				
				Cell cell =cellIterator.next();
				
				System.out.println(cell.toString() +";");
			}
			
			
		}
		
		workbook.close();
		fis.close();
		
	
		
	}
	
	
}
