package com.lovely.restDemo.response;

import java.util.List;

import org.springframework.stereotype.Component;

import com.lovely.restDemo.request.product;

@Component

public class MyProduct {
	private boolean error;
	private String msg;
	private List<product> products;
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
	public List<product> getProducts() {
		return products;
	}
	public void setProducts(List<product> products) {
		this.products = products;
	}

}
