package com.api.empresa.exception;

import lombok.Getter;

@Getter
public class NombreExistenteException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final int cod = 800;
		
	public NombreExistenteException() {
		super("Nombre existente, debe guardar otro nombre.");
	}
}
