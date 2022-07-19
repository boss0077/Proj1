package com.prodapt.project.repo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.prodapt.project.entity.*;

@Repository
public interface TelecomRepository extends JpaRepository<login,Integer>{

	
	public login findByEmail(String email);
	public login findByEmailAndPassword(String email, String password);

}
   