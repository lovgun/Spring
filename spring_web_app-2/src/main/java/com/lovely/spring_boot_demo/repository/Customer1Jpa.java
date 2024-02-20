package com.lovely.spring_boot_demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.lovely.spring_boot_demo.model.Customer1;

public interface Customer1Jpa extends JpaRepository<Customer1, Integer>{
	@Query("SELECT e FROM Customer1 e WHERE e.name=:name and e.pass=:password")
    Customer1 findByName(String name,String password);


}



