package com.emrey.issuemanagement.advice;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import jdk.internal.org.jline.utils.Log;
import lombok.extern.slf4j.Slf4j;
@ControllerAdvice
@RestController
@Slf4j
public class IMExceptionHandler extends ResponseEntityExceptionHandler{
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<?> handleExceptions(Exception ex, WebRequest request) {
		Log.error("ControllerAdvice -> ExceptionHandler -> ", ex, request);
		ExceptionResponse exceptionResponse = new ExceptionResponse(new Date(), ex.getMessage());
		return new ResponseEntity<> (exceptionResponse, HttpStatus.EXPECTATION_FAILED);
	}
	
}
