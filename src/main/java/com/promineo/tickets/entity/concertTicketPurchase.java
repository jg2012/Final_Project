package com.promineo.tickets.entity;

import lombok.Data;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
@Entity
@Table(name = "concert_ticket_purchase")
public class concertTicketPurchase {

    //concert_ticket_purchase table ID.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int concert_ticket_purchase_id;

    @Column(value = "concert_attendee_id")
    private  int concert_attendee_id;

    @Column(value = "concert_show_id")
    private int concert_show_id;

}
