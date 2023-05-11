package com.valeriodev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valeriodev.dslist.entities.GameList;

public interface GameListRepositorie extends JpaRepository<GameList, Long> {
  
}
