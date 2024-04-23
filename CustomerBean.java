package com.sbi.in;

import java.io.Serializable;

@SuppressWarnings("serial")
public class CustomerBean implements Serializable
{

	private String username;
	private String password;
	private String gendre;
	private Integer balance;
	private Integer acoountNo;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGendre() {
		return gendre;
	}
	public void setGendre(String gendre) {
		this.gendre = gendre;
	}
	public Integer getBalance() {
		return balance;
	}
	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	public Integer getAcoountNo() {
		return acoountNo;
	}
	public void setAcoountNo(Integer acoountNo) {
		this.acoountNo = acoountNo;
	}
	
	
	
	
	
	
	
	
	
	
}
