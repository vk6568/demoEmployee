package com.hcl.springbootdemo.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="employee_test")
public class Employee {
	
	@Id
	@Column(name="Employee_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long eid;
	
	@Column(name="Employee_name")
	private String ename;
	
	@Column(name="edesiganation")
	private String edesiganation;
	
	public Long getEid() {
		return eid;
	}
	public void setEid(Long eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEdesiganation() {
		return edesiganation;
	}
	public void setEdesiganation(String edesiganation) {
		this.edesiganation = edesiganation;
	}
    
}
