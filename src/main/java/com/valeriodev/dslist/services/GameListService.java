package com.valeriodev.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.valeriodev.dslist.dto.GameListDTO;
import com.valeriodev.dslist.entities.GameList;
import com.valeriodev.dslist.projections.GameMinProjection;
import com.valeriodev.dslist.repositories.GameListRepositorie;
import com.valeriodev.dslist.repositories.GameRepositorie;

@Service
public class GameListService {
  
  @Autowired
  private GameListRepositorie gameListRepositorio;

  @Autowired
  private GameRepositorie gameRepositorie;

  @Transactional(readOnly = true)
  public List<GameListDTO> findAll(){
    List<GameList> resultado = gameListRepositorio.findAll();
    return resultado.stream().map(x -> new GameListDTO(x)).toList();
  }

  @Transactional
  public void move(Long listId, int posicaoOrigem, int posicaoDestino){

    List<GameMinProjection> list = gameRepositorie.searchByList(listId);
    
    GameMinProjection obj = list.remove(posicaoOrigem);
    list.add(posicaoDestino, obj);

    int min = posicaoOrigem < posicaoDestino ? posicaoOrigem : posicaoDestino;
    int max = posicaoOrigem < posicaoDestino ? posicaoDestino : posicaoOrigem;

    for(int i = min; i <= max; i++){
      gameListRepositorio.updateBelongingPosition(listId, list.get(i).getId(), i);
    }
  }
}
