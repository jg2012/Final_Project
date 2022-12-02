package com.promineo.tickets.service;

import com.promineo.tickets.Exceptions.ResourceNotFoundException;
import com.promineo.tickets.entity.concertShow;
import com.promineo.tickets.repo.concertAttendeeRepo;
import com.promineo.tickets.repo.concertShowRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class concertShowServiceImp implements concertShowService {

  
    private concertShowRepo concertshowrepo;

    @Autowired
    public concertShowServiceImp (concertShowRepo concertshowrepo){
        this.concertshowrepo= concertshowrepo;
    }


    @Override
    public concertShow createConcertShow(concertShow concertshow) {
        return concertshowrepo.save(concertshow);
    }

    @Override
    public List<concertShow> getAllConcertShow() {
        return concertshowrepo.findAll();
    }

    @Override
    public concertShow editConcertShow(concertShow concertshow, int id) {

        concertShow show = concertshowrepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("concert_show", "ID", id));

        show.setConcert_show_id(concertshow.getConcert_show_id());
        show.setConcert_artist(concertshow.getConcert_artist());
        show.setConcert_attendee_id(concertshow.getConcert_attendee_id());

        concertshowrepo.save(show);
        return show;
    }

    @Override
    public void deleteConcertShow(concertShow concertshow, int id) {



        concertshowrepo.deleteById(id);

    }
}







