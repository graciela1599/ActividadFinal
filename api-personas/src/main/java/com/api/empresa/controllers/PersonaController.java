package com.api.empresa.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.empresa.request.PersonaRequest;
import com.api.empresa.response.PersonaResponse;
import com.api.empresa.response.Response;
import com.api.empresa.service.PersonaService;

@RestController
@RequestMapping("/api/persona/")
public class PersonaController {

	@Autowired
	PersonaService personaService;
	
	@PostMapping("create")
	public Response createPersona(@Valid @RequestBody PersonaRequest persona) {
		return personaService.createPersona(persona);
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
