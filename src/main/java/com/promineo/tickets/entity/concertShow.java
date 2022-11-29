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
@Table(name = "/tickets/concert_show")
public class concertShow {

    @Id
    @GeneratedValue(strategy =   GenerationType.IDENTITY)
    private int concert_show_id;

    @Column(value = "concert_artist")
    private String concert_artist;

    @Column(value = "concert_attendee_id")
    private int concert_attendee_id;

}
