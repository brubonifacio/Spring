package com.minhaLojaDeGames.minhaLojaDeGames.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


	@Entity
	@Table(name = "tb_tema")
		public class Tema {

			@Id
			@GeneratedValue(strategy = GenerationType.IDENTITY)
			private long id;
			
			@NotNull
			private String descricao;
			
			@OneToMany(mappedBy = "tema", cascade = CascadeType.ALL)
			private List<CategoriaModelGames> categoria;

			public long getId() {
				return id;
			}

			public void setId(long id) {
				this.id = id;
			}

			public String getDescricao() {
				return descricao;
			}

			public void setDescricao(String descricao) {
				this.descricao = descricao;
			}

			public List<CategoriaModelGames> getCategoria() {
				return categoria;
			}

			public void setCategoria(List<CategoriaModelGames> categoria) {
				this.categoria = categoria;
			}

			
			
			
		}



