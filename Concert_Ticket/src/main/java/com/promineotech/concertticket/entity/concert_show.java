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
@Table("concert_show")
public class concert_show {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int concert_show_id;

    @Column("concert_artist")
    private String concert_artist;

    @Column("concert_attendee_id")
    private int concert_attendee_id;
}
