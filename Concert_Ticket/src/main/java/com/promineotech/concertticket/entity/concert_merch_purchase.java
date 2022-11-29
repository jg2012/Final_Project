package com.promineotech.concert_ticket.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Entity
@Table(value = "concert_merch_purchase")
public class concert_merch_purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int concert_merch_purchase_id;

    @Column(value = "concert_merch_item")
    private String concert_merch_item;

    @Column(value = "concert_attendee_id")
    private int concert_attendee_id;



}
