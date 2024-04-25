package com.checkmate.mapper;

import com.checkmate.dto.TaskMainDTO;
import com.checkmate.entity.TaskmainEntity;

public class TaskMainMapper {

	public static TaskmainEntity dtoToEntity(TaskMainDTO taskMainDTO) {
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
		taskmain.setFilelocation2(taskMainDTO.getFilelocation2());

		return taskmain;
	}

	public static TaskMainDTO entityToDto(TaskmainEntity taskmainEntity) {
		TaskMainDTO TaskMainDTO = new TaskMainDTO();
		TaskMainDTO.setTaskname(taskmainEntity.getTaskname());
		TaskMainDTO.setTaskid(taskmainEntity.getTaskid());
		TaskMainDTO.setFilelocation(taskmainEntity.getFilelocation());
		TaskMainDTO.setStatus(taskmainEntity.getStatus());
		TaskMainDTO.setCreatedby(taskmainEntity.getCreatedby());
		TaskMainDTO.setShared(taskmainEntity.getShared());
		TaskMainDTO.setInsertts(taskmainEntity.getInsertts());
		TaskMainDTO.setUpdatets(taskmainEntity.getUpdatets());
		TaskMainDTO.setRowcount(taskmainEntity.getRowcount());
		TaskMainDTO.setFilelocation2(taskmainEntity.getFilelocation2());
		return TaskMainDTO;
	}
}
