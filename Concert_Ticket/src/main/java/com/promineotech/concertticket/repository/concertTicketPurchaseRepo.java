package com.promineotech.concert_ticket.repository;

import com.promineotech.concert_ticket.entity.concert_ticket_purchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface concertTicketPurchaseRepo extends JpaRepository<concert_ticket_purchase, Integer> {
}
