package com.promineo.tickets.service;

import com.promineo.tickets.entity.concertTicketPurchase;

import java.util.List;

public interface concertTicketPurchaseService {

    public concertTicketPurchase createConcertTicketPurchase(concertTicketPurchase concertticketpurchase);

    public List<concertTicketPurchase> getAllConcertTicketPurchase();

    public concertTicketPurchase editConcertTicketPurchase (concertTicketPurchase concertticketpurchase, int id);

    public void deleteConcertTicketPurchase(concertTicketPurchase concertticketpurchase, int id);


}
