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
@Table("purchase")
public class concert_ticket_purchase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int concert_ticket_purchase_id;

    @Column(value = "concert_attendee_id")
    private int concert_attendee_id;

    @Column(value = "concert_show_id")
    private int concert_show_id;

    @Column(value = "concert_name")
    private int concert_name;
}
