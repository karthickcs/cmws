package com.checkmate.dto;

import java.time.OffsetDateTime;

public class DpListenDTO {

	private String taskname;

	private Integer taskid;
	
	private Integer dpid;

	private String filelocation;

	private String status;

	private java.util.Date insertts;

	private java.util.Date updatets;

	private Integer rowcount;

	private Integer runid;
	
	private String filelocationt2;

	public String getFilelocationt2() {
		return filelocationt2;
	}

	public void setFilelocationt2(String filelocationt2) {
		this.filelocationt2 = filelocationt2;
	}

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

	public Integer getRunid() {
		return runid;
	}

	public void setRunid(Integer runid) {
		this.runid = runid;
	}

	public Integer getDpid() {
		return dpid;
	}

	public void setDpid(Integer dpid) {
		this.dpid = dpid;
	}

}