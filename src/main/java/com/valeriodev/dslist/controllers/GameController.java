package com.valeriodev.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.valeriodev.dslist.dto.GameMinDTO;
import com.valeriodev.dslist.services.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameController {
  
  @Autowired
  private GameService gameService;

  @GetMapping
  public List<GameMinDTO> findAll(){
    List<GameMinDTO> resultado = gameService.findAll();
    return resultado;
  }
}
