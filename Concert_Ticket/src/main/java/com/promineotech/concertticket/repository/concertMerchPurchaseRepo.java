package com.promineotech.concertticket.repository;

import com.promineotech.concertticket.entity.concert_merch_purchase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface concertMerchPurchaseRepo extends JpaRepository<concert_merch_purchase, Integer> {
}
