package com.promineotech.concertticket.service;

import com.promineotech.concertticket.entity.concert_show;
import com.promineotech.concertticket.repository.concertShowRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class concertShowServiceImp implements concertShowService{

    private concertShowRepo concertshowrepo;

    @Autowired
    public concertShowServiceImp (concertShowRepo concertshowrepo){
        this.concertshowrepo= concertshowrepo;
    }


    @Override
    public concert_show createConcertShow(concert_show concertShow) {
        return concertshowrepo.save(concertShow);
    }

    @Override
    public List<concert_show> getAllConcertShows() {
        return concertshowrepo.findAll();
    }

    @Override
    public concert_show editConcertShow(concert_show concertShow, int id) {
        concert_show show = concertshowrepo.findById(id).orElseThrow();
        show.setConcert_artist(concertShow.getConcert_artist());
        show.setConcert_attendee_id(concertShow.getConcert_attendee_id());

        concertshowrepo.save(show);
        return show;
    }

    @Override
    public void deleteConcertShow(concert_show concertShow, int id) {
        concert_show show = concertshowrepo.findById(id).orElseThrow();
        concertshowrepo.deleteById(id);

    }
}
