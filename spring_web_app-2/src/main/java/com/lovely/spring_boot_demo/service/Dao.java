package com.lovely.spring_boot_demo.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.lovely.spring_boot_demo.model.Customer1;
import com.lovely.spring_boot_demo.model.Items;
import com.lovely.spring_boot_demo.repository.Customer1Jpa;
import com.lovely.spring_boot_demo.repository.ItemJpa;

@Component
public class Dao {
	@Autowired
	Customer1Jpa cus;
	@Autowired
	ItemJpa it;
	

	public void save(Customer1 cs1) {
		// TODO Auto-generated method stub
		
		cus.save(cs1);
		

	}


	public Customer1 login(String name, String password) {
		// TODO Auto-generated method stub
		Customer1 findByName=cus.findByName(name,password);
		System.out.println(findByName);
		return findByName;
	}


	public void save(Items item) {
		// TODO Auto-generated method stub
		it.save(item);
		
	}


	public List<Items> fetchItem() {
		// TODO Auto-generated method stub
		List<Items>findAll=it.findAll();
		return findAll;
		
	}


	public void addItem(int id, Customer1 customer) {
		// TODO Auto-generated method stub
		Items item=it.findById(id).orElse(null);
		Customer1 customer1= cus.findById(customer.getId()).orElse(null);
		customer1.getItems().add(item);
		cus.save(customer1);
		
		
		
	}


	public Customer1 fethall(Customer1 customer) {
		// TODO Auto-generated method stub
		Customer1 findById=cus.findById(customer.getId()).orElse(null);
		return findById;
	
	}
	
	
	
		
	}
		

