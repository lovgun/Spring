package com.lovely.restDemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table
public class Registration {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		 private int id;
		 private String name;
		 
		private String password;
		 private String email;

		 public int getId() {
			return id;
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
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		@Override
		public String toString() {
			return "Registration [id=" + id + ", name=" + name + ", password=" + password + ", email=" + email + "]";
		}
}
