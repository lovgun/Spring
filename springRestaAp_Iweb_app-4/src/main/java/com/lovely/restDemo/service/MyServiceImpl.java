package com.lovely.restDemo.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import com.lovely.restDemo.model.Product;
import com.lovely.restDemo.repository.MyRepo;


@Component

public class MyServiceImpl implements MyService {
	@Autowired 
	private MyRepo repo;
	
	@Override
	public Product add(Product product) {
		// TODO Auto-generated method stub
		return repo.save(product);
	}


	@Override
	public Product getUser(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}


	@Override
	public Product update(int id, Product product) {
		// TODO Auto-generated method stub
		Product getDto=repo.findById(id).orElse(null);
		if(getDto!=null) {
			getDto.setName(product.getName());
			getDto.setPrice(product.getPrice());
		return repo.save(getDto);
	}
		else {
			return null;
		}

}


	@Override
	public Product deleteUser(int id) {
		// TODO Auto-generated method stub
		Product deleteDto=repo.findById(id).orElse(null);
		if(deleteDto!=null) {
			repo.delete(deleteDto);
			
		return deleteDto;
	}
		else {
			return null;
		}
	
	}
}
