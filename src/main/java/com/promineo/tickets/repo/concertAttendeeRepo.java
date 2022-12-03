package com.promineo.tickets.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.promineo.tickets.entity.concertAttendee;
@Repository
public interface concertAttendeeRepo extends JpaRepository<concertAttendee, Integer>{
}
