package com.deloitte.library.exceptions;

public class BookNameException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public String detailMessage;
	public BookNameException(String message) {
		detailMessage=message;
	}
	public String getMessage() {
		return detailMessage;
	}
}
