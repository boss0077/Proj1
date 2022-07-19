package com.prodapt.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
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
//@RequestMapping("/demo")
@Component
public class controllerlogin {
	@Autowired 
	private loginService service;
	@Autowired
	private TelecomRepository tele;
	@CrossOrigin(origins="http://localhost:4200")
	@PostMapping("/loginuser")
	
	
	public login loginUser(@RequestBody login l) throws Exception {
		String tempEmail=l.getEmail();
		String tempPass=l.getPassword();
		login loginObj=null;
		if(tempEmail!=null && tempPass!=null )
		{
			loginObj=service.fetchByEmailAndPassword(tempEmail, tempPass);
			
		}
		if(loginObj==null) {
			throw new Exception("doesn't exist");
		}
		return loginObj;
}
}
