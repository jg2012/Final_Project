package com.promineo.tickets.service;


import com.promineo.tickets.Exceptions.ResourceNotFoundException;
import com.promineo.tickets.entity.concertMerchPurchase;
import com.promineo.tickets.entity.concertTicketPurchase;
import com.promineo.tickets.repo.concertTicketPurchaseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class concertTicketPurchaseServiceImp implements concertTicketPurchaseService{

    private concertTicketPurchaseRepo concertticketpurchaserepo;

    @Autowired
    public concertTicketPurchaseServiceImp(concertTicketPurchaseRepo concertticketpurchaserepo){
        this.concertticketpurchaserepo= concertticketpurchaserepo;
    }

    @Override
    public concertTicketPurchase createConcertTicketPurchase(concertTicketPurchase concertticketpurchase) {
        return concertticketpurchaserepo.save(concertticketpurchase);
    }

    @Override
    public List<concertTicketPurchase> getAllConcertTicketPurchase() {
        return concertticketpurchaserepo.findAll();
    }

    @Override
    public concertTicketPurchase editConcertTicketPurchase(concertTicketPurchase concertticketpurchase, int id) {

        concertTicketPurchase purchase = concertticketpurchaserepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("concertTicketPurchase", "ID", id));

        purchase.setConcert_ticket_purchase_id((concertticketpurchase.getConcert_ticket_purchase_id()));
        purchase.setConcert_attendee_id(concertticketpurchase.getConcert_attendee_id());
        purchase.setConcert_show_id(concertticketpurchase.getConcert_show_id());

        concertticketpurchaserepo.save(purchase);
        return purchase;
    }

    @Override
    public void deleteConcertTicketPurchase(concertTicketPurchase concertticketpurchase, int id) {
        concertticketpurchaserepo.deleteById(id);
    }
}
