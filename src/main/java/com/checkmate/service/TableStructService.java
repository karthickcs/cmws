package com.checkmate.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.checkmate.dao.TableStructRepository;
 
import com.checkmate.dto.TableStructDTO;
import com.checkmate.entity.TableStructEntity;
import com.checkmate.mapper.TableStructMapper;

@Service
public class TableStructService {

	@Autowired
	private TableStructRepository tableStructRepository;

	 
	public List<TableStructDTO> getDiffTableByTname(String taskid, String runid , String tname) {
		List<TableStructDTO> TableStructDTOList = new ArrayList<TableStructDTO>();
		tableStructRepository.findAllDiffbyTname(taskid,runid,tname)
				.forEach(TableStructTable -> TableStructDTOList.add(TableStructMapper.entityToDto(TableStructTable)));
		return TableStructDTOList;
	}



	public List<TableStructDTO> getDiffTableById(String taskid, String runid) {
		List<TableStructDTO> TableStructDTOList = new ArrayList<TableStructDTO>();
		tableStructRepository.findAllDiff(taskid,runid)
				.forEach(TableStructTable -> TableStructDTOList.add(TableStructMapper.entityToDto(TableStructTable)));
		return TableStructDTOList;
	}
	
	public long countLines(String taskid, String runid) {
		 
		
		return tableStructRepository.countLines(taskid,runid) ;
	}

}