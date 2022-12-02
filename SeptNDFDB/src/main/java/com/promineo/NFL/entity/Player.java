package com.promineo.NFL.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name="player")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int player_id; 
  
    @Column(value="team_id")
    private int team_id; 
    @Column(value="first_name")
    private String first_name;
    @Column(value="last_name")
    private String last_name;

    
}
