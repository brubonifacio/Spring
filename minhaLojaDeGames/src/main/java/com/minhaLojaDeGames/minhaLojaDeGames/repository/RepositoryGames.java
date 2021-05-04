package com.minhaLojaDeGames.minhaLojaDeGames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.minhaLojaDeGames.minhaLojaDeGames.model.CategoriaModelGames;

public interface RepositoryGames  extends JpaRepository<CategoriaModelGames , Long>{

	public List<CategoriaModelGames> findAllByEstiloIgnoreCase (String estilo);
}
