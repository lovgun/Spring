package com.lovely.spring_boot_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.lovely.spring_boot_demo.model.Customer;

public interface CustomerReo extends JpaRepository<Customer, Integer> {
	@Query("SELECT e FROM Customer e WHERE e.name=:name and e.pass=:pass")
       Customer findByName(String name,String pass);


}
