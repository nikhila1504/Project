package com.cts.beans;

public class Users {

	String firstName,password;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Users(String firstName, String password) {
		this.firstName = firstName;
		this.password = password;
	}

}
