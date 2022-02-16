package com.api.empresa.request;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PersonaRequest {

	@JsonProperty("nombre")
	@NotNull
	private String nombre;
	
	@JsonProperty("edad")
	@NotNull
	private Integer edad;
	
	@JsonProperty("direccion")
	@NotNull
	private String direccion;

	@JsonProperty("empresa")
	private EmpresaRequest empresa;
	
	
}
