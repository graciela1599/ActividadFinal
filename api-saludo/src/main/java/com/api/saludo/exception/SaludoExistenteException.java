package com.api.saludo.exception;

import com.api.saludo.entity.Saludo;

public class SaludoExistenteException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public SaludoExistenteException(Saludo saludo) {
		super(String.format("El saludo '%s' del tipo '%s', ya existe."  ,saludo.getSaludo(), saludo.getTipo() ));
	}

}
