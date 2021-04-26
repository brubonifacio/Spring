package com.mentalidades.mentalidades.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/mentalidades")

public class mentalidadesController {

	@GetMapping
	public String mentalidades() {
		return "Persistência e Atenção aos detalhes";
	}
}
