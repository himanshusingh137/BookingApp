package com.SpringBoot.BookingApp.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.SpringBoot.BookingApp.Repository.UserRepo;
import com.SpringBoot.BookingApp.entity.User;
import com.SpringBoot.BookingApp.exception.UserNotCreatedException;
import com.SpringBoot.BookingApp.exception.UserNotFound;
import com.SpringBoot.BookingApp.utility.ResponseStructure;


@Service
public class UserService {
	
	@Autowired
     UserRepo repository;
	
	public ResponseEntity<ResponseStructure<User>> saveUser(User user) {
		
	    User savedUser = repository.save(user);
	    
	    if(savedUser != null) {
	    	
	    	ResponseStructure<User> responseStructure = new ResponseStructure<User>();
	    	responseStructure.setStatusCode(HttpStatus.CREATED.value());
	    	responseStructure.setMessage("data is stored in database");
	    	responseStructure.setData(savedUser);
	    	
	    	return new ResponseEntity<ResponseStructure<User>>(responseStructure,HttpStatus.CREATED);
	    }
		
	    throw new UserNotCreatedException();
	
	}
	
	public ResponseEntity<ResponseStructure<String>> deleteUserById(int id){
	 
		Optional<User> foundUser = repository.findById(id);
		 
	  if(foundUser.isPresent()) {
            repository.deleteById(id);
		ResponseStructure<String> responseStructure = new ResponseStructure<String>();
    	responseStructure.setStatusCode(HttpStatus.CREATED.value());
    	responseStructure.setMessage("user deleted");
    	responseStructure.setData("no content");
    	
    	return new ResponseEntity<ResponseStructure<String>>(responseStructure,HttpStatus.CREATED);
	  }
	  
	  throw new UserNotFound();
		
	}
	
	public  ResponseEntity<ResponseStructure<User>> findUserById(int id){
		 
		 Optional<User> foundUser = repository.findById(id);
		 
	     if(foundUser.isPresent()) {
	    	 User user = foundUser.get();
	    	 
	    	 if(user != null) {
	 	    	
	 	    	ResponseStructure<User> responseStructure = new ResponseStructure<User>();
	 	    	responseStructure.setStatusCode(HttpStatus.CREATED.value());
	 	    	responseStructure.setMessage("Found User Data");
	 	    	responseStructure.setData(user);
	 	    	
	 	    	return new ResponseEntity<ResponseStructure<User>>(responseStructure,HttpStatus.CREATED);
	 	    }
	     }
	     throw new UserNotFound();
	}
	
	public  ResponseEntity<ResponseStructure<List<User>>> findAllUser(){
		
		List<User> usersList = repository.findAll();
		
   	    if(usersList != null) {
	    	
	    	ResponseStructure<List<User>> responseStructure = new ResponseStructure<List<User>>();
	    	responseStructure.setStatusCode(HttpStatus.CREATED.value());
	    	responseStructure.setMessage("ALL Users");
	    	responseStructure.setData(usersList);
	    	
	    	return new ResponseEntity<ResponseStructure<List<User>>>(responseStructure,HttpStatus.CREATED);
	     }
         throw new UserNotFound();
	}
	
	   
}

