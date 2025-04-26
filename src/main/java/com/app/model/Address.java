package com.app.model;

public class Address {
	private String loName;
	private String addNo;

	public String getAddNo() {
		return addNo;
	}

	public void setAddNo(String addNo) {
		this.addNo = addNo;
	}

	public Address(String addNo) {
		super();
		this.addNo = addNo;
	}

	@Override
	public String toString() {
		return "Address [addNo=" + addNo + "]";
	}


	
	

}
