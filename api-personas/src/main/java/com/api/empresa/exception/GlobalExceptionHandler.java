package com.api.empresa.exception;



import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.api.empresa.controllers.PersonaController;

@ControllerAdvice
public class GlobalExceptionHandler {

	
	Logger logger = LoggerFactory.getLogger(PersonaController.class);

	@ExceptionHandler(NombreExistenteException.class)
	public ResponseEntity<ErrorDetails> handleResourceNombreExistenteException(NombreExistenteException exception,
			WebRequest webrequest) {
		ErrorDetails errorDetails = new ErrorDetails(exception.getCod(), exception.getMessage());

		generateError(errorDetails.toString());
		return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
	@ExceptionHandler(NoHayPersonasException.class)
	public ResponseEntity<ErrorDetails> handleResourceNoHayPersonasException(NoHayPersonasException exception,
			WebRequest webrequest) {
		ErrorDetails errorDetails = new ErrorDetails(exception.getCod(), exception.getMessage());

		generateError(errorDetails.toString());
		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(PersonaDesconocidaException.class)
	public ResponseEntity<ErrorDetails> handleResourcePersonaDesconocidaException(PersonaDesconocidaException exception,
			WebRequest webrequest) {
		ErrorDetails errorDetails = new ErrorDetails(exception.getCod(), exception.getMessage());
		generateError(errorDetails.toString());
		return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(EmpresaReferenciaNullException.class)
	public ResponseEntity<ErrorDetails> handleResourceEmpresaReferenciaNullException(EmpresaReferenciaNullException exception,
			WebRequest webrequest) {
		ErrorDetails errorDetails = new ErrorDetails(exception.getCod(), exception.getMessage());

		generateError(errorDetails.toString());
		return new ResponseEntity<>(errorDetails, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	private void generateError(String error) {
		logger.error(error);
	}
}
