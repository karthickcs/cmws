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

import com.checkmate.dto.TaskMainDTO;
import com.checkmate.service.TaskMainService;
import com.checkmate.service.TaskMainService;

@RestController
@CrossOrigin("*")
public class TaskController {

	@Autowired
	TaskMainService taskMainService;

	@GetMapping("/taskmain")
	private List<TaskMainDTO> getTasknain() {
		return taskMainService.getAllTaskMain();
	}

	@GetMapping("/taskmain/{taskmainid}")
	private TaskMainDTO gettaskmains(@PathVariable("taskmainid") int taskmainid) {
		return taskMainService.getTaskMainById(taskmainid);
	}

	// creating a delete mapping that deletes a specified taskmain
	@DeleteMapping("/taskmain/{taskmainid}")
	private void deletetaskmain(@PathVariable("taskmainid") int taskmainid) {
		taskMainService.delete(taskmainid);
	}

	// creating post mapping that post the taskmain detail in the database
	@PostMapping("/taskmains")
	private int savetaskmain(@RequestBody TaskMainDTO taskMainDTO) {
		int taskid=taskMainService.saveOrUpdate(taskMainDTO);
		return taskid;
	}

	// creating put mapping that updates the taskmain detail
	@PutMapping("/taskmains")
	private TaskMainDTO update(@RequestBody TaskMainDTO taskMainDTO) {
		taskMainService.saveOrUpdate(taskMainDTO);
		return taskMainDTO;
	}

}