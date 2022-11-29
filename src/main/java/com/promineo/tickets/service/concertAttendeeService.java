package com.promineo.tickets.service;

import java.util.List;

import com.promineo.tickets.entity.concertAttendee;

public interface concertAttendeeService {
    
    
    public concertAttendee createConcertAttendee (concertAttendee concertattendee);

    public List<concertAttendee> getAllConcertAttendee();

    public concertAttendee editConcertAttendee(concertAttendee concertattendee, int id);

    public void deleteConcertAttendee(concertAttendee concertattendee, int id);

}
