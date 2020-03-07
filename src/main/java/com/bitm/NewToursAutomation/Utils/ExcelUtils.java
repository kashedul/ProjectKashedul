package com.bitm.NewToursAutomation.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.bitm.NewToursAutomation.DTO.BookFlightDTO;
import com.bitm.NewToursAutomation.DTO.FlightFinderDTO;
import com.bitm.NewToursAutomation.DTO.LoginDTO;

public class ExcelUtils {

	private static FileInputStream inputStream = null;
	private static Workbook workbook = null;

	private static Sheet getSheet(int sheetNo) throws IOException {
		// change the file location as per your computer
		File f = new File("src/main/java");
		File fs = new File(f, "data.xlsx");
		inputStream = new FileInputStream(new File(fs.getAbsolutePath()));
		workbook = new XSSFWorkbook(inputStream);
		Sheet sheet = workbook.getSheetAt(sheetNo);
		return sheet;
		
	}
	

	public static List<LoginDTO> getLoginData() throws IOException {
		List<LoginDTO> logindata = new ArrayList<LoginDTO>();
		DataFormatter formatter = new DataFormatter();
		// login is the first sheet in excel so getSheet parameter set to 0
		Iterator<Row> iterator = ExcelUtils.getSheet(0).iterator();
		while (iterator.hasNext()) {
			Row nextRow = iterator.next();
			Iterator<Cell> cellIterator = nextRow.cellIterator();
			LoginDTO login = new LoginDTO();
			byte cellCounter = 0;
			while (cellIterator.hasNext()) {
				Cell cell = cellIterator.next();
				switch (cellCounter) {
				case 0:
					login.setUsername(formatter.formatCellValue(cell));
					cellCounter++;
					break;
				case 1:
					login.setPassword(formatter.formatCellValue(cell));
					break;
				default:
					break;
				}

			}
			logindata.add(login);
		}
		close();
		return logindata;
		
	}
	
		public static List<FlightFinderDTO> getFlightFinderData() throws IOException {
			List<FlightFinderDTO> FlightFinderdata = new ArrayList<FlightFinderDTO>();
			DataFormatter formatter = new DataFormatter();
			// login is the second sheet in excel so getSheet parameter set to 0
			Iterator<Row> iterator = ExcelUtils.getSheet(1).iterator();
			while (iterator.hasNext()) {
				Row nextRow = iterator.next();
				Iterator<Cell> cellIterator = nextRow.cellIterator();
				FlightFinderDTO FlightFinder = new FlightFinderDTO();
				byte cellCounter = 0;
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					switch (cellCounter) {
					case 0:
						FlightFinder.setPassenger(formatter.formatCellValue(cell));
						cellCounter++;
						break;
					case 1:
						FlightFinder.setDepartingFrom(formatter.formatCellValue(cell));
						cellCounter++;
						break;
					case 2:
						FlightFinder.setOnMonth(formatter.formatCellValue(cell));
						cellCounter++;
						break;
						
					case 3:
						FlightFinder.setOnDay(formatter.formatCellValue(cell));
						cellCounter++;
						break;
						
					case 4:
						FlightFinder.setArrivingIn(formatter.formatCellValue(cell));
						cellCounter++;
						break;
						
					case 5:
						FlightFinder.setReturningMonth(formatter.formatCellValue(cell));
						cellCounter++;
						break;
						
					case 6:
						FlightFinder.setReturingDay(formatter.formatCellValue(cell));
						cellCounter++;
						break;
						
					case 7:
						FlightFinder.setAirlines(formatter.formatCellValue(cell));
						break;
					default:
						break;
					}

				}
				FlightFinderdata.add(FlightFinder);
			}
			close();
			return FlightFinderdata;
			
			
	}
		
		
		
		
		
		
		
		
		public static List<BookFlightDTO> getBookFlightData() throws IOException {
			List<BookFlightDTO> BookFlightdata = new ArrayList<BookFlightDTO>();
			DataFormatter formatter = new DataFormatter();
			// login is the fourth sheet in excel so getSheet parameter set to 0
			Iterator<Row> iterator = ExcelUtils.getSheet(3).iterator();
			while (iterator.hasNext()) {
				Row nextRow = iterator.next();
				Iterator<Cell> cellIterator = nextRow.cellIterator();
				BookFlightDTO BookFlight = new BookFlightDTO();
				byte cellCounter = 0;
				while (cellIterator.hasNext()) {
					Cell cell = cellIterator.next();
					switch (cellCounter) {
					case 0:
						BookFlight.setPassengerFirstName(formatter.formatCellValue(cell));
						cellCounter++;
						break;
					case 1:
						BookFlight.setPassengerLastName(formatter.formatCellValue(cell));
						break;
					case 2:
						BookFlight.setMeal(formatter.formatCellValue(cell));
						cellCounter++;
						break;
						
					case 3:
						BookFlight.setCardType(formatter.formatCellValue(cell));
						cellCounter++;
						break;
						
					case 4:
						BookFlight.setCardNumber(formatter.formatCellValue(cell));
						cellCounter++;
						break;
						
					case 5:
						BookFlight.setExpirationMonth(formatter.formatCellValue(cell));
						cellCounter++;
						break;
						
					case 6:
						BookFlight.setExpirationYear(formatter.formatCellValue(cell));
						cellCounter++;
						break;
						
					case 7:
						BookFlight.setCardHolderFirstName(formatter.formatCellValue(cell));
						cellCounter++;
						break;
						
					case 8:
						BookFlight.setCardHolderMiddleName (formatter.formatCellValue(cell));
						cellCounter++;
						break;
						
					case 9:
						BookFlight.setCardHolderLastName (formatter.formatCellValue(cell));
						cellCounter++;
						break;
						
					case 10:
						BookFlight.setAddress(formatter.formatCellValue(cell));
						cellCounter++;
						break;
						
					case 11:
						BookFlight.setCity(formatter.formatCellValue(cell));
						cellCounter++;
						break;
						
					case 12:
						BookFlight.setState_provinse(formatter.formatCellValue(cell));
						cellCounter++;
						break;
						
					case 13:
						BookFlight.setPostalCode(formatter.formatCellValue(cell));
						cellCounter++;
						break;
						
						
					case 15:
						BookFlight.setCountry(formatter.formatCellValue(cell));
						break;
					default:
						break;
					}

				}
				BookFlightdata.add(BookFlight);
			}
			close();
			return BookFlightdata;
			
			
	}
		
		
		
		
		
		

	private static void close() throws IOException{
		workbook.close();
		inputStream.close();

	}
}
	

	