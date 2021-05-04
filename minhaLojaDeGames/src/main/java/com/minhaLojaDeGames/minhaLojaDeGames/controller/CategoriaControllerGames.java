package com.minhaLojaDeGames.minhaLojaDeGames.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.minhaLojaDeGames.minhaLojaDeGames.model.CategoriaModelGames;
import com.minhaLojaDeGames.minhaLojaDeGames.repository.RepositoryGames;

@RestController
@RequestMapping("/Loja")
@CrossOrigin("*")
public class CategoriaControllerGames {

	@Autowired
	private RepositoryGames repositoryGames;
	
	public ResponseEntity<List<CategoriaModelGames>> GetAll(){
		return ResponseEntity.ok(repositoryGames.findAll());
	}
	@GetMapping("/{id}")
	public ResponseEntity<CategoriaModelGames> getById(@PathVariable long id){
		return repositoryGames.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	@GetMapping("/estilo /{estilo}")
	public ResponseEntity<List<CategoriaModelGames>> GetByEstilo(@PathVariable String estilo){
		return ResponseEntity.ok(repositoryGames.findAllByEstiloIgnoreCase(estilo));
	}
	@PostMapping
	public ResponseEntity<CategoriaModelGames> post (@RequestBody CategoriaModelGames postagem){
		return ResponseEntity.status(HttpStatus.CREATED).body(repositoryGames.save(postagem));
	}
	@PutMapping
	public ResponseEntity<CategoriaModelGames> put (@RequestBody CategoriaModelGames postagem){
		return ResponseEntity.status(HttpStatus.OK).body(repositoryGames.save(postagem));
	}
	@DeleteMapping("/{id}")
	public void detete(@PathVariable long id) {
		repositoryGames.deleteById(id);
	}
}
