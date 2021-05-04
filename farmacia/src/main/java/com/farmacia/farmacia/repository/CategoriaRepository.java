package com.farmacia.farmacia.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository {

	public interface Categoria extends JpaRepository<Categoria, Long> {
		public List<Categoria> findAllByDepartamentoContaIngIgnoreCase (String departamento);
		
}
}