package com.promineo.tickets.service;

import com.promineo.tickets.Exceptions.ResourceNotFoundException;

import com.promineo.tickets.entity.concertMerchPurchase;
import com.promineo.tickets.repo.concertMerchPurchaseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class concertMerchPurchaseServiceImp implements concertMerchPurchaseService{


    private concertMerchPurchaseRepo concertmerchpurchaserepo;


    @Autowired
    public concertMerchPurchaseServiceImp(concertMerchPurchaseRepo concertmerchpurchaserepo){
        this.concertmerchpurchaserepo = concertmerchpurchaserepo;
    }

    @Override
    public concertMerchPurchase createConcertMerchPurchase(concertMerchPurchase concertmerchpurchase) {
        return concertmerchpurchaserepo.save(concertmerchpurchase);
    }

    @Override
    public List<concertMerchPurchase> getAllConcertMerchPurchase() {
        return concertmerchpurchaserepo.findAll();
    }

    @Override
    public concertMerchPurchase editConcertMerchPurchase(concertMerchPurchase concertmerchpurchase, int id) {
        concertMerchPurchase merchPurchase = concertmerchpurchaserepo.findById(id).orElseThrow(()->new ResourceNotFoundException("concertMerchPurchase", "Id", id));

        merchPurchase.setConcert_merch_purchase_id(concertmerchpurchase.getConcert_merch_purchase_id());
        merchPurchase.setConcert_merch_item(concertmerchpurchase.getConcert_merch_item());
        merchPurchase.setConcert_attendee_id(concertmerchpurchase.getConcert_attendee_id());

        concertmerchpurchaserepo.save(merchPurchase);

        return merchPurchase;
    }

    @Override
    public void deleteConcertMerchPurchase(concertMerchPurchase concertmerchpurchase, int id) {
        concertmerchpurchaserepo.deleteById(id);

    }
}
