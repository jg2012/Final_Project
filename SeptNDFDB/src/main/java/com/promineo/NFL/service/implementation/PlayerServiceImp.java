package com.promineo.NFL.service.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.promineo.NFL.entity.Player;

@Service
public class PlayerServiceImp implements PlayerService {

    private PlayerRepository playerRepository; 
    
    @Autowired
    public PlayerServiceImp(PlayerRepository playerRepository) {
	this.playerRepository = playerRepository; 
    }
    
    
    @Override
    public Player SavePlayer(Player player) {
	return playerRepository.save(player); 
    }

}
