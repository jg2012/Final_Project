package com.promineo.tickets.service;

import com.promineo.tickets.Exceptions.ResourceNotFoundException;
import com.promineo.tickets.entity.concertShow;
import com.promineo.tickets.repo.concertShowRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class concertShowServiceImp implements concertShowService {

    //Calls the repo into the Service.
    private concertShowRepo concertshowrepo;

    //Implements the repo intot he service.
    @Autowired
    public concertShowServiceImp (concertShowRepo concertshowrepo){
        this.concertshowrepo= concertshowrepo;
    }

    //Lists the concert shows.
    @Override
    public List<concertShow> getAllConcertShow() {
        return concertshowrepo.findAll();
    }

    //Creates a new concert show.
    @Override
    public concertShow createConcertShow(concertShow concertshow) {
        return concertshowrepo.save(concertshow);
    }


    //Edits a concert show.
    @Override
    public concertShow editConcertShow(concertShow concertshow, int id) {
        concertShow show = concertshowrepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("concert_show", "ID", id));
        show.setConcert_show_id(concertshow.getConcert_show_id());
        show.setConcert_artist(concertshow.getConcert_artist());
        show.setConcert_attendee_id(concertshow.getConcert_attendee_id());
        concertshowrepo.save(show);
        return show;
    }

    //Deletes the concert show.
    @Override
    public void deleteConcertShow(concertShow concertshow, int id) {
        concertShow show = concertshowrepo.findById(id).orElseThrow(()-> new ResourceNotFoundException("concert_show", "ID", id));
        concertshowrepo.deleteById(id);
    }
}







