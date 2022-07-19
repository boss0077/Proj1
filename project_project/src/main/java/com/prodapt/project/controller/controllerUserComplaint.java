package com.prodapt.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prodapt.project.entity.UserComplaint;
import com.prodapt.project.process.UserComplaintProcess;
import com.prodapt.project.repo.UserComplaintRepository;
@RestController
@EnableAutoConfiguration
@CrossOrigin
//@RequestMapping("/demo")
@Component
public class controllerUserComplaint {

	@Autowired
	private UserComplaintRepository UserComplaintBean;
	
	


	// COMPLAINT DATABASE-----------------------------------------------------------------------------------------------------------
	
	//# POST [Customer Complaint]
		//@CrossOrigin(origins = "http://localhost:4200")
		@PostMapping("/track")
		public UserComplaint CustomerComplaintPost(@RequestBody UserComplaint TelecomObj) {
			TelecomObj.setStatus("Active");
			UserComplaintProcess tempObj = new UserComplaintProcess();
			int temp = tempObj.staticComplaintNumberMethod();
			TelecomObj.setComplaintNumber(temp);
			return UserComplaintBean.save(TelecomObj);
		}
		
	//# GET [Customer Complaint]
			//@CrossOrigin(origins = "http://localhost:4200")
			@GetMapping("/display")
			public List<UserComplaint> FetchAllCustomerComplaint() {
				return UserComplaintBean.findAll();
			}
}
