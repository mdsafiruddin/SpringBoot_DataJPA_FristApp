package com.app.model;

public class Address {
	private String loName;
	private String addNo;
	private String street;
	
	public Address(String loName, String addNo, String street) {
		super();
		this.loName = loName;
		this.addNo = addNo;
		this.street = street;
	}

	
	public String getLoName() {
		return loName;
	}


	public void setLoName(String loName) {
		this.loName = loName;
	}


	public String getAddNo() {
		return addNo;
	}


	public void setAddNo(String addNo) {
		this.addNo = addNo;
	}


	public String getStreet() {
		return street;
	}


	public void setStreet(String street) {
		this.street = street;
	}


	@Override
	public String toString() {
		return "Address [loName=" + loName + ", addNo=" + addNo + ", street=" + street + "]";
	}

	
	

	
	

}
