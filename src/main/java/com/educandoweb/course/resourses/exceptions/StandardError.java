package com.educandoweb.course.resourses.exceptions;

import java.io.Serializable;
import java.time.Instant;

import com.fasterxml.jackson.annotation.JsonFormat;

public class StandardError implements Serializable{	

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
	private static final long serialVersionUID = 1L;
	private Instant timestamp;
	private Integer status;
	private String message;
	private String path;
	
	public StandardError() {
		
	}
	
	public StandardError(Instant timestamp, Integer status, String error, String message, String path) {
	    this.timestamp = timestamp;
	    this.status = status;
	    this.message = message;
	    this.path = path;
	}


	public Instant getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Instant timestamp) {
		this.timestamp = timestamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	

	
}