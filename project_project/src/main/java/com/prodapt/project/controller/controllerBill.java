package com.prodapt.project.controller;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import com.prodapt.project.entity.*;
import com.prodapt.project.repo.*;
import com.prodapt.project.service.*;

import trial.trial;


@RestController
@EnableAutoConfiguration

@Component
@CrossOrigin
public class controllerBill {
	@Autowired 
	private billService service;
	@Autowired
	private BillRepository billrepoo;
	
	
	/*
	 * @CrossOrigin(origins = "http://localhost:56517") //printing all bill details
	 * 
	 * @GetMapping("/getdetails") public List<bill> fetchBillList(){ List<bill>
	 * b=new ArrayList<bill>(); b=service.fetchbillList(); return b; }
	 */
	  
	 // @CrossOrigin(origins = "http://localhost:4200")
	  
	  @PostMapping("/insert") public bill saveBill(@RequestBody bill b){ return
	  service.saveBillDetails(b);
	  
	  }
	//  @CrossOrigin(origins = "http://localhost:65234")
	 
	  @GetMapping("/getbilldetails/{billId}")
	  public bill getUserById(@PathVariable("billId") int billId){
	    return service.getUserById(billId);
	  }
	  
	  //error-free code for get
		
		//  @CrossOrigin(origins = "http://localhost:4200")
		  
		  @GetMapping("/getbilldetails") 
		  public bill fetchByBillById() { 
			  trial obj =new trial(); 
			  int latestBillCount = obj.increment(); 
			  return service.fetchByBillById(latestBillCount).get(); }
		 
		  @GetMapping("/fetch") 
		  public List<bill> FetchAllCustomer() {
			  
				return billrepoo.findAll(); 
				}
	
		/*
		 * @CrossOrigin(origins = "http://localhost:63886")
		 * 
		 * @GetMapping("/fetch") public List<bill> FetchAllCustomer() {
		 * 
		 * return billrepoo.findAll(); }
		 * 
		 * @CrossOrigin(origins = "http://localhost:63886")
		 * 
		 * @PostMapping("/add") public bill AddCustomer(@RequestBody bill billObj) {
		 * return billrepoo.save(billObj); }
		 */
}
