package com.farmacia.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TemaRepository {

	public interface Tema extends JpaRepository<TemaRepository, Long>{
		public List<TemaRepository> findAllByDescricaoContainingIgnoreCase( String descricao);
	}
}
