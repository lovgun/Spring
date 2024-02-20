package com.lovely.restDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.lovely.restDemo.model.Email;
import com.lovely.restDemo.model.Registration;
import com.lovely.restDemo.repository.EmailRepo;
import com.lovely.restDemo.repository.UserRepository;

@Service
public class myServiceimpl implements MyService {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private EmailRepo erepo;
	

	@Override
	public Registration register(Registration registration) {
		// TODO Auto-generated method stub
		return  userRepository.save(registration);
	}

	public Registration register(String name, String password) {
		// TODO Auto-generated method stub
		Registration findByName=userRepository.findByName(name,password)
				
		return findByName ;
	}

	public Registration send(String to) {
		// TODO Auto-generated method stub
		Registration findBy=userRepository.findBy(to);
		System.out.println("find by:"+findBy);
		return findBy;
	}
		
		
	

	public void save(Email sendRequest) {
		// TODO Auto-generated method stub
		erepo.save(sendRequest);
		
	}

	public List<Email> checkEmail(String to) {
		// TODO Auto-generated method stub
		List<Email>findByTo=erepo.findByTo(to);
		return findByTo;
		
	}
	public List<Email> checkSendar(String from) {
		// TODO Auto-generated method stub
		List<Email>findByFrom=erepo.findByFrom(from);
		return findByFrom;
		
	}

}
