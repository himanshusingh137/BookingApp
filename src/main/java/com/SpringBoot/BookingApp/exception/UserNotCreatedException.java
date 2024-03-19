package com.SpringBoot.BookingApp.exception;

public class UserNotCreatedException extends RuntimeException{

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "User cannot be created";
	}
}
