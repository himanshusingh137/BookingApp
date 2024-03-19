package com.SpringBoot.BookingApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.SpringBoot.BookingApp.entity.Ticket;

@Repository
public interface TicketRepo  extends JpaRepository<Ticket, Integer>{

}
