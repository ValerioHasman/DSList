package com.valeriodev.dslist.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_game")
public class Game {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String titulo;
  private Integer ano;
  private String genero;
  private String plataforma;
  private Double pontuacao;
  private String imagemUrl;
  @Column(columnDefinition = "TEXT")
  private String descricaoCurta;
  @Column(columnDefinition = "TEXT")
  private String descricaoLonga;

  public Game(){}
  public Game(Long id, String titulo, Integer ano, String genero, String plataforma, Double pontuacao, String imagemUrl,
      String descricaoCurta, String descricaoLonga) {
    this.id = id;
    this.titulo = titulo;
    this.ano = ano;
    this.genero = genero;
    this.plataforma = plataforma;
    this.pontuacao = pontuacao;
    this.imagemUrl = imagemUrl;
    this.descricaoCurta = descricaoCurta;
    this.descricaoLonga = descricaoLonga;
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
  public Double getPontuacao() {
    return pontuacao;
  }
  public void setPlataforma(String plataforma) {
    this.plataforma = plataforma;
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
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }
  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Game other = (Game) obj;
    if (id == null) {
      if (other.id != null)
        return false;
    } else if (!id.equals(other.id))
      return false;
    return true;
  }

}
