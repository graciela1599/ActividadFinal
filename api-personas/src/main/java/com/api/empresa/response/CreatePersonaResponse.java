package com.api.empresa.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreatePersonaResponse {
	
	private String saludo; 
	
	private PersonaResponse persona;

}
