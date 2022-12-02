package com.promineo.tickets.repo;


import com.promineo.tickets.entity.concertTicketPurchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface concertTicketPurchaseRepo  extends JpaRepository<concertTicketPurchase, Integer> {
}
