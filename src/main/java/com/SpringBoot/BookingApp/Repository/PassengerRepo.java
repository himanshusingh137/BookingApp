package com.SpringBoot.BookingApp.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.BookingApp.entity.Passenger;

@Repository
public interface PassengerRepo extends JpaRepository<Passenger, Integer> {

}
