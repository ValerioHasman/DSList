package com.valeriodev.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.valeriodev.dslist.dto.GameDTO;
import com.valeriodev.dslist.dto.GameMinDTO;
import com.valeriodev.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
  
  @Autowired
  private GameService gameService;

  @GetMapping(value = "/{id}")
  public GameDTO findById(@PathVariable Long id){
    GameDTO resultado = gameService.findById(id);
    return resultado;
  }

  @GetMapping
  public List<GameMinDTO> findAll(){
    List<GameMinDTO> resultado = gameService.findAll();
    return resultado;
  }
}
