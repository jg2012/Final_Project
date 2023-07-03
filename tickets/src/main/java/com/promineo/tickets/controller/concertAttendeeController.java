package com.promineo.tickets.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.promineo.tickets.entity.concertAttendee;
import com.promineo.tickets.repo.concertAttendeeRepo;
import com.promineo.tickets.service.concertAttendeeService;

@RestController
@RequestMapping("concert_attendee")
public class concertAttendeeController {

    //Calls in the service.
    @Autowired 
    private concertAttendeeService concertattendeeservice;

    //Calls in the Repo.
    private concertAttendeeRepo concertattendeerepo;
    
    @Autowired
    public concertAttendeeController(concertAttendeeService concertattendeeservice, concertAttendeeRepo concertattendeerepo) {
	super(); 
	this.concertattendeeservice = concertattendeeservice;

        this.concertattendeerepo = concertattendeerepo;
    }

    //Gets the concert attendee.
    @GetMapping
    public List<concertAttendee> getAllConcertAttendee(){
	return concertattendeeservice.getAllConcertAttendee(); 
    }

    //Creates a new concert attendee.
    @PostMapping
    public concertAttendee createConcertAttendee(@RequestBody concertAttendee concertattendee) {
	return concertattendeerepo.save(concertattendee); 
    }

    //Edits a new concert attendee.
    @PutMapping("{id}")
    public ResponseEntity<concertAttendee> editConcertAttendee(@PathVariable int id, @RequestBody concertAttendee concertattendee) {
	return new ResponseEntity<concertAttendee>(concertattendeeservice.editConcertAttendee(concertattendee, id), HttpStatus.OK);
    }

    //Deletes the concert attendee.
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteConcertAttendee(@PathVariable int id, @RequestBody concertAttendee concertattendee) {
    concertattendeeservice.deleteConcertAttendee(concertattendee, id);
    return new ResponseEntity<String>("Attendee with id:  "+ id + " was deleted", HttpStatus.OK);
    }

}
