package com.checkmate.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.checkmate.dao.DiffTableRepository;
import com.checkmate.dto.DiffTableDTO;
import com.checkmate.entity.DiffEntity;
import com.checkmate.mapper.DiffTableMapper;

@Service
public class DiffTableService {

	@Autowired
	private DiffTableRepository diffTableRepository;

	public DiffEntity save(DiffTableDTO diffTableDto) {
		DiffEntity newDiffTable = new DiffEntity();
		newDiffTable.setTaskid(diffTableDto.getTaskid());
		newDiffTable.setInsertts(diffTableDto.getInsertts());
		newDiffTable.setMaintranid(diffTableDto.getMaintranid());
		newDiffTable.setNewtranid(diffTableDto.getNewtranid());
		newDiffTable.setSequence(diffTableDto.getSequence());
		newDiffTable.setDifference(diffTableDto.getDifference());
		newDiffTable.setCountval(diffTableDto.getCountval());
		newDiffTable.setThreadid(diffTableDto.getThreadid());
		return diffTableRepository.save(newDiffTable);
	}

	public List<DiffTableDTO> getAllDiffTable() {

		List<DiffTableDTO> DiffTableDTOList = new ArrayList<DiffTableDTO>();
		diffTableRepository.findAll()
				.forEach(DiffTableTable -> DiffTableDTOList.add(DiffTableMapper.entityToDto(DiffTableTable)));
		return DiffTableDTOList;
	}

	public DiffTableDTO getDiffTableById(int id) {
		DiffEntity diffTable = diffTableRepository.findById(id).get();
		return DiffTableMapper.entityToDto(diffTable);
	}

	public void saveOrUpdate(DiffTableDTO diffTableDTO) {

		DiffEntity diffTable = DiffTableMapper.dtoToEntity(diffTableDTO);
		diffTableRepository.save(diffTable);
	}

	public void delete(int id) {
		diffTableRepository.deleteById(id);
	}

	public void update(DiffTableDTO diffTableDTO, int diffTableid) {
		DiffEntity diffTable = DiffTableMapper.dtoToEntity(diffTableDTO);
		diffTableRepository.save(diffTable);
	}

	public List<DiffTableDTO> getDiffData(DiffTableDTO difftableDTO) {
		 
		List<DiffTableDTO> DiffTableDTOList = new ArrayList<DiffTableDTO>();
		diffTableRepository.findAllDiff(difftableDTO.getTaskid(),difftableDTO.getRunid())
				.forEach(DiffTableTable -> DiffTableDTOList.add(DiffTableMapper.entityToDto(DiffTableTable)));
		return DiffTableDTOList;
		
	}

}