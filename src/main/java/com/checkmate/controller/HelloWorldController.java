package com.checkmate.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class HelloWorldController {
	@CrossOrigin("*")
	
	@RequestMapping({ "/hello" })
	public ResponseEntity<?> firstPage() {
		
		return ResponseEntity.ok("{ \"Hello\" : \"csk \" }");
		
	}

}