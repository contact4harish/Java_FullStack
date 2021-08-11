package com.springboot.Webservices.entity;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class User {
	protected User() {
	
	}
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	private String role;
	private String birthDate;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", role=" + role + "]";
	}
	public User(String name, String role, String birthDate) throws ParseException {
		super();
		this.setName(name);
		this.setRole(role);
		this.setbirthDate(birthDate);
	}
	public String getbirthDate() {
		return birthDate;
	}
	public void setbirthDate(String birthDate) throws ParseException {
//		String pattern = "dd/MM/YYYY";
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
//		this.birthDate = simpleDateFormat.parse(birthDate);
		this.birthDate = birthDate;
	}
	
	
	
	
}
