package com.checkmate.entity;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

import java.time.OffsetDateTime;

@Entity
@Table(name="taskmain")
public class TaskmainEntity {

	@Column
	private String taskname;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer taskid;

	@Column(length = 1000)
	private String filelocation;

	@Column(length = 1000)
	private String status;

	@Column
	private Integer createdby;

	@Column(length = 1000)
	private String shared;

	@CreationTimestamp
	private java.util.Date insertts;

	@CreationTimestamp
	private java.util.Date updatets;

	@Column
	private Integer rowcount;
	
	
	@Column(length = 1000)
	private String filelocation2;
	
	
	public String getFilelocation2() {
		return filelocation2;
	}

	public void setFilelocation2(String filelocation2) {
		this.filelocation2 = filelocation2;
	}

	public String getTaskname() {
		return taskname;
	}

	public void setTaskname(final String taskname) {
		this.taskname = taskname;
	}

	public Integer getTaskid() {
		return taskid;
	}

	public void setTaskid(final Integer taskid) {
		this.taskid = taskid;
	}

	public String getFilelocation() {
		return filelocation;
	}

	public void setFilelocation(final String filelocation) {
		this.filelocation = filelocation;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(final String status) {
		this.status = status;
	}

	public Integer getCreatedby() {
		return createdby;
	}

	public void setCreatedby(final Integer createdby) {
		this.createdby = createdby;
	}

	public String getShared() {
		return shared;
	}

	public void setShared(final String shared) {
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

	public void setRowcount(final Integer rowcount) {
		this.rowcount = rowcount;
	}

}
