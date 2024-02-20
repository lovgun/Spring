package com.lovely.restDemo.response;

import java.util.List;

import org.springframework.stereotype.Component;

import com.lovely.restDemo.model.Product;


@Component

public class MyProduct {
	private boolean error;
	private String msg;
	private List<Product> products;
	
	public boolean isError() {
		return error;
	}
	public void setError(boolean error) {
		this.error = error;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}

}
