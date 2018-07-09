package com.spring.forms.model;

import java.util.Date;

public class User {

	private String username;

	private String password;

	private String email;

	private Date birthDate;

	private String profession;

	public Date getBirthDate() {
		return birthDate;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getProfession() {
		return profession;
	}

	public String getUsername() {
		return username;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public void setUsername(String username) {
		this.username = username;
	}

}
