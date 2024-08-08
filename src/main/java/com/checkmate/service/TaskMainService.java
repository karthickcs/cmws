package com.checkmate.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.checkmate.dao.TaskmainRepository;
import com.checkmate.dto.TaskMainDTO;
import com.checkmate.entity.TaskmainEntity;
import com.checkmate.mapper.TaskMainMapper;
 

@Service
public class TaskMainService {

	@Autowired
	private TaskmainRepository taskmainRepository;

	public TaskmainEntity save(TaskMainDTO taskMainDTO) {
		TaskmainEntity taskmain = new TaskmainEntity();
		taskmain.setTaskname(taskMainDTO.getTaskname());
		taskmain.setTaskid(taskMainDTO.getTaskid());
		taskmain.setFilelocation(taskMainDTO.getFilelocation());
		taskmain.setStatus(taskMainDTO.getStatus());
		taskmain.setCreatedby(taskMainDTO.getCreatedby());
		taskmain.setShared(taskMainDTO.getShared());
		taskmain.setInsertts(taskMainDTO.getInsertts());
		taskmain.setUpdatets(taskMainDTO.getUpdatets());
		taskmain.setRowcount(taskMainDTO.getRowcount());

		return taskmainRepository.save(taskmain);
	}

	public List<TaskMainDTO> getAllTaskMain() {

		List<TaskMainDTO> TaskMainDTOList = new ArrayList<TaskMainDTO>();
		taskmainRepository.findAll()
				.forEach(TaskMainTable -> TaskMainDTOList.add(TaskMainMapper.entityToDto(TaskMainTable)));
		return TaskMainDTOList;
	}

	public TaskMainDTO getTaskMainById(int id) {
		TaskmainEntity taskmainEntity = taskmainRepository.findById(id).get();
		return TaskMainMapper.entityToDto(taskmainEntity);
	}

	public int saveOrUpdate(TaskMainDTO dpListenDTO) {

		TaskmainEntity taskmainEntity = TaskMainMapper.dtoToEntity(dpListenDTO);
		taskmainRepository.save(taskmainEntity);
		
		return taskmainEntity.getTaskid();
	}

	public void delete(int id) {
		taskmainRepository.deleteById(id);
	}

	public void update(TaskMainDTO dpListenDTO, int dpListenid) {
		TaskmainEntity taskmainEntity = TaskMainMapper.dtoToEntity(dpListenDTO);
		taskmainRepository.save(taskmainEntity);
	}
}