package com.lovely.spring_boot_demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lovely.spring_boot_demo.model.Customer;

import com.lovely.spring_boot_demo.model.Item;
import com.lovely.spring_boot_demo.repository.CustomerReo;
import com.lovely.spring_boot_demo.repository.ItemRepo;
@Component
public class Dao {

	static int count;
	@Autowired
	private CustomerReo crepo;
	
	@Autowired
	private ItemRepo irepo;
	
	

	public void save(Customer cs) {
		// TODO Auto-generated method stub
		crepo.save(cs);
		
	}

	public void saveItm(Item item) {
		// TODO Auto-generated method stub
		irepo.save(item);
		
	}

	public Customer login(String name, String password) {
		// TODO Auto-generated method stub
		
		Customer findByName=crepo.findByName(name,password);
		

		System.out.println(findByName);
		return findByName;
	}
		
		
		
		
	public List<Item> fetchItem() {
		// TODO Auto-generated method stub
		List<Item>findAll=irepo.findAll();
		return findAll;
	}

	public void addItem(int id, Customer customer) {
		// TODO Auto-generated method stub
		Item item=irepo.findById(id).orElse(null);
		Customer customer2= crepo.findById(customer.getId()).orElse(null);
		customer2.getItems().add(item);
		crepo.save(customer2);
		
		
	}

	public Customer fethall(Customer customer) {
		// TODO Auto-generated method stub
		Customer findById=crepo.findById(customer.getId()).orElse(null);
		return findById;
	}

}
