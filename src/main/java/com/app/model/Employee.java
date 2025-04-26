package com.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue
	private Integer empId;
	private String empName;
	private String loc;
	private String doorNo;
	

	public Employee() {
		System.out.println("defaul constructor");
	}

	

	public Employee(String empName, String loc) {
		super();
		this.empName = empName;
		this.loc = loc;
	}


	public Employee(Integer empId, String empName, String loc) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.loc = loc;
	}


	public Integer getEmpId() {
		return empId;
	}


	public void setEmpId(int empId) {
		this.empId = empId;
	}


	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}


	public String getLoc() {
		return loc;
	}


	public void setLoc(String loc) {
		this.loc = loc;
	}


	public Employee(Integer empId, String empName, String loc, String doorNo) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.loc = loc;
		this.doorNo = doorNo;
	}


	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", loc=" + loc + ", doorNo=" + doorNo + "]";
	}
	
	
	
	
	
}
