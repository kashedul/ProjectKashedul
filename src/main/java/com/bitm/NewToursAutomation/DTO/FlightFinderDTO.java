package com.bitm.NewToursAutomation.DTO;

public class FlightFinderDTO {
	
	private String Passenger;
	private String DepartingFrom;
	private String OnMonth;
	private String OnDay;
	private String ArrivingIn;
	private String ReturningMonth;
	private String ReturingDay;
	private String Airlines;
	
	public String getPassenger() {
		return Passenger;
	}
	public void setPassenger(String passenger) {
		Passenger = passenger;
	}
	public String getDepartingFrom() {
		return DepartingFrom;
	}
	public void setDepartingFrom(String departingFrom) {
		DepartingFrom = departingFrom;
	}
	public String getOnMonth() {
		return OnMonth;
	}
	public void setOnMonth(String onMonth) {
		OnMonth = onMonth;
	}
	public String getOnDay() {
		return OnDay;
	}
	public void setOnDay(String onDay) {
		OnDay = onDay;
	}
	public String getArrivingIn() {
		return ArrivingIn;
	}
	public void setArrivingIn(String arrivingIn) {
		ArrivingIn = arrivingIn;
	}
	public String getReturningMonth() {
		return ReturningMonth;
	}
	public void setReturningMonth(String returningMonth) {
		ReturningMonth = returningMonth;
	}
	public String getReturingDay() {
		return ReturingDay;
	}
	public void setReturingDay(String returingDay) {
		ReturingDay = returingDay;
	}
	public String getAirlines() {
		return Airlines;
	}
	public void setAirlines(String airlines) {
		Airlines = airlines;
	}
	@Override
	public String toString() {
		return "FlightFinderDTO [Passenger=" + Passenger + ", DepartingFrom=" + DepartingFrom + ", OnMonth=" + OnMonth
				+ ", OnDay=" + OnDay + ", ArrivingIn=" + ArrivingIn + ", ReturningMonth=" + ReturningMonth
				+ ", ReturingDay=" + ReturingDay + ", Airlines=" + Airlines + "]";
	}
	
	
	
}
	
	
