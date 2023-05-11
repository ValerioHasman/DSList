package com.valeriodev.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pertence")
public class Pertence {
  
  @EmbeddedId
  private PertencePK id = new PertencePK();
  private Integer posicao;

  public Pertence() {
  }
  
  public Pertence(Game game, GameList list, Integer posicao) {
    this.id.setGame(game);
    this.id.setList(list);
    this.posicao = posicao;
  }

  public PertencePK getId() {
    return id;
  }

  public void setId(PertencePK id) {
    this.id = id;
  }

  public Integer getPosicao() {
    return posicao;
  }

  public void setPosicao(Integer posicao) {
    this.posicao = posicao;
  }

  
}
