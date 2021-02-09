package com.example.bookstore.exception;

import java.util.Date;

public class ExceptionDetails {

	private Date timestamp;
	private String message;
	private String uri;

	public ExceptionDetails(Date timestamp, String message, String uri) {
		super();
		this.timestamp = timestamp;
		this.message = message;
		this.uri = uri;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getUri() {
		return uri;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

}
