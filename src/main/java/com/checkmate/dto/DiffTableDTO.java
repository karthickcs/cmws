package com.checkmate.dto;

import java.time.OffsetDateTime;

public class DiffTableDTO {

	private Integer diffid;

	private String taskid;

	private OffsetDateTime insertts;

	private String maintranid;

	private String newtranid;

	private Integer sequence;

	private String difference;

	private Integer countval;

	private String threadid;
	
	private Integer runid;
	

	public Integer getRunid() {
		return runid;
	}

	public void setRunid(Integer runid) {
		this.runid = runid;
	}

	public Integer getDiffid() {
		return diffid;
	}

	public void setDiffid(Integer diffid) {
		this.diffid = diffid;
	}

	public String getTaskid() {
		return taskid;
	}

	public void setTaskid(String taskid) {
		this.taskid = taskid;
	}

	public OffsetDateTime getInsertts() {
		return insertts;
	}

	public void setInsertts(OffsetDateTime insertts) {
		this.insertts = insertts;
	}

	public String getMaintranid() {
		return maintranid;
	}

	public void setMaintranid(String maintranid) {
		this.maintranid = maintranid;
	}

	public String getNewtranid() {
		return newtranid;
	}

	public void setNewtranid(String newtranid) {
		this.newtranid = newtranid;
	}

	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(Integer sequence) {
		this.sequence = sequence;
	}

	public String getDifference() {
		return difference;
	}

	public void setDifference(String difference) {
		this.difference = difference;
	}

	public Integer getCountval() {
		return countval;
	}

	public void setCountval(Integer countval) {
		this.countval = countval;
	}

	public String getThreadid() {
		return threadid;
	}

	public void setThreadid(String threadid) {
		this.threadid = threadid;
	}

}