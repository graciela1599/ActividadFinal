package com.api.empresa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.empresa.entity.Empresa;
import com.api.empresa.repository.EmpresaRepository;
import com.api.empresa.request.EmpresaRequest;

@Service
public class EmpresaService {
	
	@Autowired
	EmpresaRepository empresaRepository;

	public Empresa getEmpresaByNombreAndDireccion(String nombre, String direccion) {
		return empresaRepository.findByNombreAndDireccion(nombre, direccion);
	}
	
	public Empresa createEmpresa(EmpresaRequest empresaRequest) {
		Empresa empresa = new Empresa();
		empresa.setNombre(empresaRequest.getNombre());
		empresa.setDireccion(empresaRequest.getDireccion());
		
		return empresaRepository.save(empresa);
	}
}
