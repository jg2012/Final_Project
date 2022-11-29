package com.promineo.tickets.repo;

import com.promineo.tickets.entity.concertShow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface concertShowRepo extends JpaRepository<concertShow, Integer> {
}
