package com.api.empresa.exception;

import lombok.Getter;

@Getter
public class EmpresaReferenciaNullException extends RuntimeException{

	private final int cod = 500;
	public EmpresaReferenciaNullException() {
		super("Debe ingresar a la empresa a la que pertenece");
	}
}
