package com.co.core.test.modelo;

public class ResponseObject {
	private String status;
	private String message;
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public ResponseObject(String status, String message) {
		super();
		this.status = status;
		this.message = message;
	}
	public ResponseObject() {
		super();
	}
	
}
