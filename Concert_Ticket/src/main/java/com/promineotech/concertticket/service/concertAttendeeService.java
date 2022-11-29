package com.promineotech.concert_ticket.service;

import com.promineotech.concert_ticket.entity.concert_attendee;

import java.util.List;

public interface concertAttendeeService {

    public concert_attendee createConcertAttendee (concert_attendee concertAttendee);

    public List<concert_attendee> getAllConcertAttendee();

    public concert_attendee editConcertAttendee(concert_attendee concertAttendee, int id);

    public void deleteConcertAttendee(concert_attendee concertAttendee, int id);

}
