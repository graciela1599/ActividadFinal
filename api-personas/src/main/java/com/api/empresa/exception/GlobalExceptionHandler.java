package com.api.empresa.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalExceptionHandler {

	public ResponseEntity<ErrorDetails> handleResourceNotFoundException(NombreExistenteException exception,
			WebRequest webrequest) {
		ErrorDetails errorDetails = new ErrorDetails(exception.getCod(), exception.getMessage());

		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	}

}
