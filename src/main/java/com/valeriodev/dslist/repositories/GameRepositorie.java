package com.valeriodev.dslist.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.valeriodev.dslist.entities.Game;
import com.valeriodev.dslist.projections.GameMinProjection;

public interface GameRepositorie extends JpaRepository<Game, Long> {

  @Query(nativeQuery = true, value = """
		SELECT tb_game.id, tb_game.titulo, tb_game.ano, tb_game.imagem_url, tb_game.descricao_curta, tb_pertence.posicao
    FROM tb_game
    INNER JOIN tb_pertence ON tb_game.id = tb_pertence.game_id
    WHERE tb_pertence.list_id = :listId
    ORDER BY tb_pertence.posicao
			""")
  List<GameMinProjection> searchByList(Long listId);
  
}
