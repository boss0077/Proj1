package com.prodapt.project.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.prodapt.project.entity.*;

@Repository

public interface BillRepository extends JpaRepository<bill,Integer> {
	public bill findByName(String name);
}