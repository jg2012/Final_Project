package com.promineotech.concertticket.service;

import com.promineotech.concertticket.entity.concert_ticket_purchase;
import com.promineotech.concertticket.repository.concertTicketPurchaseRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class concertTicketPurchaseServiceImp implements concertTicketPurchaseService{

    private concertTicketPurchaseRepo concertticketpurchaserepo;

    @Autowired
    public concertTicketPurchaseServiceImp(concertTicketPurchaseRepo concertticketpurchaserepo){
        this.concertticketpurchaserepo = concertticketpurchaserepo;
    }




    @Override
    public concert_ticket_purchase createConcertTicketPurchase(concert_ticket_purchase concertTicketPurchase) {
        return concertticketpurchaserepo.save(concertTicketPurchase);
    }

    @Override
    public List<concert_ticket_purchase> getAllConcertTicketPurchases() {
        return concertticketpurchaserepo.findAll();
    }

    @Override
    public concert_ticket_purchase editConcertTicketPurchase(concert_ticket_purchase concertTicketPurchase, int id) {
        concert_ticket_purchase tickets = concertticketpurchaserepo.findById(id).orElseThrow();
        tickets.setConcert_show_id(concertTicketPurchase.getConcert_show_id());
        tickets.setConcert_show_id(concertTicketPurchase.getConcert_show_id());
        tickets.setConcert_name(concertTicketPurchase.getConcert_name());

        concertticketpurchaserepo.save(tickets);
        return tickets;
    }

    @Override
    public void deleteConcertTicketPurchases(concert_ticket_purchase concertTicketPurchase, int id) {
        concert_ticket_purchase tickets = concertticketpurchaserepo.findById(id).orElseThrow();
    concertticketpurchaserepo.deleteById(id);
    }
}
