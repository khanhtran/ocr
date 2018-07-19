package com.earthteam.ocr.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler {

	public static final String DEFAULT_ERROR_VIEW = "error";

	@ExceptionHandler(Exception.class)
	public String generalException(Exception e) {
		e.printStackTrace();
		return "error";
	}
}
