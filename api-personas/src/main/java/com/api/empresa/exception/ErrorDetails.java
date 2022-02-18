package com.api.empresa.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class ErrorDetails {
	
	private Integer codigo;
	private String tipo;

	
	

}
