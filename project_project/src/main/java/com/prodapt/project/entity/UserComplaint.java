package com.prodapt.project.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.prodapt.project.process.UserComplaintProcess;



@Table
@Entity
public class UserComplaint extends UserComplaintProcess{
	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	//@Id
	long mobileNumber;
	String complaintDescription;
	@Id
	int complaintNumber; //random
	String status;
	
	
	
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getComplaintDescription() {
		return complaintDescription;
	}
	public void setComplaintDescription(String complaintDescription) {
		this.complaintDescription = complaintDescription;
	}
	
	
	//RANDOM call
	public int getComplaintNumber() {
		return complaintNumber;
	}
	public void setComplaintNumber(int updatedNumber) {
		this.complaintNumber = updatedNumber;
		//this.complaintNumber = complaintNumber;
	}
	
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public UserComplaint(long mobileNumber, String complaintDescription) {
		super();
		this.mobileNumber = mobileNumber;
		this.complaintDescription = complaintDescription;
	}
	public UserComplaint() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
