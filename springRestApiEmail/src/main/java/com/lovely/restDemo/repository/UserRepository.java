package com.lovely.restDemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lovely.restDemo.model.Registration;

public interface UserRepository extends JpaRepository<Registration, Integer> {
	@Query("select e from Registration e where e.name=:name and e.password=:password")
	Registration findByName(String name,String password);
	@Query("select e from Registration e where e.user=:to")
	Registration findBy(String to);
	
}
