package com.lovely.spring_boot_demo.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.lovely.spring_boot_demo.model.Customer1;

import com.lovely.spring_boot_demo.model.Items;
import com.lovely.spring_boot_demo.service.Dao;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class MyController {
	@Autowired
	Dao dao;
	
	@GetMapping("/")
	public String start() {
		return "index";

	}

	@GetMapping("/reg")
	public String registration() {
		return "1";

	}

	@GetMapping("/regForm")
	public String registrationForm(@ModelAttribute Customer1 cs1) {
		dao.save(cs1);
		
		return "2";

	}
	@GetMapping("/login")
	public String Login() {
		return "3";
		
	}
	@GetMapping("/loginForm")
	public String LoginForm(@RequestParam String name,@RequestParam  String pass,HttpServletRequest request,Model model) {
		Customer1 list=dao.login(name,pass);
		System.out.println(list);
		if(list!=null) {
			HttpSession session= request.getSession(true);
			session.setAttribute("name",list);
			List<Items> fetchItem=dao.fetchItem();
			model.addAttribute("item",fetchItem);
			model.addAttribute("msg",list);
			System.out.println("login success");
			System.out.println(list.getName());
			System.out.println(list.getId());
			return "4";
		}
		else {
			System.out.println("login failed");
			return "5";
			
		}
		
	
}
	

	@GetMapping("/addCard/{id}")
	public String addCard(@PathVariable int id,HttpServletRequest request) {
		HttpSession session=request.getSession(false);
		Customer1 customer=(Customer1)session.getAttribute("name");
		System.out.println("Customer1 ======="+customer);
		dao.addItem(id,customer);
		return "7";
		
	}
	@GetMapping("/item")
	public String Item() {
		return "6";
		
	}
	@GetMapping("/itemForm")
	public String ItemForm(@ModelAttribute Items item) {
		dao.save(item);
		return "2";
		
	}
	@GetMapping("/card")
	public  ModelAndView card(HttpServletRequest request,Model model) {
		HttpSession session = request.getSession(false);
		Customer1 customer=(Customer1)session.getAttribute("name");
		System.out.println("cus =================="+customer);
		model.addAttribute("user",customer);
		Customer1 fetchall= dao.fethall(customer);
		List<Items>list=fetchall.getItems();
				System.out.println("list=============="+list);
		return new ModelAndView("8","list",list);
		
	
		
	}
	@GetMapping("/order")
	public String order(HttpServletRequest request,Model model)
	{
			HttpSession session= request.getSession(false);
			Customer1 customer=(Customer1)session.getAttribute("name");
			model.addAttribute("user",customer);
			Customer1 fetchall=dao.fethall(customer);
			List<Items>list = fetchall.getItems();
			int price=0;
			for(Items item:list) {
				price+=item.getPrice();
				
			}
			System.out.println("Total price===="+price);
			model.addAttribute("price",price);
		
			model.addAttribute("list", list);
			return "9";
			
			
			}
	@GetMapping("/confirm")
	public String confirm(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		return "10";
	}


	@GetMapping("/logout")
	public String logout() {
		return "11";
		
		
	}


	}
