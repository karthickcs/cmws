package com.checkmate.entity;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;

import java.time.OffsetDateTime;

@Entity
@Table(name="DP_LISTEN_TABLE")
public class DpListenEntity {

	@Column
	private String taskname;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer dpid;

	@Column
	private Integer taskid;
	
	@Column(length = 1000)
	private String filelocation;

	@Column(length = 1000)
	private String status;

	@CreationTimestamp
	private java.util.Date insertts;

	@CreationTimestamp
	private java.util.Date updatets;

	@Column
	private Integer rowcount;

	@Column
	private Integer runid;
	
	
	@Column(length = 1000)
	private String filelocationt2;
	
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

	public Integer getRunid() {
		return runid;
	}

	public void setRunid(final Integer runid) {
		this.runid = runid;
	}

	public String getFilelocationt2() {
		return filelocationt2;
	}

	public void setFilelocationt2(String filelocationt2) {
		this.filelocationt2 = filelocationt2;
	}

	public Integer getDpid() {
		return dpid;
	}

	public void setDpid(Integer dpid) {
		this.dpid = dpid;
	}

}
