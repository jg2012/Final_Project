package com.promineo.tickets.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "concert_show")
public class concertShow {

    //concert_show table ID.
    @Id
    @GeneratedValue(strategy =   GenerationType.IDENTITY)
    private int concert_show_id;

    @Column(value = "concert_artist")
    private String concert_artist;

    @Column(value = "concert_attendee_id")
    private int concert_attendee_id;

    //Many-to-Many Relationship to join in concert_ticket_purchase table with columns concert_attendee_id & concert_show_id.
    @ManyToMany(mappedBy = "concertShows", fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<concertAttendee> concertAttendees = new HashSet<>();



}
