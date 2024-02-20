package com.lovely.spring_boot_demo.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Items {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int price;
	@ManyToMany(cascade = CascadeType.ALL)//its meaning is all curd performance has to be permorm
	@JoinTable(name="cus_item1",joinColumns = @JoinColumn(name="iid1"),inverseJoinColumns = @JoinColumn(name="cid1"))
	private List<Customer1>customer;
	public List<Customer1> getCustomer1() {
		return customer;
  }
	public void setCustomer1(List<Customer1> customer) {
		this.customer = customer;
	}
	
	public int getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
