package com.lovely.restDemo.response;

import java.util.List;

import com.lovely.restDemo.model.Email;



public class EmailResponce {
	private boolean error1;
	private String msg1;
	private List<Email> emailRes;
	public List<EmailResponce> getEmailRes() {
		return emailRes;
	}
	public void setEmailRes(List<Email> list) {
		this.emailRes = list;
	}
	@Override
	public String toString() {
		return "EmailResponce [error1=" + error1 + ", msg1=" + msg1 + ", emailRes=" + emailRes + "]";
	}
	public boolean isError1() {
		return error1;
	}
	public void setError1(boolean error1) {
		this.error1 = error1;
	}
	public String getMsg1() {
		return msg1;
	}
	public void setMsg1(String msg1) {
		this.msg1 = msg1;
	}


}
