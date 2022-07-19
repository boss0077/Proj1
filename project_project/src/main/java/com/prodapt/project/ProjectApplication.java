package com.prodapt.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.prodapt.project.entity.login;
import com.prodapt.project.repo.TelecomRepository;
import com.prodapt.project.service.loginService;
@SpringBootApplication
public class ProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjectApplication.class, args);
	}

}
