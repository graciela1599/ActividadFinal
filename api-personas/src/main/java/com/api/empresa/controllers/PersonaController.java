package com.api.empresa.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.empresa.request.PersonaRequest;
import com.api.empresa.response.PersonaResponse;
import com.api.empresa.service.PersonaService;

@RestController
@RequestMapping("/api/persona/")
public class PersonaController {

	@Autowired
	PersonaService personaService;
	
	@PostMapping("create")
	public PersonaResponse createPersona(@Valid @RequestBody PersonaRequest persona) {
		personaService.createPersona(persona);
		return null;
	}
}
