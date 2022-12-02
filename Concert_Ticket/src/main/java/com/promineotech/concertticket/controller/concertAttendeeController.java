package com.promineotech.concertticket.controller;


import com.promineotech.concertticket.entity.concert_attendee;
import com.promineotech.concertticket.service.concertAttendeeService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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
