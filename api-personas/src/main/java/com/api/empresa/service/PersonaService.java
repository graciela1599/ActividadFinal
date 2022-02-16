package com.api.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.empresa.entity.Empresa;
import com.api.empresa.entity.Persona;
import com.api.empresa.exception.EmpresaReferenciaNullException;
import com.api.empresa.exception.NoHayPersonasException;
import com.api.empresa.exception.NombreExistenteException;
import com.api.empresa.exception.PersonaDesconocidaException;
import com.api.empresa.repository.PersonaRepository;
import com.api.empresa.request.EmpresaRequest;
import com.api.empresa.request.PersonaRequest;
import com.api.empresa.response.PersonaResponse;
import com.api.empresa.response.CreatePersonaResponse;

@Service
public class PersonaService {

	@Autowired
	PersonaRepository personaRepository;

	@Autowired
	EmpresaService empresaService;

	@Autowired
	SaludoService saludoService;

	public CreatePersonaResponse createPersona(PersonaRequest personaRequest) {
		Persona persona = new Persona();
		CreatePersonaResponse response = new CreatePersonaResponse();

		persona.setNombre(personaRequest.getNombre());
		persona.setDireccion(personaRequest.getDireccion());
		persona.setEdad(personaRequest.getEdad());

		EmpresaRequest empresaRequest = personaRequest.getEmpresa();

		if (empresaRequest != null) {
			Empresa empresa = empresaService.getEmpresaByNombreAndDireccion(empresaRequest.getNombre(),
					empresaRequest.getDireccion());

			if (empresa == null) {
				empresa = empresaService.createEmpresa(empresaRequest);
			}

			persona.setEmpresa(empresa);

			try {
				persona = personaRepository.save(persona);
			} catch (Exception e) {
				throw new NombreExistenteException();
			}

			response.setPersona(new PersonaResponse(persona));
			response.setSaludo(saludoService.getSaludo().getSaludo());
		}else {
			throw new EmpresaReferenciaNullException();
		}

		return response;
	}

	public List<Persona> getAll() {
		List<Persona> personas = personaRepository.findAll();

		if (personas == null || personas.isEmpty()) {
			throw new NoHayPersonasException();
		}
		return personas;
	}

	public Persona getPersonaByNombre(String nombre) {
		Persona persona = personaRepository.findByNombre(nombre);

		if (persona == null)
			throw new PersonaDesconocidaException();

		return persona;
	}
}
