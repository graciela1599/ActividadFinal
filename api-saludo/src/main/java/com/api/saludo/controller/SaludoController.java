package com.api.saludo.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.saludo.request.CreateSaludoRequest;
import com.api.saludo.response.SaludoResponse;
import com.api.saludo.service.SaludoService;

@RestController
@RequestMapping("/api/saludo/")
public class SaludoController {
	
	@Autowired
	SaludoService saludoService;
	
	@PostMapping("create")
	public SaludoResponse createSaludo(@Valid @RequestBody CreateSaludoRequest createSaludoRequest) {
		return new SaludoResponse(saludoService.createSaludo(createSaludoRequest));
	}
	

}
