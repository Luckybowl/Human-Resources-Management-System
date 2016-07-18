package com.upc.dao;

public class Dept {
	//实体类
	private String dept_no;//部门编号
	private String dept_name;//部门名称
	private String dept_type;//部门类型
	private String dept_phone;//部门电话
	private String dept_fax;//部门传真
	private String describe;//部门描述
	private String rankdept;//上级部门
	private String start_date;//成立日期
	public String getDept_no() {
		return dept_no;
	}
	public void setDept_no(String dept_no) {
		this.dept_no = dept_no;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public String getDept_type() {
		return dept_type;
	}
	public void setDept_type(String dept_type) {
		this.dept_type = dept_type;
	}
	
	public String getDept_phone() {
		return dept_phone;
	}
	public void setDept_phone(String dept_phone) {
		this.dept_phone = dept_phone;
	}
	
	public String getDept_fax() {
		return dept_fax;
	}
	public void setDept_fax(String dept_fax) {
		this.dept_fax= dept_fax;
	}
	public String getDescribe() {
		return describe;
	}
	public void setDescribe(String describe) {
		this.describe= describe;
	}
	public String getRankdept() {
		return rankdept;
		}
	public void setRankdept(String rankdept) {
		this.rankdept= rankdept;
	}
	
	public String  getsTart_date() {
		return start_date;
		}
	public void setsTart_date(String start_date) {
		this.start_date= start_date;
	}
}
	
	
	
	
	
	
