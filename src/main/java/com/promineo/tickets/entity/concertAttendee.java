package com.promineo.tickets.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;
import org.hibernate.Hibernate;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import javax.persistence.*;
import java.util.*;

@Data
@Entity
@Table(name = "concert_attendee")

public class concertAttendee {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int concert_attendee_id;

    @Column(value = "concert_attendee_name")
    private String concert_attendee_name;

    @JsonIgnore
    @OneToMany(mappedBy = "concertattendee", cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<concertMerchPurchase> merchPurchases = new ArrayList<>();
    
    //Check FetchType.Lazy try to switch Eager
    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.DETACH)
    @JoinTable(name = "concert_ticket_purchase",
    joinColumns = {
            @JoinColumn(name = "concert_attendee_id", foreignKey = @ForeignKey(name = "concert_attendee_id"))},
//                    value = ConstraintMode.NO_CONSTRAINT))},
            inverseJoinColumns = {
            @JoinColumn(name = "concert_show_id", foreignKey = @ForeignKey(name = "concert_show_id"))})
//                    value = ConstraintMode.NO_CONSTRAINT)) })

    @JsonIgnore
    private Set<concertShow> concertShows = new HashSet<>();



}
