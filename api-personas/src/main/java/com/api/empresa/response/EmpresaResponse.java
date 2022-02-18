package com.api.empresa.response;

import com.api.empresa.entity.Empresa;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class EmpresaResponse {
	
	private String nombre;
	
	private String direccion;
	

	
	public EmpresaResponse(Empresa empresa) {
		this.nombre = empresa.getNombre();
		
		this.direccion = empresa.getDireccion();
	}

}
