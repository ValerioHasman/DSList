package com.valeriodev.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valeriodev.dslist.dto.GameMinDTO;
import com.valeriodev.dslist.entities.Game;
import com.valeriodev.dslist.repositories.GameRepositorie;

@Service
public class GameService {
  
  @Autowired
  private GameRepositorie gameRepositorie;

  public List<GameMinDTO> findAll(){
    List<Game> resultado = gameRepositorie.findAll();
    List<GameMinDTO> dto = resultado.stream().map(x -> new GameMinDTO(x)).toList();
    return dto;
  }
}
