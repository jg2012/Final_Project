package com.promineo.tickets.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "/tickets/concert_attendee")

public class concertAttendee {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int concert_attendee_id;

    @Column(value = "concert_attendee_name")
    private String concert_attendee_name;

}
