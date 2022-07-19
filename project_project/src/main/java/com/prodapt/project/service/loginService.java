package com.prodapt.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.prodapt.project.entity.login;
import com.prodapt.project.repo.TelecomRepository;

@Service
@Component
public class loginService {
	
	@Autowired
	private TelecomRepository tele;
	
	public login saveuser(login l) {
		return tele.save(l);
	}
	public login fetchByEmail(String email) {
		return tele.findByEmail(email);
	}
	public login fetchByEmailAndPassword(String email,String password) {
		return tele.findByEmailAndPassword(email,password);
	}
}
