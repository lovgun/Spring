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

import com.lovely.spring_boot_demo.model.Customer;
import com.lovely.spring_boot_demo.model.Item;
import com.lovely.spring_boot_demo.service.Dao;


import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class MyController {
	@Autowired
	private Dao dao;

	@GetMapping("/")
	public String m1() {
		return "index";
	}

	@GetMapping("/reg")
	public String reg() {
		return "resp1";
	}

	@GetMapping("/regForm")
	public String regForm(@ModelAttribute Customer cs) {
		dao.save(cs);
		return "resp2";

	}
	@GetMapping("/item")
	public String item()
	{
		return "resp3";
	}
	@GetMapping("/itemForm")
	public String itemForm(@ModelAttribute Item item) {
		dao.saveItm(item);
		return "resp2";
		
	}
	@GetMapping("/login")
	public String login() {
		return "resp4";
				
	}
	
	@GetMapping("loginForm")
	public String loginForm(@RequestParam String name,@RequestParam  String pass,HttpServletRequest request,Model model) {
		Customer list=dao.login(name,pass);
		System.out.println(list);
		if(list!=null) {
			HttpSession session= request.getSession(true);
			session.setAttribute("name",list);
			List<Item> fetchItem=dao.fetchItem();
			model.addAttribute("item",fetchItem);
			model.addAttribute("msg",list);
			System.out.println("login success");
			System.out.println(list.getName());
			return "resp5";
		}
		
		else {
			System.out.println("login failed");
			return "resp7";
			
		}}
		
			
		

	@GetMapping("/addCard/{id}")
	public String addCard(@PathVariable int id,HttpServletRequest request) {
		HttpSession session=request.getSession(false);
		Customer customer=(Customer)session.getAttribute("name");
		System.out.println("Customer ======="+customer);
		dao.addItem(id,customer);
		return "resp6";
		
	}
	@GetMapping("/card")
	public ModelAndView card(HttpServletRequest request,Model model) {
		HttpSession session = request.getSession(false);
		Customer customer=(Customer)session.getAttribute("name");
		System.out.println("cus =================="+customer);
		model.addAttribute("user",customer);
		Customer fetchall= dao.fethall(customer);
		List<Item>list=fetchall.getItems();
				System.out.println("list=============="+list);
		return new ModelAndView("resp8","list",list);
	}
	@GetMapping("/order")
	public String order(HttpServletRequest request,Model model)
{
		HttpSession session= request.getSession(false);
		Customer customer=(Customer)session.getAttribute("name");
		model.addAttribute("user",customer);
		Customer fetchall=dao.fethall(customer);
		List<Item>list = fetchall.getItems();
		int price=0;
		for(Item item:list) {
			price+=item.getPrice();
			
		}
		System.out.println("Total price===="+price);
		model.addAttribute("price",price);
	
		model.addAttribute("list", list);
		return "resp9";
		
		
		}
	@GetMapping("/confirm")
	public String confirm(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		return "resp10";
	}
	@GetMapping("/logout")
	public String logout(HttpServletRequest request) {
		HttpSession session = request.getSession(false);
		return "resp9";
		
	}

}