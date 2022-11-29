package com.promineo.tickets.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineo.tickets.Exceptions.ResourceNotFoundException;
import com.promineo.tickets.entity.concertAttendee;
import com.promineo.tickets.repo.concertAttendeeRepo;


@Service
public class concertAttendeeServiceImp implements concertAttendeeService {
    private concertAttendeeRepo concertattendeerepo;

    @Autowired
    public concertAttendeeServiceImp(concertAttendeeRepo concertattendeerepo){
        this.concertattendeerepo = concertattendeerepo;
    }

    @Override
    public concertAttendee createConcertAttendee(concertAttendee concertattendee) {
	return concertattendeerepo.save(concertattendee);
    }

    @Override
    public List<concertAttendee> getAllConcertAttendee() {
	return concertattendeerepo.findAll();
    }

    @Override
    public concertAttendee editConcertAttendee(concertAttendee concertattendee, int id) {
	
	concertAttendee attendee = concertattendeerepo.findById(id).orElseThrow(()->new ResourceNotFoundException ("concertAttendee", "Id", id)); 
	
	
	attendee.setConcert_attendee_id(concertattendee.getConcert_attendee_id());
	attendee.setConcert_attendee_name(concertattendee.getConcert_attendee_name());
	
	concertattendeerepo.save(attendee); 
	
        return attendee; 
    }

    @Override
    public void deleteConcertAttendee(concertAttendee concertattendee, int id) {
	concertattendeerepo.deleteById(id); 
    }
}
