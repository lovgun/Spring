package com.lovely.restDemo.Controller;

import java.security.Provider.Service;
import java.util.Arrays;
import java.util.List;

import org.hibernate.boot.model.source.internal.hbm.AbstractEntitySourceImpl;
import org.hibernate.bytecode.internal.bytebuddy.PrivateAccessorException;
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

import com.lovely.restDemo.model.Email;
import com.lovely.restDemo.model.Registration;
import com.lovely.restDemo.repository.UserRepository;
import com.lovely.restDemo.response.EmailResponce;
import com.lovely.restDemo.response.MyResponse;
import com.lovely.restDemo.service.MyService;
import com.lovely.restDemo.service.myServiceimpl;

import jakarta.persistence.criteria.Predicate;


@RestController

public class MyController {
	@Autowired
   UserRepository userRepository;
	
	@Autowired
	myServiceimpl service;
	
	@Autowired
	MyResponse response;
	@Autowired
	EmailResponce eresponse;
	
	
	@PostMapping("/register")
	public ResponseEntity<MyResponse> registerUser(@RequestBody Registration registration) {
		Registration savedDto = service.register(registration);
		if (savedDto != null) {
			

			System.out.println(registration);

			response.setError(false);
			response.setMsg("data added succesfully");
		

			return new ResponseEntity<MyResponse>(response, HttpStatus.OK);

		} else {
			response.setError(true);
			response.setMsg("failed to add");
	
			return new ResponseEntity<MyResponse>(response, HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/login")
	public ResponseEntity<MyResponse>loginUser(@RequestBody Registration registration){
		Registration savedDto = service.register(registration.getName(),registration.getPassword());
		if (savedDto != null) {

			response.setError(false);
			response.setMsg("data fetched succesfully");
			response.setRegistration(Arrays.asList(savedDto));

			return new ResponseEntity<>(response, HttpStatus.OK);

		} else {
			response.setError(true);
			response.setMsg("failed to fetch");
			response.setRegistration(null);
			return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
		}

	}
	@PostMapping("/sendEmail")
	public ResponseEntity<MyResponse> send(@RequestBody Email sendRequest){
		System.out.println(sendRequest);
		Registration send=service.send(sendRequest.getTo());
		System.out.println(send);
		if(send!=null) {
			service.save(sendRequest);
		}
		if(send!=null) {
			service.save(sendRequest);
			response.setError(false);
			response.setMsg("email send succesfully");


			return new ResponseEntity<>(response, HttpStatus.OK);

		}
		else {
			response.setError(true);
			response.setMsg("failed to send");
			return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);
			
		}
		
		
	}
	@GetMapping("/inbox")
	public ResponseEntity<EmailResponce>inbox(@RequestBody Email email){
		List<Email>list=service.checkEmail(email.getTo());
		System.out.println(list);
		if(list!=null) {
			eresponse.setError1(false);
			eresponse.setMsg1("inbox message");
			eresponse.setEmailRes(list);
			return new ResponseEntity<>(response, HttpStatus.OK);
		}
		
	}

	

}
