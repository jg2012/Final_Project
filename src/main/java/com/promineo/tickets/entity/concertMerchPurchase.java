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
@Table("/tickets/concert_merch_purchase")
public class concertMerchPurchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int concert_merch_purchase_id;

    @Column(value = "concert_merch_item")
    private String concert_merch_item;

    @Column(value = "concert_attendee_id")
    private int concert_attendee_id;
}
