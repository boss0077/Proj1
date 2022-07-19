package com.prodapt.project.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prodapt.project.entity.UserComplaint;
import com.prodapt.project.entity.bill;

public interface UserComplaintRepository extends JpaRepository<UserComplaint,Integer>{

}
