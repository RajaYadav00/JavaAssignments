package com.masai.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(DataNotFound.class)
	public  ResponseEntity<ErrorDetails> myExceptionHandler(DataNotFound dnf,WebRequest wb) {
		System.out.println("inside  DataNot found method...");
		ErrorDetails ed=new ErrorDetails(LocalDateTime.now(),dnf.getMessage(),wb.getDescription(false));
		ResponseEntity<ErrorDetails> errdt= new ResponseEntity(ed,HttpStatus.BAD_REQUEST) ;
		return errdt;

	}
	
	@ExceptionHandler(BookNotFound.class)
	public  ResponseEntity<ErrorDetails> myExceptionHandlerbooknotFound(BookNotFound dnf,WebRequest wb) {
		System.out.println("inside BookNotfound method...");
		
		
		ErrorDetails ed=new ErrorDetails(LocalDateTime.now(),dnf.getMessage(),wb.getDescription(false));
		ResponseEntity<ErrorDetails> errdt= new ResponseEntity(ed,HttpStatus.NOT_FOUND) ;
		return errdt;

	}
	
	@ExceptionHandler(NoHandlerFoundException.class)
	public  ResponseEntity<ErrorDetails> noHandler(NoHandlerFoundException dnf,WebRequest wb) {
		System.out.println("inside No handler method...");
		ErrorDetails ed=new ErrorDetails(LocalDateTime.now(),dnf.getMessage(),wb.getDescription(false));
		ResponseEntity<ErrorDetails> errdt= new ResponseEntity(ed,HttpStatus.NOT_ACCEPTABLE) ;
		return errdt;

	}
	
	@ExceptionHandler(Exception.class)
	public  ResponseEntity<ErrorDetails> superHandler(Exception dnf,WebRequest wb) {
		System.out.println("inside  sabse uper");
		ErrorDetails ed=new ErrorDetails(LocalDateTime.now(),dnf.getMessage(),wb.getDescription(false));
		ResponseEntity<ErrorDetails> errdt= new ResponseEntity(ed,HttpStatus.NOT_ACCEPTABLE) ;
		return errdt;

	}
}
