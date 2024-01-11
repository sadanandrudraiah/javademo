package com.cruds.exception;

public class SMSException extends RuntimeException {

	private String info;

	public SMSException(String info) {
		super();
		this.info = info;
	}

	public String getInfo() {
		return info;
	}
	
}
