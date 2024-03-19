package com.SpringBoot.BookingApp.exception;

public class IdNotFound extends RuntimeException{

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Id not found";
	}
	
}
