package com.promineotech.concert_ticket.service;

import com.promineotech.concert_ticket.entity.concert_attendee;
import com.promineotech.concert_ticket.repository.concertAttendeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class concertAttendeeServiceImp implements concertAttendeeService{

    private concertAttendeeRepo concertattendeerepo;

    @Autowired
    public concertAttendeeServiceImp(concertAttendeeRepo concertattendeerepo){
        this.concertattendeerepo = concertattendeerepo;
    }


    @Override
    public concert_attendee createConcertAttendee(concert_attendee concertAttendee) {

        return concertattendeerepo.save(concertAttendee);
    }

    @Override
    public List<concert_attendee> getAllConcertAttendee() {
        return concertattendeerepo.findAll();
    }

    @Override
    public concert_attendee editConcertAttendee(concert_attendee concertAttendee, int id) {
        concert_attendee attendee = concertattendeerepo.findById(id).orElseThrow();

        attendee.setConcert_attendee_name(concertAttendee.getConcert_attendee_name());

        concertattendeerepo.save(attendee);
        return attendee;
    }

    @Override
    public void deleteConcertAttendee(concert_attendee concertAttendee, int id) {
        concert_attendee attendee = concertattendeerepo.findById(id).orElseThrow();
        concertattendeerepo.deleteById(id);

    }
}
