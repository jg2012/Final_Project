package com.promineo.tickets.repo;

import com.promineo.tickets.entity.concertMerchPurchase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface concertMerchPurchaseRepo extends JpaRepository<concertMerchPurchase, Integer> {
}
