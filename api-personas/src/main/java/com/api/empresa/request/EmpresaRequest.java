package com.api.empresa.request;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class EmpresaRequest {
	
	@NotNull
	@NotEmpty( message = "Se necesita ingresar el campo Nombre de la empresa")
	private String nombre;
	
	@NotNull
	@NotEmpty( message = "Se necesita ingresar el campo direccion de la empresa")
	private String direccion;
	
	
}
