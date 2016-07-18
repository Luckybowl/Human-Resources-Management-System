package com.upc.dao;

public class JobMove {
	private String JDeptName;//
	private String OldJobName;//
	private String NewJobName;//
	private String JEmployeeName;
	private String JEmployeeSex;
	private String JMoveDate;
	public String getJMoveDate() {
		return JMoveDate;
	}
	public void setJMoveDate(String jMoveDate) {
		JMoveDate = jMoveDate;
	}
	private String JReason;
	public String getJDeptName() {//1
		return  JDeptName;
	}
	public void setJDeptName(String JDeptName) {
		this.JDeptName = JDeptName;
	}
	
	public String getOldJobName() {//2
		return  OldJobName;
	}
	public void setOldJobName(String OldJobName) {
		this.OldJobName = OldJobName;
	}
	public String getNewJobName() {//3
		return  NewJobName;
	}
	public void setNewJobName(String NewJobName) {
		this.NewJobName = NewJobName;
	}
	public String getJEmployeeName() {//4
		return  JEmployeeName;
	}
	public void setJEmployeeName(String JEmployeeName) {
		this.JEmployeeName = JEmployeeName;
	}
	public String getJEmployeeSex() {//5
		return  JEmployeeSex;
	}
	public void setJEmployeeSex(String JEmployeeSex) {
		this.JEmployeeSex = JEmployeeSex;
	}
	public String getJReason() {//6
		return  JReason;
	}
	public void setJReason(String JReason) {
		this.JReason = JReason;
	}

}
