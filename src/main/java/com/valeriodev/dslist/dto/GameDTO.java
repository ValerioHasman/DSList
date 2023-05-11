package com.valeriodev.dslist.dto;

import org.springframework.beans.BeanUtils;

import com.valeriodev.dslist.entities.Game;

public class GameDTO {
  private Long id;
  private String titulo;
  private Integer ano;
  private String genero;
  private String plataforma;
  private Double pontuacao;
  private String imagemUrl;
  private String descricaoCurta;
  private String descricaoLonga;
  
  public GameDTO() {}

  public GameDTO(Game entidade) {
    BeanUtils.copyProperties(entidade, this);
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public Integer getAno() {
    return ano;
  }

  public void setAno(Integer ano) {
    this.ano = ano;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public String getPlataforma() {
    return plataforma;
  }

  public void setPlataforma(String plataforma) {
    this.plataforma = plataforma;
  }

  public Double getPontuacao() {
    return pontuacao;
  }

  public void setPontuacao(Double pontuacao) {
    this.pontuacao = pontuacao;
  }

  public String getImagemUrl() {
    return imagemUrl;
  }

  public void setImagemUrl(String imagemUrl) {
    this.imagemUrl = imagemUrl;
  }

  public String getDescricaoCurta() {
    return descricaoCurta;
  }

  public void setDescricaoCurta(String descricaoCurta) {
    this.descricaoCurta = descricaoCurta;
  }

  public String getDescricaoLonga() {
    return descricaoLonga;
  }

  public void setDescricaoLonga(String descricaoLonga) {
    this.descricaoLonga = descricaoLonga;
  }
  
  
}
