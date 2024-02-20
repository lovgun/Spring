package com.lovely.restDemo.controller;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lovely.restDemo.request.product;
import com.lovely.restDemo.response.MyProduct;
import com.lovely.restDemo.service.MyService;

@RestController
public class MyController {
	
	@Autowired
	MyService service;
	@Autowired
	MyProduct response;
	
	@PostMapping("/product")
	public ResponseEntity<MyProduct> product(@RequestBody product product){
		System.out.println(product);
		response.setError(false);
		response.setMsg("request data received and provinding succes response");
		response.setProducts(Arrays.asList(product));
		return new ResponseEntity<MyProduct>(response, HttpStatus.OK);
		
		
		
		}
	}


