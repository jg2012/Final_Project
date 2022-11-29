package com.promineo.tickets.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.promineo.tickets.entity.concertAttendee;

public interface concertAttendeeRepo extends JpaRepository<concertAttendee, Integer>{

}
