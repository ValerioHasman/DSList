package com.valeriodev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.valeriodev.dslist.entities.Game;

public interface GameRepositorie extends JpaRepository<Game, Long> {
  
}
