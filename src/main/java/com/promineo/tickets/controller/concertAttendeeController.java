package com.promineo.tickets.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.promineo.tickets.Exceptions.ResourceNotFoundException;
import com.promineo.tickets.entity.concertAttendee;
import com.promineo.tickets.repo.concertAttendeeRepo;
import com.promineo.tickets.service.concertAttendeeService;

@RestController
@RequestMapping("concert_attendee")
public class concertAttendeeController {
    
    
    private concertAttendeeService concertattendeeservice;
    public final concertAttendeeRepo concertattendeerepo;
    @Autowired
    public concertAttendeeController(concertAttendeeService concertattendeeservice, concertAttendeeRepo concertattendeerepo) {
	super(); 
	this.concertattendeeservice = concertattendeeservice;

        this.concertattendeerepo = concertattendeerepo;
    }
    

    
    
    
    
    
    @GetMapping
    public List<concertAttendee> getAllConcertAttendee(){
	return concertattendeeservice.getAllConcertAttendee(); 
    }
    
    
    @PostMapping
    public concertAttendee createConcertAttendee(@RequestBody concertAttendee concertattendee) {
	return concertattendeerepo.save(concertattendee); 
    }
    
    @PutMapping("{id}")
    public ResponseEntity<concertAttendee> editConcertAttendee(@PathVariable int id, @RequestBody concertAttendee concertattendee) {
	

	return new ResponseEntity<concertAttendee>(concertattendeeservice.editConcertAttendee(concertattendee, id), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteConcertAttendee(@PathVariable int id, @RequestBody concertAttendee concertattendee) {
    concertattendeeservice.deleteConcertAttendee(concertattendee, id);

    return new ResponseEntity<String>("That attendee "+ id + " was deleted", HttpStatus.OK);
    }

    }
