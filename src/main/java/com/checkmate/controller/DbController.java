package com.checkmate.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.checkmate.dto.Dbtest;
import com.checkmate.service.DbtestService;

@RestController
@CrossOrigin("*")
public class DbController {

	@Autowired
	DbtestService dbtestService;

	 
 
	// creating post mapping that post the taskmain detail in the database
	@PostMapping("/dbtest")
	private String dbtest(@RequestBody Dbtest dbtest) {
		return "{ \"status\" : \""+ dbtestService.dbTestMethod(dbtest) +  "\"}";
		
	}
	
	@PostMapping("/createtrigger")
	private String createtrigger(@RequestBody Dbtest dbtest) {
		return "{ \"status\" : \""+ dbtestService.createTrigger(dbtest) +  "\"}";
		
	}
	
	
	@PostMapping("/droptrigger")
	private String droptrigger(@RequestBody Dbtest dbtest) {
		return "{ \"status\" : \""+ dbtestService.dropTrigger(dbtest) +  "\"}";
		
	}
 

}