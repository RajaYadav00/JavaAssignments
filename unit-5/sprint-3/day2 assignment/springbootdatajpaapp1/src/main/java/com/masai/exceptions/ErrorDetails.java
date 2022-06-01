package com.masai.exceptions;

import java.time.LocalDateTime;

import org.apache.tomcat.jni.Local;

public class ErrorDetails {
	
	private LocalDateTime time;
	private String message;
	private String details;
	
	public ErrorDetails() {
		// TODO Auto-generated constructor stub
	}

	public ErrorDetails(LocalDateTime time, String message, String details) {
		super();
		this.time = time;
		this.message = message;
		this.details = details;
	}

	public LocalDateTime getTime() {
		return time;
	}

	public String getMessage() {
		return message;
	}

	public String getDetails() {
		return details;
	}

	public void setTime(LocalDateTime time) {
		this.time = time;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	

}
