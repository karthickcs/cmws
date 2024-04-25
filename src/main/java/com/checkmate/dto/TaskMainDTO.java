package com.checkmate.dto;

import java.time.OffsetDateTime;

import org.hibernate.annotations.CreationTimestamp;

public class TaskMainDTO {

	private String taskname;

	private Integer taskid;

	private String filelocation;

	private String status;

	private Integer createdby;

	private String shared;

	 
	private java.util.Date insertts;

	 
	private java.util.Date updatets;

	private Integer rowcount;
	
	private String filelocation2;

	public String getTaskname() {
		return taskname;
	}

	public void setTaskname(String taskname) {
		this.taskname = taskname;
	}

	public Integer getTaskid() {
		return taskid;
	}

	public void setTaskid(Integer taskid) {
		this.taskid = taskid;
	}

	public String getFilelocation() {
		return filelocation;
	}

	public void setFilelocation(String filelocation) {
		this.filelocation = filelocation;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
	}

	public String getShared() {
		return shared;
	}

	public void setShared(String shared) {
		this.shared = shared;
	}

 

	public java.util.Date getInsertts() {
		return insertts;
	}

	public void setInsertts(java.util.Date insertts) {
		this.insertts = insertts;
	}

	public java.util.Date getUpdatets() {
		return updatets;
	}

	public void setUpdatets(java.util.Date updatets) {
		this.updatets = updatets;
	}

	public Integer getRowcount() {
		return rowcount;
	}

	public void setRowcount(Integer rowcount) {
		this.rowcount = rowcount;
	}

	public String getFilelocation2() {
		return filelocation2;
	}

	public void setFilelocation2(String filelocation2) {
		this.filelocation2 = filelocation2;
	}

}