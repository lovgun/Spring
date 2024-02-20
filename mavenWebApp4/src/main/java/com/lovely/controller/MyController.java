package com.lovely.controller;

import java.util.ArrayList;

import javax.xml.crypto.Data;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lovely.model.Dao;
import com.lovely.model.UserDto;

@Controller
public class MyController {
	
	@Autowired
	private Dao dao;
	
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public ModelAndView login(@RequestParam String user,@RequestParam String password){
		if(password.equals("azam1234")){
			return new ModelAndView("resp1.jsp","msg","Login sucess Mr/Miss"+" " +user);
			//                        page        key      value
		}
		
		return new ModelAndView("resp1","msg","login failed");
		//                        page         key          value
		
	}
	
	@RequestMapping("/registration")
	public ModelAndView registration(@ModelAttribute UserDto dto){
		System.out.println(dto);
		dao.saveDto(dto);

	return new ModelAndView("resp1","user",dto);

	}
	
	@RequestMapping("/listUser")
	public ModelAndView listUser(){
		UserDto dto1=new UserDto();
		dto1.setUser("Azam");
		UserDto dto2=new UserDto();
		dto2.setUser("Amir");
		UserDto dto3=new UserDto();
		dto3.setUser("Reza");
		ArrayList<UserDto>list= new ArrayList<UserDto>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		

	return new ModelAndView("resp3","userList",list);

	}
	}




