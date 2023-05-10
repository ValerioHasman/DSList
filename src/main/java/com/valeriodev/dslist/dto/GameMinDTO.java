package com.valeriodev.dslist.dto;

import com.valeriodev.dslist.entities.Game;

public class GameMinDTO {
  
  private Long id;
  private String titulo;
  private Integer ano;
  private String imagemUrl;
  private String descricaoCurta;

  public GameMinDTO(){}

  public GameMinDTO(Game entity) {
    this.id = entity.getId();
    this.titulo = entity.getTitulo();
    this.ano = entity.getAno();
    this.imagemUrl = entity.getImagemUrl();
    this.descricaoCurta = entity.getDescricaoCurta();
  }

  public Long getId() {
    return id;
  }

  public String getTitulo() {
    return titulo;
  }

  public Integer getAno() {
    return ano;
  }

  public String getImagemUrl() {
    return imagemUrl;
  }

  public String getDescricaoCurta() {
    return descricaoCurta;
  }

  
  
}
