package com.api.empresa.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonaRequest {

	private String nombre;
	
	private Integer edad;
	
	private String direccion;
	
	private EmpresaRequest empresa;
	
	
}
