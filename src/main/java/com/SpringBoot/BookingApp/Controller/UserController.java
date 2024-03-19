package com.SpringBoot.BookingApp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.SpringBoot.BookingApp.entity.User;
import com.SpringBoot.BookingApp.service.UserService;
import com.SpringBoot.BookingApp.utility.ResponseStructure;

@RestController
@RequestMapping("/railway")
public class UserController {
	
	@Autowired
	UserService service;
	
	@PostMapping("/user")
	public ResponseEntity<ResponseStructure<User>> saveUser(@RequestBody User user) {
		
		return service.saveUser(user);
	}
	
	@PutMapping("/user")
	public ResponseEntity<ResponseStructure<User>> updateUser(@RequestBody User user) {
		
		return service.saveUser(user);
	}
	
	@DeleteMapping("/user/{id}")
	public ResponseEntity<ResponseStructure<String>> deleteUser(@PathVariable int id){
		
		return service.deleteUserById(id);
	}
	
	@GetMapping("/user/{id}")
    public ResponseEntity<ResponseStructure<User>> findUser(@PathVariable int id){
		
		return service.findUserById(id);
	}
	
	@GetMapping("user")
    public ResponseEntity<ResponseStructure<List<User>>> findAllUser(){
		
		return service.findAllUser();
	}

}
