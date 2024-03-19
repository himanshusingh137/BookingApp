package com.SpringBoot.BookingApp.entity;

import org.springframework.stereotype.Component;
import java.time.LocalDate;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.validation.constraints.AssertFalse.List;
import lombok.Getter;
import lombok.Setter;

@Component
@Entity
@Getter
@Setter
public class Journey {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String StartForm;
	private String Destination;
	private LocalDate Date;
	private int price;
	@ManyToMany
	private java.util.List <Train> train;
	
}
