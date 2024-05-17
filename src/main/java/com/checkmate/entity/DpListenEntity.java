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
	
	
	
	@Column
    private String jdbcurlsys1;
	@Column
	private String usernamesys1;
	@Column
	private String passwordsys1;
	@Column
	private String dbtypesys1;
	@Column
	private String tablenamesys1;
	@Column
	private String starttssys1;
	@Column
	private String endtssys1;

	@Column
	private String jdbcurlsys2;
	@Column
	private String usernamesys2;
	@Column
	private String passwordsys2;
	@Column
	private String dbtypesys2;
	@Column
	private String tablenamesys2;
	@Column
	private String starttssys2;
	@Column
	private String endtssys2;
	@Column
	private String sys1type;
	@Column
	private String sys2type;

	
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

	public String getJdbcurlsys1() {
		return jdbcurlsys1;
	}

	public void setJdbcurlsys1(String jdbcurlsys1) {
		this.jdbcurlsys1 = jdbcurlsys1;
	}

	public String getUsernamesys1() {
		return usernamesys1;
	}

	public void setUsernamesys1(String usernamesys1) {
		this.usernamesys1 = usernamesys1;
	}

	public String getPasswordsys1() {
		return passwordsys1;
	}

	public void setPasswordsys1(String passwordsys1) {
		this.passwordsys1 = passwordsys1;
	}

	public String getDbtypesys1() {
		return dbtypesys1;
	}

	public void setDbtypesys1(String dbtypesys1) {
		this.dbtypesys1 = dbtypesys1;
	}

	public String getTablenamesys1() {
		return tablenamesys1;
	}

	public void setTablenamesys1(String tablenamesys1) {
		this.tablenamesys1 = tablenamesys1;
	}

	public String getStarttssys1() {
		return starttssys1;
	}

	public void setStarttssys1(String starttssys1) {
		this.starttssys1 = starttssys1;
	}

	public String getEndtssys1() {
		return endtssys1;
	}

	public void setEndtssys1(String endtssys1) {
		this.endtssys1 = endtssys1;
	}

	public String getJdbcurlsys2() {
		return jdbcurlsys2;
	}

	public void setJdbcurlsys2(String jdbcurlsys2) {
		this.jdbcurlsys2 = jdbcurlsys2;
	}

	public String getUsernamesys2() {
		return usernamesys2;
	}

	public void setUsernamesys2(String usernamesys2) {
		this.usernamesys2 = usernamesys2;
	}

	public String getPasswordsys2() {
		return passwordsys2;
	}

	public void setPasswordsys2(String passwordsys2) {
		this.passwordsys2 = passwordsys2;
	}

	public String getDbtypesys2() {
		return dbtypesys2;
	}

	public void setDbtypesys2(String dbtypesys2) {
		this.dbtypesys2 = dbtypesys2;
	}

	public String getTablenamesys2() {
		return tablenamesys2;
	}

	public void setTablenamesys2(String tablenamesys2) {
		this.tablenamesys2 = tablenamesys2;
	}

	public String getStarttssys2() {
		return starttssys2;
	}

	public void setStarttssys2(String starttssys2) {
		this.starttssys2 = starttssys2;
	}

	public String getEndtssys2() {
		return endtssys2;
	}

	public void setEndtssys2(String endtssys2) {
		this.endtssys2 = endtssys2;
	}

	public String getSys1type() {
		return sys1type;
	}

	public void setSys1type(String sys1type) {
		this.sys1type = sys1type;
	}

	public String getSys2type() {
		return sys2type;
	}

	public void setSys2type(String sys2type) {
		this.sys2type = sys2type;
	}

}
