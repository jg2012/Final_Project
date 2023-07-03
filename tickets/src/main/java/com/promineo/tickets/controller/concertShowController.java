package com.promineo.tickets.controller;

import com.promineo.tickets.entity.concertShow;
import com.promineo.tickets.repo.concertShowRepo;
import com.promineo.tickets.service.concertShowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("concert_show")
public class concertShowController {

    private concertShowService concertshowservice;

    private  concertShowRepo concertshowrepo;

    @Autowired
    public concertShowController(concertShowService concertshowservice, concertShowRepo concertshowrepo){
        super();
        this.concertshowservice=concertshowservice;
        this.concertshowrepo = concertshowrepo;
    }

    @GetMapping
    public List<concertShow> getAllConcertShow(){
        return concertshowservice.getAllConcertShow();
    }

    @PostMapping
    public concertShow createConcertShow(@RequestBody concertShow concertshow){
        return concertshowrepo.save(concertshow);
    }


    @PutMapping("{id}")
    public ResponseEntity<concertShow> editConcertShow(@PathVariable int id, @RequestBody concertShow concertshow){
        return new ResponseEntity<concertShow>(concertshowservice.editConcertShow(concertshow, id), HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteCocnertShow (@PathVariable int id, @RequestBody concertShow concertshow){
        concertshowservice.deleteConcertShow(concertshow, id);

        return new ResponseEntity<String>( "The show with id: "+ id + " was deleted", HttpStatus.OK);
    }


}
