package com.valeriodev.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.valeriodev.dslist.dto.GameListDTO;
import com.valeriodev.dslist.entities.GameList;
import com.valeriodev.dslist.repositories.GameListRepositorie;

@Service
public class GameListService {
  
  @Autowired
  private GameListRepositorie gameListRepositorio;

  @Transactional(readOnly = true)
  public List<GameListDTO> findAll(){
    List<GameList> resultado = gameListRepositorio.findAll();
    return resultado.stream().map(x -> new GameListDTO(x)).toList();
  }
}
