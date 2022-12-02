package com.promineotech.concertticket.service;

import com.promineotech.concertticket.entity.concert_merch_purchase;

import java.util.List;

public interface concertMerchPurchaseService {



    public concert_merch_purchase createConcertMerchPurchase(concert_merch_purchase concertMerchPurchase);

    public List<concert_merch_purchase> getAllConcertMerchPurchases();

    public concert_merch_purchase editConcertMerchPurchase(concert_merch_purchase concertMerchPurchase, int id);

    public void deleteConcertMerchPurchase (concert_merch_purchase concertMerchPurchase, int id);


}
