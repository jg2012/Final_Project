package com.promineo.NFL.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.promineo.NFL.entity.Player;
import com.promineo.NFL.service.implementation.PlayerService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("NFL_DB/player")

public class PlayerController {
    private PlayerService playerService; 
    
    public PlayerContoller(PlayerService playerService) {
	super();
	this.playerService = playerService; 
    }
    
    //build the create Player API
    @PostMapping
    public ResponseEntity<Player> savePlayer(@RequestBody Player player){
	return new ResposneEntity<Player>playerService.savePlayer(player, HTTPStatus.CREATE);
    }
    
    
    
}
