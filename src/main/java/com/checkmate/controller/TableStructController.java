package com.checkmate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.checkmate.dto.TableStructDTO;
import com.checkmate.service.DiffTableService;
import com.checkmate.service.TableStructService;

@RestController
@CrossOrigin("*")
public class TableStructController {

	@Autowired
	TableStructService tableStructService;
 

	@GetMapping("/tablestruct/{taskid}/{runid}")
	private List<TableStructDTO> gettablestructs(@PathVariable("taskid") String taskid,@PathVariable("runid") String runid ) {
		
		 
			return tableStructService.getDiffTableById(taskid,runid);
		 
	} 
	
	

	@GetMapping("/tablestructtname/{taskid}/{runid}/{tname}")
	private List<TableStructDTO> gettablestructstname(@PathVariable("taskid") String taskid,@PathVariable("runid") String runid ,@PathVariable("tname") String tname) {
		
		 
			return tableStructService.getDiffTableByTname(taskid,runid,tname);
	} 
	
	

	@GetMapping("/tablestructcount/{taskid}/{runid}")
	private String countLines(@PathVariable("taskid") String taskid,@PathVariable("runid") String runid ) {
		
		 
			return "{ \"countlines\" : \"" + tableStructService.countLines(taskid,runid) + "\"}";
		 
	} 
	
 

}