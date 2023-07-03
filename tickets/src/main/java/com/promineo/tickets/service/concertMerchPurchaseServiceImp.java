package com.promineo.tickets.service;

import com.promineo.tickets.Exceptions.ResourceNotFoundException;

import com.promineo.tickets.entity.concertMerchPurchase;
import com.promineo.tickets.repo.concertMerchPurchaseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class concertMerchPurchaseServiceImp implements concertMerchPurchaseService{
    //Calls the repo into the service
    private concertMerchPurchaseRepo concertmerchpurchaserepo;
    //Implements the repo into the service.
    @Autowired
    public concertMerchPurchaseServiceImp(concertMerchPurchaseRepo concertmerchpurchaserepo){
        this.concertmerchpurchaserepo = concertmerchpurchaserepo;
    }
    //Lists all concert merch purchases.
    @Override
    public List<concertMerchPurchase> getAllConcertMerchPurchase() {
        return concertmerchpurchaserepo.findAll();
    }

    //Creates a new concert merch purchase.
    @Override
    public concertMerchPurchase createConcertMerchPurchase(concertMerchPurchase concertmerchpurchase) {
        return concertmerchpurchaserepo.save(concertmerchpurchase);
    }

    //Edits the Merch purchase and throws an exception if the item is not found by ID.
    @Override
    public concertMerchPurchase editConcertMerchPurchase(concertMerchPurchase concertmerchpurchase, int id) {
        concertMerchPurchase merchPurchase = concertmerchpurchaserepo.findById(id).orElseThrow(()->new ResourceNotFoundException("concertMerchPurchase", "Id", id));
        merchPurchase.setConcert_merch_purchase_id(concertmerchpurchase.getConcert_merch_purchase_id());
        merchPurchase.setConcert_merch_item(concertmerchpurchase.getConcert_merch_item());
        merchPurchase.setConcert_attendee_id(concertmerchpurchase.getConcert_attendee_id());
        concertmerchpurchaserepo.save(merchPurchase);
        return merchPurchase;
    }

    //Deletes the purchase by id.
    @Override
    public void deleteConcertMerchPurchase(concertMerchPurchase concertmerchpurchase, int id) {
        concertMerchPurchase merchPurchase = concertmerchpurchaserepo.findById(id).orElseThrow(()->new ResourceNotFoundException("concertMerchPurchase", "Id", id));
        concertmerchpurchaserepo.deleteById(id);
    }
}
