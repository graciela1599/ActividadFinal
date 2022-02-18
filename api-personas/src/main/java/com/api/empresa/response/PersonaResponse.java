package com.api.empresa.response;

import com.api.empresa.entity.Persona;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class PersonaResponse {
	
	private Long id;
	
	private String nombre;
	
	private String direccion;
	
	private Integer edad;

	private EmpresaResponse empresa;
	
	public PersonaResponse(Persona persona){
		
		this.id = persona.getId();
		this.nombre = persona.getNombre();
		this.direccion = persona.getDireccion();
		this.edad = persona.getEdad();
		this.empresa = new EmpresaResponse(persona.getEmpresa());
		
	}
}
