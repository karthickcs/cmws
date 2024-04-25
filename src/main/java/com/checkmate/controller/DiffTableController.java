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

import com.checkmate.dto.DiffTableDTO;
import com.checkmate.service.DiffTableService;

@RestController
@CrossOrigin("*")
public class DiffTableController {

	@Autowired
	DiffTableService diffTableService;

	@GetMapping("/difftable")
	private List<DiffTableDTO> getDiffTable() {
		return diffTableService.getAllDiffTable();
	}

	@GetMapping("/difftable/{difftableid}")
	private DiffTableDTO getdiffTables(@PathVariable("difftableid") int diffTableid) {
		return diffTableService.getDiffTableById(diffTableid);
	}

	// creating a delete mapping that deletes a specified diffTable
	@DeleteMapping("/difftable/{difftableid}")
	private void deletediffTable(@PathVariable("difftableid") int diffTableid) {
		diffTableService.delete(diffTableid);
	}

	// creating post mapping that post the diffTable detail in the database
	@PostMapping("/difftable")
	private String savediffTable(@RequestBody DiffTableDTO difftableDTO) {
		diffTableService.saveOrUpdate(difftableDTO);
		return difftableDTO.getTaskid();
	}

	// creating post mapping that post the diffTable detail in the database
		@PostMapping("/difftabledata")
		private List<DiffTableDTO> getDiffData(@RequestBody DiffTableDTO difftableDTO) {
			return diffTableService.getDiffData(difftableDTO);
			 
		}

	// creating put mapping that updates the diffTable detail
	@PutMapping("/difftable")
	private DiffTableDTO update(@RequestBody DiffTableDTO difftableDTO) {
		diffTableService.saveOrUpdate(difftableDTO);
		return difftableDTO;
	}

}