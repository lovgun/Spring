package com.lovely.restDemo.response;

import java.util.List;

import org.springframework.stereotype.Component;


import com.lovely.restDemo.model.Registration;



@Component

    public class MyResponse {
	private boolean error;
	private String msg;
	private List<Registration> registration;

	
	public List<Registration> getRegistration() {
		return registration;
	}
	public void setRegistration(List<Registration> registration) {
		this.registration = registration;
	}
	public boolean isError() {
		return error;
	}
	public void setError(boolean error) {
		this.error = error;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	
}

