package com.api.saludo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.saludo.entity.Saludo;
import com.api.saludo.exception.SaludoExistenteException;
import com.api.saludo.repository.SaludoRepository;
import com.api.saludo.request.CreateSaludoRequest;

@Service
public class SaludoService {
	
	@Autowired
	SaludoRepository saludoRepository;
	
	public Saludo createSaludo(CreateSaludoRequest createSaludoRequest) {
		
		Saludo saludo = new Saludo(createSaludoRequest);
		
		try {
			saludo = saludoRepository.save(saludo);
		}catch(Exception e) {
			throw new SaludoExistenteException(saludo);
		}
		
		
		return saludo;
	}
}
