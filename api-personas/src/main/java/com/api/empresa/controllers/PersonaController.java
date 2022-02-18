package com.api.empresa.controllers;

import java.time.LocalDateTime;
import java.util.List;


import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.empresa.request.PersonaRequest;
import com.api.empresa.response.PersonaResponse;
import com.api.empresa.response.CreatePersonaResponse;
import com.api.empresa.service.PersonaService;

@RestController
@RequestMapping("/api/persona/")
public class PersonaController {
	
	
	Logger logger = LoggerFactory.getLogger(PersonaController.class);
	
	@Autowired
	PersonaService personaService;
	
	@PostMapping("create")
	public CreatePersonaResponse createPersona(@Valid @RequestBody PersonaRequest persona) {
		CreatePersonaResponse personaResp = personaService.createPersona(persona);
		logger.info(" The record: " + personaResp  + " has been saved. At " + LocalDateTime.now() + " moment.");
		
		return personaResp;
	}
	
	@GetMapping("getAll")
	public List<PersonaResponse> getAllPersonas(){
		return personaService.getAll().stream().map(PersonaResponse::new).toList();
	}
	
	@GetMapping("get/nombre/{nombre}")
	public PersonaResponse getPersonaByNombre(@PathVariable("nombre") String nombre) {
		return new PersonaResponse(personaService.getPersonaByNombre(nombre));
	}
}
