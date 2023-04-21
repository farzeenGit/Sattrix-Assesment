package com.sattrix.assesment.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;



public class ResourceNotFoundExceptionController {

	
	@ExceptionHandler(value=ResourceNotFoundException.class)
	public ResponseEntity<Object> exception(ResourceNotFoundException e){
		
		return new ResponseEntity<Object>("Record Not Found",HttpStatus.NOT_FOUND);
		
	}
}
