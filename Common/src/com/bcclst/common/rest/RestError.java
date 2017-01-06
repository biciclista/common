package com.bcclst.common.rest;

/**
 * Represents an error in a REST controller. It's used to return meaningful
 * information to REST client.
 * 
 * @author nacho
 *
 */
public class RestError {

	private final int code;
	private final String message;
	private final String developerMessage;
	private final Throwable throwable;

	/**
	 * Creates a new error.
	 * 
	 * @param status
	 *            HttpStatus for the request.
	 * @param code
	 *            Concrete error code.
	 * @param message
	 *            User friendly message about the error.
	 * @param developerMessage
	 *            More detailed message about the error.
	 * @param throwable
	 *            Throwable that causes this error.
	 */
	public RestError(int code, String message, String developerMessage, Throwable throwable) {
		this.code = code;
		this.message = message;
		this.developerMessage = developerMessage;
		this.throwable = throwable;
	}

	public int getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

	public String getDeveloperMessage() {
		return developerMessage;
	}

	public Throwable getThrowable() {
		return throwable;
	}

}
