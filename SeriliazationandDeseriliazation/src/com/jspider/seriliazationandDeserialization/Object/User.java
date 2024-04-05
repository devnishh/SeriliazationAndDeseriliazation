package com.jspider.seriliazationandDeserialization.Object;

import java.io.Serializable;

public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	private String  UserName;
	private String Email;
	private Long MobleNumber;
	private String Password;
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Long getMobleNumber() {
		return MobleNumber;
	}
	public void setMobleNumber(Long mobleNumber) {
		MobleNumber = mobleNumber;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "User [UserName=" + UserName + ", Email=" + Email + ", MobleNumber=" + MobleNumber + ", Password="
				+ Password + ", getUserName()=" + getUserName() + ", getEmail()=" + getEmail() + ", getMobleNumber()="
				+ getMobleNumber() + ", getPassword()=" + getPassword() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
}
