package com.promineotech.concert_ticket.controller;


import com.promineotech.concert_ticket.entity.concert_attendee;
import com.promineotech.concert_ticket.service.concertAttendeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("concert_attendee")
public class concertAttendeeController {

    private concertAttendeeService concertattendeeservice;

    public concertAttendeeController(concertAttendeeService concertattendeeservice){
        super();
        this.concertattendeeservice = concertattendeeservice;
    }
    @PostMapping
    public ResponseEntity<concert_attendee> createConcertAttendee(@RequestBody concert_attendee concertAttendee){
        return new ResponseEntity<>(concertattendeeservice.createConcertAttendee(concertAttendee), HttpStatus.CREATED);
    }



}
