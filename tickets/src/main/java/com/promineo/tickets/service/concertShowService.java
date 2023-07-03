package com.promineo.tickets.service;

import com.promineo.tickets.entity.concertShow;

import java.util.List;

public interface concertShowService {
    public concertShow createConcertShow (concertShow concertshow);

    public List<concertShow> getAllConcertShow();

    public concertShow editConcertShow(concertShow concertshow, int id);

    public void deleteConcertShow(concertShow concertshow, int id);

}
