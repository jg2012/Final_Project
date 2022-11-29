package com.promineotech.concert_ticket.service;

import com.promineotech.concert_ticket.entity.concert_ticket_purchase;

import java.util.List;

public interface concertTicketPurchaseService {

    public concert_ticket_purchase createConcertTicketPurchase(concert_ticket_purchase concertTicketPurchase);

    public List<concert_ticket_purchase> getAllConcertTicketPurchases();

    public concert_ticket_purchase editConcertTicketPurchase(concert_ticket_purchase concertTicketPurchase, int id);

    public void deleteConcertTicketPurchases(concert_ticket_purchase concertTicketPurchase, int id);



}
