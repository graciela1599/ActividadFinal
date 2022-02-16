package com.api.empresa.exception;

import lombok.Getter;

@Getter
public class PersonaDesconocidaException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	private final int cod = 1500;

	public PersonaDesconocidaException() {
		super("Persona desconocida");
	}
}
