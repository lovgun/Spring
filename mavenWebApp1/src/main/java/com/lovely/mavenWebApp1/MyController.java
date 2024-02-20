package com.lovely.mavenWebApp1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	@RequestMapping("/login")
	public String login(@RequestParam String username,@RequestParam String password){
		if(password.equals("azam1234")){
			return "resp1.jsp";
		}
			return "resp2.jsp";
	}

}
