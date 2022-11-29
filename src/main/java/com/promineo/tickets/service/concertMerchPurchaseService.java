package com.promineo.tickets.service;

import com.promineo.tickets.entity.concertMerchPurchase;

import java.util.List;

public interface concertMerchPurchaseService {


    public concertMerchPurchase createConcertMerchPurchase(concertMerchPurchase concertmerchpurchase);

    public List<concertMerchPurchase> getAllConcertMerchPurchase();

    public concertMerchPurchase editConcertMerchPurchase(concertMerchPurchase concertmerchpurchase, int id);


    public void deleteConcertMerchPurchase(concertMerchPurchase concertmerchpurchase, int id);




}
