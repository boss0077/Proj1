package com.prodapt.project.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.prodapt.project.entity.*;
import com.prodapt.project.repo.BillRepository;

import java.util.List;
import java.util.Optional;

@Service
@Component
public class billService {
	@Autowired
	private BillRepository billrepo;
	
	public List<bill> fetchbillList(){
		return billrepo.findAll();
	}
	public bill saveBillDetails(bill b) {
		return billrepo.save(b);
	}
	public Optional<bill> fetchByBillById(int billId) {
		return billrepo.findById(billId);
		}
	public bill getUserById(int billId) {
	    return billrepo.findById(billId).get();
	  }
}
