package com.promineo.tickets.controller;


import com.promineo.tickets.entity.concertTicketPurchase;
import com.promineo.tickets.repo.concertTicketPurchaseRepo;
import com.promineo.tickets.service.concertTicketPurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("concert_ticket_purchase")
public class concertTicketPurchaseController {

    private concertTicketPurchaseService concertticketpurchaseservice;

    private concertTicketPurchaseRepo concertticketpurchaserepo;

    @Autowired
    public concertTicketPurchaseController(concertTicketPurchaseService concertticketpurchaseservice, concertTicketPurchaseRepo concertticketpurchaserepo){
    super();
    this.concertticketpurchaseservice = concertticketpurchaseservice;
    this.concertticketpurchaserepo = concertticketpurchaserepo;
    }

    @GetMapping
    public List<concertTicketPurchase> getAllConcertTicketPurchase(){
        return concertticketpurchaseservice.getAllConcertTicketPurchase();
    }

    @PostMapping
    public concertTicketPurchase createConcertTicketPurchase (@RequestBody concertTicketPurchase concertticketpurchase){
        return concertticketpurchaserepo.save(concertticketpurchase);
    }


    @PutMapping("{id}")
    public ResponseEntity<concertTicketPurchase> editConcertTicketPurchase(@PathVariable int id, @RequestBody concertTicketPurchase concertticketpurchase){
        return new ResponseEntity<concertTicketPurchase>(concertticketpurchaseservice.editConcertTicketPurchase(concertticketpurchase, id), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteConcertTicketPurchase(@PathVariable int id, @RequestBody concertTicketPurchase concertticketpurchase){
        concertticketpurchaseservice.deleteConcertTicketPurchase(concertticketpurchase, id);
        return new ResponseEntity<String>("That ticket purchase with id:" + id + "was deleted", HttpStatus.OK);
    }
}
