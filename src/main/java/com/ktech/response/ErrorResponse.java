package com.ktech.response;

import java.time.LocalDateTime;
import org.springframework.http.HttpStatus;

public class ErrorResponse {
	private LocalDateTime timestamp;
	private String message;
	private HttpStatus status;

	public ErrorResponse(HttpStatus internalServerError, String message2, LocalDateTime now) {
		this.status = internalServerError;
		this.message = message2;
		this.timestamp = now;
	}

	public LocalDateTime getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(LocalDateTime timestamp) {
		this.timestamp = timestamp;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public HttpStatus getStatus() {
		return status;
	}

	public void setStatus(HttpStatus status) {
		this.status = status;
	}
}
