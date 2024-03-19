package com.SpringBoot.BookingApp.entity;


import org.springframework.stereotype.Component;

import com.SpringBoot.BookingApp.utility.Gender;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Component
@Entity
@Getter
@Setter
public class Passenger {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int age;
	private Gender gender;
	private long phno;
	
}