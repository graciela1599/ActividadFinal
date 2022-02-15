package com.api.saludo.exception;



import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;






@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(SaludoExistenteException.class)
	public ResponseEntity<ErrorDetails> handleResourceNotFoundException(SaludoExistenteException exception,
																		WebRequest webrequest) {
		ErrorDetails errorDetails = new ErrorDetails(900, exception.getMessage(), exception.getSaludo() ,
				webrequest.getDescription(false));

	
		return new ResponseEntity<>(errorDetails, HttpStatus.BAD_REQUEST);
	}
}
