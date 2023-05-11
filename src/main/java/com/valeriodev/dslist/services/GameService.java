package com.valeriodev.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.valeriodev.dslist.dto.GameDTO;
import com.valeriodev.dslist.dto.GameMinDTO;
import com.valeriodev.dslist.entities.Game;
import com.valeriodev.dslist.repositories.GameRepositorie;

@Service
public class GameService {
  
  @Autowired
  private GameRepositorie gameRepositorio;

  @Transactional(readOnly = true)
  public GameDTO findById(Long id){
    Game resultado = gameRepositorio.findById(id).get();
    GameDTO dto = new GameDTO(resultado);
    return dto;
  }

  @Transactional(readOnly = true)
  public List<GameMinDTO> findAll(){
    List<Game> resultado = gameRepositorio.findAll();
    List<GameMinDTO> dto = resultado.stream().map(x -> new GameMinDTO(x)).toList();
    return dto;
  }
}
