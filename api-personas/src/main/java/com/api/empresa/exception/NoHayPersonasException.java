package com.api.empresa.exception;

import lombok.Getter;

@Getter
public class NoHayPersonasException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int cod = 1500;

	public NoHayPersonasException() {
		super("No hay personas en la Base de Datos");
	}

}
