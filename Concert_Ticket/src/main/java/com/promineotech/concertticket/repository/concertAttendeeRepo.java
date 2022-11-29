package com.promineotech.concert_ticket.repository;

import com.promineotech.concert_ticket.entity.concert_attendee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface concertAttendeeRepo extends JpaRepository<concert_attendee, Integer> {
}
