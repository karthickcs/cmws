package com.checkmate.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.checkmate.dao.DiffTableRepository;
import com.checkmate.dao.DpListenTableRepository;
import com.checkmate.dto.DiffTableDTO;
import com.checkmate.dto.DpListenDTO;
import com.checkmate.entity.DiffEntity;
import com.checkmate.entity.DpListenEntity;
import com.checkmate.mapper.DpListenMapper;

@Service
public class DpListenService {

	@Autowired
	private DpListenTableRepository dpListenTableRepository;

	public DpListenEntity save(DpListenDTO dpListenDTO) {
		DpListenEntity dpListenTable = new DpListenEntity();
		dpListenTable.setTaskname(dpListenDTO.getTaskname());
		dpListenTable.setTaskid(dpListenDTO.getTaskid());
		dpListenTable.setFilelocation(dpListenDTO.getFilelocation());
		dpListenTable.setStatus(dpListenDTO.getStatus());
		dpListenTable.setInsertts(dpListenDTO.getInsertts());
		dpListenTable.setUpdatets(dpListenDTO.getUpdatets());
		dpListenTable.setRowcount(dpListenDTO.getRowcount());
		dpListenTable.setRunid(dpListenDTO.getRunid());
		dpListenTableRepository.findRunid(0);
		return dpListenTableRepository.save(dpListenTable);
	}

	public List<DpListenDTO> getAllDpListen() {

		List<DpListenDTO> DpListenDTOList = new ArrayList<DpListenDTO>();
		dpListenTableRepository.findAll()
				.forEach(DpListenTable -> DpListenDTOList.add(DpListenMapper.entityToDto(DpListenTable)));
		return DpListenDTOList;
	}

	public DpListenDTO getDpListenById(int id) {
		DpListenEntity dpListenTable = dpListenTableRepository.findById(id).get();
		return DpListenMapper.entityToDto(dpListenTable);
	}

	public int saveOrUpdate(DpListenDTO dpListenDTO) {
		Integer run = dpListenTableRepository.findRunid(dpListenDTO.getTaskid());
		if (run==null)
			run=0;
		dpListenDTO.setRunid(run.intValue()+1);
		DpListenEntity dpListenTable = DpListenMapper.dtoToEntity(dpListenDTO);
		DpListenEntity dpListenEntity = dpListenTableRepository.save(dpListenTable);
		return dpListenEntity.getDpid();
	}

	public void delete(int id) {
		dpListenTableRepository.deleteById(id);
	}

	public void update(DpListenDTO dpListenDTO, int dpListenid) {
		DpListenEntity dpListenTable = DpListenMapper.dtoToEntity(dpListenDTO);
		dpListenTableRepository.save(dpListenTable);
	}

	public List<DpListenDTO> getDpListenByTaskRunId(int taskid) {
		List<DpListenDTO> DpListenDTOList = new ArrayList<DpListenDTO>();
		dpListenTableRepository.findAllRunid(taskid)
				.forEach(DpListenTable -> DpListenDTOList.add(DpListenMapper.entityToDto(DpListenTable)));
		return DpListenDTOList;
	}
}