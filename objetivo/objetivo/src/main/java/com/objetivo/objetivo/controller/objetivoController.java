package com.objetivo.objetivo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivo")

public class objetivoController {

	@GetMapping()
		public String objetivo () {
			return "Essa semana para o meu objetivo de aprendizagem é aprender Spring e SQL";
		}

	}

