package com.promineo.tickets.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineo.tickets.Exceptions.ResourceNotFoundException;
import com.promineo.tickets.entity.concertAttendee;
import com.promineo.tickets.repo.concertAttendeeRepo;


@Service
public class concertAttendeeServiceImp implements concertAttendeeService {

    //Calls concertAttendeeRepo into the Service.
    private concertAttendeeRepo concertattendeerepo;
    
    //Implements the repo into the service.
    @Autowired
    public concertAttendeeServiceImp(concertAttendeeRepo concertattendeerepo){
        this.concertattendeerepo = concertattendeerepo;
    }

    //Creates a list to fetch all concert sttendees.
    @Override
    public List<concertAttendee> getAllConcertAttendee() {
        return concertattendeerepo.findAll();
    }

    //Calls and returns a concer attendee to save the attendee
    @Override
    public concertAttendee createConcertAttendee(concertAttendee concertattendee) {
	return concertattendeerepo.save(concertattendee);
    }

    //Edits a concert attendee by table Id and throws an exception if the ID is not found.
    @Override
    public concertAttendee editConcertAttendee(concertAttendee concertattendee, int id) {
	concertAttendee attendee = concertattendeerepo.findById(id).orElseThrow(()->new ResourceNotFoundException ("concertAttendee", "Id", id));
	attendee.setConcert_attendee_id(concertattendee.getConcert_attendee_id());
	attendee.setConcert_attendee_name(concertattendee.getConcert_attendee_name());
	concertattendeerepo.save(attendee);
        return attendee; 
    }

    //Deletes the concert attendee by id.
    @Override
    public void deleteConcertAttendee(concertAttendee concertattendee, int id) {
        concertAttendee attendee = concertattendeerepo.findById(id).orElseThrow(()->new ResourceNotFoundException ("concertAttendee", "Id", id));
        concertattendeerepo.deleteById(id);
    }
}
