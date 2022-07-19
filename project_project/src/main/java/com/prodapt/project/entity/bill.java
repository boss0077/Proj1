package com.prodapt.project.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import com.prodapt.project.entity.*;
@Entity
public class bill {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int billId;
	long mobileNo;
	String name;
	String plan;
	String services;
	int amt;
	public int getAmt() {
		return amt;
	}
	public void setAmt(int amt) {
		this.amt = amt;
	}
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	public String getServices() {
		return services;
	}
	public void setServices(String services) {
		this.services = services;
	}
	
	
	public int getBillId() {
		return billId;
	}
	public void setBillId(int billId) {
		this.billId = billId;
	}
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
	public bill() {
		super();
		// TODO Auto-generated constructor stub
	}
	public bill(int billId, long mobileNo, String name, String plan, String services) {
		super();
		this.billId = billId;
		this.mobileNo = mobileNo;
		this.name = name;
		this.plan = plan;
		this.services = services;
	}
	
	
}
