package com.SpringBoot.BookingApp.exception;

public class NoDataFound extends RuntimeException {
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "No Data Found";
	}

}
