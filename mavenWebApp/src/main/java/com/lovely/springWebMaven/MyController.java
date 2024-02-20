package com.lovely.springWebMaven;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RequestMapping("/")
//@Component

@Controller
public class MyController {
	@RequestMapping("/link1")
	public String link1(){
		return "resp1.jsp";
		
	}
	
	@RequestMapping("/link2")
		public String link2(){
		return "resp2.jsp";
		

}
}