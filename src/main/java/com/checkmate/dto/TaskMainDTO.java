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
	
	
private String jdbcurlsys1;
	
	private String usernamesys1;
	
	private String passwordsys1;
	
	private String dbtypesys1;
	
	private String tablenamesys1;
	
	private String starttssys1;
	
	private String endtssys1;

	
	private String jdbcurlsys2;
	
	private String usernamesys2;
	
	private String passwordsys2;
	
	private String dbtypesys2;
	
	private String tablenamesys2;
	
	private String starttssys2;
	
	private String endtssys2;
	
	private String sys1type;
	
	private String sys2type;
	
	
	private String tablenameClobsys1;
	
	private String starttsClobsys1;
	
	private String endtsClobsys1;

	
	private String tablenameOnlinesys1;
	
	private String starttsOnlinesys1;
	
	private String endtsOnlinesys1;
	
		
	private String tablenameClobsys2;
	
	private String starttsClobsys2;
	
	private String endtsClobsys2;

	
	private String tablenameOnlinesys2;
	
	private String starttsOnlinesys2;
	
	private String endtsOnlinesys2;
	


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

	public String getTablenameClobsys1() {
		return tablenameClobsys1;
	}

	public void setTablenameClobsys1(String tablenameClobsys1) {
		this.tablenameClobsys1 = tablenameClobsys1;
	}

	public String getStarttsClobsys1() {
		return starttsClobsys1;
	}

	public void setStarttsClobsys1(String starttsClobsys1) {
		this.starttsClobsys1 = starttsClobsys1;
	}

	public String getEndtsClobsys1() {
		return endtsClobsys1;
	}

	public void setEndtsClobsys1(String endtsClobsys1) {
		this.endtsClobsys1 = endtsClobsys1;
	}

	public String getTablenameOnlinesys1() {
		return tablenameOnlinesys1;
	}

	public void setTablenameOnlinesys1(String tablenameOnlinesys1) {
		this.tablenameOnlinesys1 = tablenameOnlinesys1;
	}

	public String getStarttsOnlinesys1() {
		return starttsOnlinesys1;
	}

	public void setStarttsOnlinesys1(String starttsOnlinesys1) {
		this.starttsOnlinesys1 = starttsOnlinesys1;
	}

	public String getEndtsOnlinesys1() {
		return endtsOnlinesys1;
	}

	public void setEndtsOnlinesys1(String endtsOnlinesys1) {
		this.endtsOnlinesys1 = endtsOnlinesys1;
	}

	public String getTablenameClobsys2() {
		return tablenameClobsys2;
	}

	public void setTablenameClobsys2(String tablenameClobsys2) {
		this.tablenameClobsys2 = tablenameClobsys2;
	}

	public String getStarttsClobsys2() {
		return starttsClobsys2;
	}

	public void setStarttsClobsys2(String starttsClobsys2) {
		this.starttsClobsys2 = starttsClobsys2;
	}

	public String getEndtsClobsys2() {
		return endtsClobsys2;
	}

	public void setEndtsClobsys2(String endtsClobsys2) {
		this.endtsClobsys2 = endtsClobsys2;
	}

	public String getTablenameOnlinesys2() {
		return tablenameOnlinesys2;
	}

	public void setTablenameOnlinesys2(String tablenameOnlinesys2) {
		this.tablenameOnlinesys2 = tablenameOnlinesys2;
	}

	public String getStarttsOnlinesys2() {
		return starttsOnlinesys2;
	}

	public void setStarttsOnlinesys2(String starttsOnlinesys2) {
		this.starttsOnlinesys2 = starttsOnlinesys2;
	}

	public String getEndtsOnlinesys2() {
		return endtsOnlinesys2;
	}

	public void setEndtsOnlinesys2(String endtsOnlinesys2) {
		this.endtsOnlinesys2 = endtsOnlinesys2;
	}

}