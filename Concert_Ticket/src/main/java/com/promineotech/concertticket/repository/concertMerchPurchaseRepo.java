package com.promineotech.concert_ticket.repository;

import com.promineotech.concert_ticket.entity.concert_merch_purchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface concertMerchPurchaseRepo extends JpaRepository<concert_merch_purchase, Integer> {
}
