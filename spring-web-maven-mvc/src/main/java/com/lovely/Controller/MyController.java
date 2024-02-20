package com.lovely.Controller;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lovely.Model.userDto;
import com.lovely.Model.userDto1;
import com.lovely.dao.Dao;


//@RequestMapping("/")
//@Component
@Controller
public class MyController {
	@Autowired
	private Dao dao;
	
	@RequestMapping(value="/login",method= RequestMethod.POST)

		public String login(@RequestParam String username,@RequestParam String password){
		if(password.equals("azam123")){	
		return "resp1";
			
		}
		else{
			return"resp3";
		}
	}
	@RequestMapping("/registration")
	public String registration(@ModelAttribute userDto dto){
		dao.saveDto(dto);
	System.out.println(dto);
		return "resp2";
		
		
	}
	@RequestMapping(value="/login1",method= RequestMethod.POST)

	public ModelAndView login1(@RequestParam String name,@RequestParam String password){
	
		if(password.equals("azam123")){	
			return new ModelAndView("resp4","msg","Login sucess mr/miss"+" "+name);
		}
		return new ModelAndView("resp4","msg","Invalid password login failed mr/miss"+" "+name);
		
	}
	
	@RequestMapping("/registration1")
	public ModelAndView registration1(@ModelAttribute userDto1 dto1){
	System.out.println(dto1);
		return new ModelAndView("resp5","user",dto1);
		
		
	}
	
	@RequestMapping("/list")
	public ModelAndView list(){
	userDto1 dto= new userDto1();
	dto.setUsername("Azam");
	userDto1 dto1= new userDto1();
	dto1.setUsername("Amir");
	userDto1 dto2= new userDto1();
	dto2.setUsername("Reza");
	ArrayList<userDto1>list=new ArrayList<userDto1>();
	list.add(dto);
	list.add(dto1);
	list.add(dto2);
	
		return new ModelAndView("resp6","userList",list);
		
		
	}
}


