package com.promineotech.concertticket.service;

import com.promineotech.concertticket.entity.concert_merch_purchase;
import com.promineotech.concertticket.repository.concertMerchPurchaseRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class concertMerchPurchaseServiceImp implements concertMerchPurchaseService{

    private concertMerchPurchaseRepo concertmerchpurchaserepo;

    @Autowired
    public concertMerchPurchaseServiceImp(concertMerchPurchaseRepo concertmerchpurchaserepo){
        this.concertmerchpurchaserepo = concertmerchpurchaserepo;
    }



    @Override
    public concert_merch_purchase createConcertMerchPurchase(concert_merch_purchase concertMerchPurchase) {
        return concertmerchpurchaserepo.save(concertMerchPurchase);
    }

    @Override
    public List<concert_merch_purchase> getAllConcertMerchPurchases() {
        return concertmerchpurchaserepo.findAll();
    }

    @Override
    public concert_merch_purchase editConcertMerchPurchase(concert_merch_purchase concertMerchPurchase, int id) {

        concert_merch_purchase merchPurchase = concertmerchpurchaserepo.findById(id).orElseThrow();

        concertmerchpurchaserepo.save(merchPurchase);
        return merchPurchase;
    }

    @Override
    public void deleteConcertMerchPurchase(concert_merch_purchase concertMerchPurchase, int id) {
        concert_merch_purchase merchPurchase = concertmerchpurchaserepo.findById(id).orElseThrow();
        concertmerchpurchaserepo.deleteById(id);

    }
}
