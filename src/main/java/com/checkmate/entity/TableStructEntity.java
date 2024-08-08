package com.checkmate.entity;

import javax.persistence.*;

 
@Entity
@Table(name = "Diff_Table_struct")
public class TableStructEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer difftabid;

	@Column(length = 100)
	private String taskid;

	@Column(length = 100)
	private String runid;

	@Column(length = 100)
	private String tname;

	@Column(length = 15000)
	private String tstructoldsys;

	@Column(length = 15000)
	private String tstructnewsys;

	@Column(length = 15000)
	private String difference;

	public Integer getDifftabid() {
		return difftabid;
	}

	public void setDifftabid(Integer difftabid) {
		this.difftabid = difftabid;
	}

	public String getTaskid() {
		return taskid;
	}

	public void setTaskid(String taskid) {
		this.taskid = taskid;
	}

	public String getRunid() {
		return runid;
	}

	public void setRunid(String runid) {
		this.runid = runid;
	}

	public String getTname() {
		return tname;
	}

	public void setTname(String tname) {
		this.tname = tname;
	}

	public String getTstructoldsys() {
		return tstructoldsys;
	}

	public void setTstructoldsys(String tstructoldsys) {
		this.tstructoldsys = tstructoldsys;
	}

	public String getTstructnewsys() {
		return tstructnewsys;
	}

	public void setTstructnewsys(String tstructnewsys) {
		this.tstructnewsys = tstructnewsys;
	}

	public String getDifference() {
		return difference;
	}

	public void setDifference(String difference) {
		this.difference = difference;
	}

}
