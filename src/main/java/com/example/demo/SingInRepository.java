package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface SingInRepository extends JpaRepository<SingIn, Integer>{
	
	@Query(value = "SELECT * FROM singin WHERE username=?1 ", nativeQuery = true)
	List<SingIn> getSingInByUserName(String username);

}
