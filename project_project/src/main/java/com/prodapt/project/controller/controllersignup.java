package com.prodapt.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prodapt.project.entity.login;
import com.prodapt.project.repo.TelecomRepository;
import com.prodapt.project.service.loginService;

@RestController
@EnableAutoConfiguration

@Component
public class controllersignup {
	
	@Autowired 
	private loginService service;
	@Autowired
	private TelecomRepository tele;
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/registeruser")
	
	public login registerUser(@RequestBody login l) throws Exception {
		String tempEmail=l.getEmail();
		if(tempEmail!=null && !"".equals(tempEmail)) {
			login loginObj=service.fetchByEmail(tempEmail);
			if(loginObj!=null) {
				throw new Exception("User with "+tempEmail+" already exits");
			}
		}
		login loginObj=null;
		loginObj=service.saveuser(l);
		return loginObj;
	}
	
}
