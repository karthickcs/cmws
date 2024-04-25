package com.checkmate.entity;

import javax.persistence.*;
import java.time.OffsetDateTime;

@Entity
@Table(name="diff_table")
public class DiffEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer diffid;

	@Column(length = 1000)
	private String taskid;

	@Column
	private OffsetDateTime insertts;

	@Column(length = 1000)
	private String maintranid;

	@Column(length = 1000)
	private String newtranid;

	@Column
	private Integer sequence;

	@Column(length = 4000)
	private String difference;

	@Column
	private Integer countval;

	@Column(length = 100)
	private String threadid;
	
	@Column
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

	public void setTaskid(final String taskid) {
		this.taskid = taskid;
	}

	public OffsetDateTime getInsertts() {
		return insertts;
	}

	public void setInsertts(final OffsetDateTime insertts) {
		this.insertts = insertts;
	}

	public String getMaintranid() {
		return maintranid;
	}

	public void setMaintranid(final String maintranid) {
		this.maintranid = maintranid;
	}

	public String getNewtranid() {
		return newtranid;
	}

	public void setNewtranid(final String newtranid) {
		this.newtranid = newtranid;
	}

	public Integer getSequence() {
		return sequence;
	}

	public void setSequence(final Integer sequence) {
		this.sequence = sequence;
	}

	public String getDifference() {
		return difference;
	}

	public void setDifference(final String difference) {
		this.difference = difference;
	}

	public Integer getCountval() {
		return countval;
	}

	public void setCountval(final Integer countval) {
		this.countval = countval;
	}

	public String getThreadid() {
		return threadid;
	}

	public void setThreadid(final String threadid) {
		this.threadid = threadid;
	}

}
