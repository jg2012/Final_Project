package com.promineotech.concertticket.repository;

import com.promineotech.concertticket.entity.concert_ticket_purchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface concertTicketPurchaseRepo extends JpaRepository<concert_ticket_purchase, Integer> {
}
