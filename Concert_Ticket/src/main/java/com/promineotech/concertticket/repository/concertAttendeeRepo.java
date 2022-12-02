package com.promineotech.concertticket.repository;

import com.promineotech.concertticket.entity.concert_attendee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface concertAttendeeRepo extends JpaRepository<concert_attendee, Integer> {
}
