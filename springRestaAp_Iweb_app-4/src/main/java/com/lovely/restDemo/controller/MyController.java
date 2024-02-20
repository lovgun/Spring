package com.lovely.restDemo.controller;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.lovely.restDemo.model.Product;
import com.lovely.restDemo.response.MyProduct;
import com.lovely.restDemo.service.MyService;

@RestController
public class MyController {

	@Autowired
	private MyService service;
	@Autowired
	private MyProduct response;

	@PostMapping("/add")
	public ResponseEntity<MyProduct> add(@RequestBody Product product) {
		Product savedDto = service.add(product);
		if (savedDto != null) {

			System.out.println(product);

			response.setError(false);
			response.setMsg("data added succesfully");
			response.setProducts(Arrays.asList(product));

			return new ResponseEntity<MyProduct>(response, HttpStatus.OK);

		} else {
			response.setError(true);
			response.setMsg("failed to add");
			response.setProducts(null);
			return new ResponseEntity<MyProduct>(response, HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/getById/{id}")
	public ResponseEntity<MyProduct> getById(@PathVariable("id") int id) {
		Product savedDto = service.getUser(id);
		if (savedDto != null) {

			response.setError(false);
			response.setMsg("data fetched succesfully");
			response.setProducts(Arrays.asList(savedDto));

			return new ResponseEntity<MyProduct>(response, HttpStatus.OK);

		} else {
			response.setError(true);
			response.setMsg("failed to fetch");
			response.setProducts(null);
			return new ResponseEntity<MyProduct>(response, HttpStatus.NOT_FOUND);
		}

	}

	@PutMapping("/update/{id}")
	public ResponseEntity<MyProduct> getUser(@PathVariable("id") int id, @RequestBody Product product) {
		Product updateDto = service.update(id, product);
		if (updateDto != null) {

			System.out.println(product);

			response.setError(false);
			response.setMsg("data updated succesfully");
			response.setProducts(Arrays.asList(updateDto));

			return new ResponseEntity<MyProduct>(response, HttpStatus.OK);

		} else {
			response.setError(true);
			response.setMsg("failed to update");
			response.setProducts(null);
			return new ResponseEntity<MyProduct>(response, HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/deleteById/{id}")
	public ResponseEntity<MyProduct> deleteById(@PathVariable("id") int id) {
		Product deletedto = service.deleteUser(id);
		if (deletedto != null) {


			response.setError(false);
			response.setMsg("data deleteed succesfully");
			response.setProducts(Arrays.asList(deletedto));

			return new ResponseEntity<MyProduct>(response, HttpStatus.OK);

		} else {
			response.setError(true);
			response.setMsg("failed to delete");
			response.setProducts(null);
			return new ResponseEntity<MyProduct>(response, HttpStatus.NOT_FOUND);
		}
	}
}
