package com.promineotech.concert_ticket.repository;

import com.promineotech.concert_ticket.entity.concert_show;
import org.springframework.data.jpa.repository.JpaRepository;

public interface concertShowRepo extends JpaRepository<concert_show, Integer> {
}
