package com.lovely.mavenApp2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.lovely.model.UserDto;


	@Controller
	public class MyController {
		@RequestMapping(value="/login",method= RequestMethod.POST)
		public String login(@RequestParam String username,@RequestParam String password){
			if(password.equals("azam1234")){
				return "resp1.jsp";
			}
				return "resp2.jsp";
		}
@RequestMapping("/registration")
public String registration(@ModelAttribute UserDto dto){
//	System.out.println(dto.getUsername());
//	System.out.println(dto.getPassword());
//	System.out.println(dto.getAddress());
//	System.out.println(dto.getAge());
	System.out.println(dto);
	return "resp1.jsp";
}
	}



