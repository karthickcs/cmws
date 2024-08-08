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
		taskmain.setJdbcurlsys1(  taskMainDTO.getJdbcurlsys1());
		taskmain.setUsernamesys1( taskMainDTO.getUsernamesys1());
		taskmain.setPasswordsys1( taskMainDTO.getPasswordsys1());
		taskmain.setDbtypesys1(   taskMainDTO.getDbtypesys1());
		taskmain.setTablenamesys1(taskMainDTO.getTablenamesys1());
		taskmain.setStarttssys1(  taskMainDTO.getStarttssys1());
		taskmain.setEndtssys1(    taskMainDTO.getEndtssys1());
		taskmain.setJdbcurlsys2(  taskMainDTO.getJdbcurlsys2());
		taskmain.setUsernamesys2( taskMainDTO.getUsernamesys2());
		taskmain.setPasswordsys2( taskMainDTO.getPasswordsys2());
		taskmain.setDbtypesys2(   taskMainDTO.getDbtypesys2());
		taskmain.setTablenamesys2(taskMainDTO.getTablenamesys2());
		taskmain.setStarttssys2(  taskMainDTO.getStarttssys2());
		taskmain.setEndtssys2(    taskMainDTO.getEndtssys2());
		taskmain.setSys1type(     taskMainDTO.getSys1type());
		taskmain.setSys2type(     taskMainDTO.getSys2type());
		taskmain.setTablenameclobsys2(taskMainDTO.getTablenameClobsys2());
		taskmain.setStarttsclobsys2(  taskMainDTO.getStarttsClobsys2());
		taskmain.setEndtsclobsys2(    taskMainDTO.getEndtsClobsys2());
		taskmain.setTablenameonlinesys2(taskMainDTO.getTablenameOnlinesys2());
		taskmain.setStarttsonlinesys2(  taskMainDTO.getStarttsOnlinesys2());
		taskmain.setEndtsonlinesys2(    taskMainDTO.getEndtsOnlinesys2());
		
		taskmain.setTablenameclobsys1(taskMainDTO.getTablenameClobsys1());
		taskmain.setStarttsclobsys1(  taskMainDTO.getStarttsClobsys1());
		taskmain.setEndtsclobsys1(    taskMainDTO.getEndtsClobsys1());
		taskmain.setTablenameonlinesys1(taskMainDTO.getTablenameOnlinesys1());
		taskmain.setStarttsonlinesys1(  taskMainDTO.getStarttsOnlinesys1());
		taskmain.setEndtsonlinesys1(    taskMainDTO.getEndtsOnlinesys1());
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
		
		TaskMainDTO.setJdbcurlsys1(  taskmainEntity.getJdbcurlsys1());
		TaskMainDTO.setUsernamesys1( taskmainEntity.getUsernamesys1());
		TaskMainDTO.setPasswordsys1( taskmainEntity.getPasswordsys1());
		TaskMainDTO.setDbtypesys1(   taskmainEntity.getDbtypesys1());
		TaskMainDTO.setTablenamesys1(taskmainEntity.getTablenamesys1());
		TaskMainDTO.setStarttssys1(  taskmainEntity.getStarttssys1());
		TaskMainDTO.setEndtssys1(    taskmainEntity.getEndtssys1());
		TaskMainDTO.setJdbcurlsys2(  taskmainEntity.getJdbcurlsys2());
		TaskMainDTO.setUsernamesys2( taskmainEntity.getUsernamesys2());
		TaskMainDTO.setPasswordsys2( taskmainEntity.getPasswordsys2());
		TaskMainDTO.setDbtypesys2(   taskmainEntity.getDbtypesys2());
		TaskMainDTO.setTablenamesys2(taskmainEntity.getTablenamesys2());
		TaskMainDTO.setStarttssys2(  taskmainEntity.getStarttssys2());
		TaskMainDTO.setEndtssys2(    taskmainEntity.getEndtssys2());
		TaskMainDTO.setSys1type(     taskmainEntity.getSys1type());
		TaskMainDTO.setSys2type(     taskmainEntity.getSys2type());

		TaskMainDTO.setTablenameClobsys2(taskmainEntity.getTablenameclobsys2());
		TaskMainDTO.setStarttsClobsys2(  taskmainEntity.getStarttsclobsys2());
		TaskMainDTO.setEndtsClobsys2(    taskmainEntity.getEndtsclobsys2());
		TaskMainDTO.setTablenameOnlinesys2(taskmainEntity.getTablenameonlinesys2());
		TaskMainDTO.setStarttsOnlinesys2(  taskmainEntity.getStarttsonlinesys2());
		TaskMainDTO.setEndtsOnlinesys2(    taskmainEntity.getEndtsonlinesys2());
		
		TaskMainDTO.setTablenameClobsys1(taskmainEntity.getTablenameclobsys1());
		TaskMainDTO.setStarttsClobsys1(  taskmainEntity.getStarttsclobsys1());
		TaskMainDTO.setEndtsClobsys1(    taskmainEntity.getEndtsclobsys1());
		TaskMainDTO.setTablenameOnlinesys1(taskmainEntity.getTablenameonlinesys1());
		TaskMainDTO.setStarttsOnlinesys1(  taskmainEntity.getStarttsonlinesys1());
		TaskMainDTO.setEndtsOnlinesys1(    taskmainEntity.getEndtsonlinesys1());
		return TaskMainDTO;
	}
}
