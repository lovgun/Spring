package com.lovely.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.GenerationType;
import javax.persistence.Id;



import lombok.Data;

@Entity
@Data
public class UserDto {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String user;
	private String password;
	private int age;
	private String address;
	

}
