package com.SpringBoot.BookingApp.exception;

public class UserNotFound extends RuntimeException {
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "User not found";
	}

}
