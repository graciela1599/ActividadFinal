package com.api.empresa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.empresa.entity.Empresa;
import com.api.empresa.entity.Persona;
import com.api.empresa.repository.EmpresaRepository;
import com.api.empresa.repository.PersonaRepository;
import com.api.empresa.request.PersonaRequest;

@Service
public class PersonaService {

	@Autowired
	PersonaRepository personaRepository;
	
	@Autowired
	EmpresaRepository empresaRepository;
	
	public Persona createPersona(PersonaRequest personaRequest) {
		Persona persona = new Persona();
		
		persona.setNombre(personaRequest.getNombre());
		persona.setDireccion(persona.getDireccion());
		persona.setEdad(persona.getEdad());
	
		
		Empresa empresa = empresaRepository.findByNombreAndDireccion(personaRequest.getEmpresa().getNombre(), personaRequest.getEmpresa().getDireccion());
		
		System.out.println(empresa!=null);
		if(empresa != null) {
			System.out.println("si se pudo haha");
		}
		System.out.println(empresaRepository.findByNombre(personaRequest.getEmpresa().getNombre()));
		System.out.println(personaRequest.getEmpresa());
		
		
		return persona;
	}
	
}
