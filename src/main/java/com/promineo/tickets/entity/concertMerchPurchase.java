package com.promineo.tickets.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.*;
import java.io.Serializable;


@Data
@Entity
@Table(name = "concert_merch_purchase")
public class concertMerchPurchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int concert_merch_purchase_id;

    @Column(value = "concert_merch_item")
    private String concert_merch_item;

   @Column(value = "concert_attendee_id")
    private int concert_attendee_id;

    @ManyToOne
    @JoinColumn(name = "concert_attendee_id" ,insertable= false,updatable= false, nullable = false)
    @JsonIgnore
    private concertAttendee concertattendee; 
    
    
    
    public concertMerchPurchase() {
	
    }

    public concertMerchPurchase(int concert_merch_purchase_id, String concert_merch_item, int concert_attendee_id,
	    concertAttendee concertattendee) {
	super();
	this.concert_merch_purchase_id = concert_merch_purchase_id;
	this.concert_merch_item = concert_merch_item;
	this.concert_attendee_id = concert_attendee_id;
	this.concertattendee = concertattendee;
    }


}
