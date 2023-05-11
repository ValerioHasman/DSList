package com.valeriodev.dslist.dto;

import com.valeriodev.dslist.entities.GameList;

public class GameListDTO {
  
  private Long id;
  private String nome;

  public GameListDTO(){}
  
  public GameListDTO(GameList entidade){
    this.id = entidade.getId();
    this.nome =entidade.getNome();
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
  


}
