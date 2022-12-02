package com.promineotech.concertticket.repository;

import com.promineotech.concertticket.entity.concert_show;
import org.springframework.data.jpa.repository.JpaRepository;

public interface concertShowRepo extends JpaRepository<concert_show, Integer> {
}
