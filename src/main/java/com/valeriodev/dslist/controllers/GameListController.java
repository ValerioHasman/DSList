package com.valeriodev.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.valeriodev.dslist.dto.GameListDTO;
import com.valeriodev.dslist.services.GameListService;

@RestController
@RequestMapping(value = "/list")
public class GameListController {
  
  @Autowired
  private GameListService gameListService;

  @GetMapping
  public List<GameListDTO> findAll(){
    List<GameListDTO> resultado = gameListService.findAll();
    return resultado;
  }
}
