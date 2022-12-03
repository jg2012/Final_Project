package com.promineo.tickets.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.*;



@Data
@Entity
@Table(name = "concert_merch_purchase")
public class concertMerchPurchase {

    //concert_merch_purchase table ID.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int concert_merch_purchase_id;

    @Column(value = "concert_merch_item")
    private String concert_merch_item;

   @Column(value = "concert_attendee_id")
    private int concert_attendee_id;

    //Many-to-One Relationship. concert_merch_purchase_id w/ concert_attendee_id.
    @ManyToOne
    @JoinColumn(name = "concert_attendee_id" ,insertable= false,updatable= false, nullable = false)
    @JsonIgnore
    private concertAttendee concertattendee; 

}
