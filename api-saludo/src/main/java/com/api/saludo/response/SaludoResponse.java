package com.api.saludo.response;

import com.api.saludo.entity.Saludo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SaludoResponse {
	
	private Long id;
	
	private String saludo;
	
	private String tipo;
	
	public SaludoResponse(Saludo saludo) {
		this.id = saludo.getId();
		this.saludo = saludo.getSaludo();
		this.tipo = saludo.getTipo();
	}

}
