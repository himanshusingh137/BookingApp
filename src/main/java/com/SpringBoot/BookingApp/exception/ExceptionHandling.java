package com.SpringBoot.BookingApp.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.SpringBoot.BookingApp.utility.ResponseStructure;

@RestControllerAdvice
public class ExceptionHandling {

	@ExceptionHandler(UserNotCreatedException.class)
	public ResponseEntity<ResponseStructure<String>> userNotCreatedException(UserNotCreatedException e){
		ResponseStructure<String> structure = new ResponseStructure<String>();
		structure.setStatusCode(HttpStatus.NOT_ACCEPTABLE.value());
		structure.setMessage("Object not created");
		structure.setData(e.getMessage());
		return new ResponseEntity<ResponseStructure<String>>(structure, HttpStatus.NOT_ACCEPTABLE);
	}
	
	@ExceptionHandler(UserNotFound.class)
	public ResponseEntity<ResponseStructure<String>> userNotFound(UserNotFound e){
		ResponseStructure<String> structure = new ResponseStructure<String>();
		structure.setStatusCode(HttpStatus.NOT_ACCEPTABLE.value());
		structure.setMessage("Object not found");
		structure.setData(e.getMessage());
		return new ResponseEntity<ResponseStructure<String>>(structure, HttpStatus.NOT_ACCEPTABLE);
	}
	
	@ExceptionHandler(NoDataFound.class)
	public ResponseEntity<ResponseStructure<String>> NoUsersFound(NoDataFound e){
		ResponseStructure<String> structure = new ResponseStructure<String>();
		structure.setStatusCode(HttpStatus.NOT_ACCEPTABLE.value());
		structure.setMessage("No users");
		structure.setData(e.getMessage());
		return new ResponseEntity<ResponseStructure<String>>(structure, HttpStatus.NOT_ACCEPTABLE);
	}
	
	@ExceptionHandler(IdNotFound.class)
	public ResponseEntity<ResponseStructure<String>> IdNotFound(IdNotFound e){
		ResponseStructure<String> structure = new ResponseStructure<String>();
		structure.setStatusCode(HttpStatus.NOT_ACCEPTABLE.value());
		structure.setMessage("Id not found");
		structure.setData(e.getMessage());
		return new ResponseEntity<ResponseStructure<String>>(structure, HttpStatus.NOT_ACCEPTABLE);
	}
}
