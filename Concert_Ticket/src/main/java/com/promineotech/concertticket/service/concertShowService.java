package com.promineotech.concert_ticket.service;

import com.promineotech.concert_ticket.entity.concert_show;

import java.util.List;

public interface concertShowService {


    public concert_show createConcertShow (concert_show concertShow);

    public List<concert_show> getAllConcertShows();

    public concert_show editConcertShow(concert_show concertShow, int id);

    public void deleteConcertShow (concert_show concertShow, int id);





}
