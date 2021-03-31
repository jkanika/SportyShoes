package com.simplilearn.assessment.SportShoes.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class AdminExceptionController {

	@ExceptionHandler(value=AdminIdNotFound.class)
	public ResponseEntity<Object> exception(AdminIdNotFound exception){
		return new ResponseEntity<Object>("Id Not Found !",HttpStatus.NOT_FOUND);
	}

}
