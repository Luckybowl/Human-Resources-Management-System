package com.upc.dao;

public class Job {
	private String job_no;   //岗位编号
	private String job_name;   //岗位名称
	private String job_type;     //岗位类型
	private String job_limit;    //岗位编制
	
	public String getJob_no() {
		return job_no;
	}
	public void setJob_no(String job_no) {
		this.job_no = job_no;
	}
	public String getJob_name() {
		return job_name;
	}
	public void setJob_name(String job_name) {
		this.job_name = job_name;
	}
	public String getJob_type() {
		return job_type;
	}
	public void setJob_type(String job_type) {
		this.job_type = job_type;
	}
	public String getJob_limit() {
		return job_limit;
	}
	public void setJob_limit(String job_limit) {
		this.job_limit = job_limit;
	}
	
}
