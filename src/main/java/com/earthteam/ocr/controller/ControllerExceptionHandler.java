package com.earthteam.ocr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.MessageSourceAccessor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.earthteam.ocr.domain.dto.DomainError;
import com.earthteam.ocr.domain.dto.DomainErrors;

/**
 * Handler error for application
 * @author Cong Khanh Tran - trancongkhanh@gmail.com
 *
 *
 */
@ControllerAdvice
public class ControllerExceptionHandler {

	public static final String DEFAULT_ERROR_VIEW = "error/error";

	@Autowired
	MessageSourceAccessor messageAccessor;
	
	@ExceptionHandler(Exception.class)
	public String generalException(Exception ex) {
		ex.printStackTrace();
		return DEFAULT_ERROR_VIEW;
	}
	
	@ExceptionHandler(MethodArgumentNotValidException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	@ResponseBody
	public DomainErrors handleException(MethodArgumentNotValidException exception) {
		List<FieldError> fieldErrors = exception.getBindingResult().getFieldErrors();
		DomainErrors errors = new DomainErrors();
		errors.setErrorType("ValidationError");
		for (FieldError fieldError : fieldErrors) {
			DomainError error = new DomainError(messageAccessor.getMessage(fieldError));
			errors.addError(error);
		}

		return errors;
	}
}
