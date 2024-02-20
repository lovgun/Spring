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
public class Customer1 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String pass;
	private String age ;
	private String address;
	@ManyToMany(cascade = CascadeType.ALL)//its meaning is all curd performance has to be permorm
	@JoinTable(name="cus_item1",joinColumns = @JoinColumn(name="cid1"),inverseJoinColumns = @JoinColumn(name="iid1"))
	 private List<Items>items;
	
	public List<Items> getItems() {
		return items;
	}
	public void setItems(List<Items> items) {
		this.items = items;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public String toString() {
		return "Customer1 [id=" + id + ", name=" + name + ", pass=" + pass + ", age=" + age + ", address=" + address
				+ ", items=" + items + ", getItems()=" + getItems() + ", getId()=" + getId() + ", getName()="
				+ getName() + ", getPass()=" + getPass() + ", getAge()=" + getAge() + ", getAddress()=" + getAddress()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	

}
