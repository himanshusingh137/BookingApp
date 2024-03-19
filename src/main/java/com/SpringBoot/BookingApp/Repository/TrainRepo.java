package com.SpringBoot.BookingApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.BookingApp.entity.Train;

@Repository
public interface TrainRepo  extends JpaRepository<Train, Integer>{

}
