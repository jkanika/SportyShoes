package com.simplilearn.assessment.SportShoes.exception;

public class AdminIdNotFound extends RuntimeException{

private static final long serialVersionUID = 1L;
	
	public AdminIdNotFound(String message){
		super(message);
	}
}
