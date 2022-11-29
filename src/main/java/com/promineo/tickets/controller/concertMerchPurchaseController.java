package com.promineo.tickets.controller;


import com.promineo.tickets.entity.concertMerchPurchase;
import com.promineo.tickets.repo.concertMerchPurchaseRepo;
import com.promineo.tickets.service.concertMerchPurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("concert_merch_purchase")
public class concertMerchPurchaseController {


    public final concertMerchPurchaseService concertmerchpurchaseservice;
    public final concertMerchPurchaseRepo concertmerchpurchaserepo;

    @Autowired
    public concertMerchPurchaseController(concertMerchPurchaseService concertmerchpurchaseservice, concertMerchPurchaseRepo concertmerchpurchaserepo) {
       super();
        this.concertmerchpurchaseservice = concertmerchpurchaseservice;
        this.concertmerchpurchaserepo = concertmerchpurchaserepo;
    }

@GetMapping
public List<concertMerchPurchase> getAllConcertMerchPurchase(){
        return  concertmerchpurchaseservice.getAllConcertMerchPurchase();
}

@PostMapping
    public concertMerchPurchase createConcertMerchPurchase(@RequestBody concertMerchPurchase concertmerchpurchase){
        return concertmerchpurchaserepo.save(concertmerchpurchase);
}
@PutMapping("{id}")
public ResponseEntity<concertMerchPurchase> editConcertMerchPurchase(@PathVariable int id, @RequestBody concertMerchPurchase concertmerchpurchase){
        return new ResponseEntity<concertMerchPurchase>(concertmerchpurchaseservice.editConcertMerchPurchase(concertmerchpurchase, id), HttpStatus.OK);
}

@DeleteMapping("{id}")
    public ResponseEntity<String> deleteConcertPurchase(@PathVariable int id, @RequestBody concertMerchPurchase concertmerchpurchase){
        concertmerchpurchaseservice.deleteConcertMerchPurchase(concertmerchpurchase, id);
        return new ResponseEntity<String>("That purchase with: "+id + " was deleted.", HttpStatus.OK);
}

}
