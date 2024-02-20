package com.lovely.restDemo.service;

import com.lovely.restDemo.model.Product;

public interface MyService {
	Product update (int id,Product product);
	Product add(Product product);
	Product getUser(int id);
	Product deleteUser(int id);

}
