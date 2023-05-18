package com.valeriodev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.valeriodev.dslist.entities.GameList;

public interface GameListRepositorie extends JpaRepository<GameList, Long> {
  
  @Modifying
  @Query(nativeQuery = true,
    value = "UPDATE tb_pertence SET posicao = :newPosition WHERE list_id = :listId AND game_id = :gameId")
  void updateBelongingPosition(Long listId, Long gameId, Integer newPosition);

}
