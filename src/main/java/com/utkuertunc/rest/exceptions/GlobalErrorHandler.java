package com.utkuertunc.rest.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GlobalErrorHandler {

	@ExceptionHandler(StudentNotFoundException.class)
	@ResponseBody
	public ResponserError handleCustomException(StudentNotFoundException ex) {
		ResponserError responseError = new ResponserError();
		responseError.setErrorMessage(ex.getMessage());
		responseError.setStatusCode(HttpStatus.NOT_FOUND.value());
		return responseError;

	}
}