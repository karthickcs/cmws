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

import com.checkmate.dto.DpListenDTO;
import com.checkmate.service.DpListenService;

@RestController
@CrossOrigin("*")
public class DpListenController {

	@Autowired
	DpListenService dpListenService;

	@GetMapping("/dptask")
	private List<DpListenDTO> getDptask() {
		return dpListenService.getAllDpListen();
	}

	@GetMapping("/dplisten/{dplistenid}")
	private DpListenDTO getdplistens(@PathVariable("dplistenid") int dplistenid) {
		return dpListenService.getDpListenById(dplistenid);
	}

	@GetMapping("/dplisten/runids/{taskid}")
	private List<DpListenDTO> getRunIds(@PathVariable("taskid") int taskid) {
		return dpListenService.getDpListenByTaskRunId(taskid);
	}
	// creating a delete mapping that deletes a specified dplisten
	@DeleteMapping("/dplisten/{dplistenid}")
	private void deletedplisten(@PathVariable("dplistenid") int dplistenid) {
		dpListenService.delete(dplistenid);
	}

	// creating post mapping that post the dplisten detail in the database
	@PostMapping("/dplistens")
	private int savedplisten(@RequestBody DpListenDTO dpListenDTO) {
		int id=dpListenService.saveOrUpdate(dpListenDTO);
		return id;
	}

	// creating put mapping that updates the dplisten detail
	@PutMapping("/dplistens")
	private DpListenDTO update(@RequestBody DpListenDTO dpListenDTO) {
		dpListenService.saveOrUpdate(dpListenDTO);
		return dpListenDTO;
	}

}