package com.promineotech.concertticket.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Entity
@Table(name = "concert_attendee")
public class concert_attendee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int concert_attendee_id;

    @Column(value = "concert_attendee_name")
    private String concert_attendee_name;


}
