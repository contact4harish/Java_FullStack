package com.springboot.Webservices;

import org.json.JSONObject;

public class HelloWorldBean  {

	private String message;
	

	public HelloWorldBean(String string) {
		// TODO Auto-generated constructor stub
		this.setMessage(string);
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}
	

}
