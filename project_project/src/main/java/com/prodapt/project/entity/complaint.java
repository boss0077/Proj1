package com.prodapt.project.entity;

public class complaint {
	long mobileNo;
	String name;
	String description;
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public complaint(long mobileNo, String name, String description) {
		super();
		this.mobileNo = mobileNo;
		this.name = name;
		this.description = description;
	}
	public complaint() {
		
	}
	
	

}
