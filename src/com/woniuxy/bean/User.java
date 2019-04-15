package com.woniuxy.bean;

import java.util.Date;

public class User {
private String  account;
private  String pass;
private Date birth;
private  String path;
public String getPath() {
	return path;
}
public void setPath(String path) {
	this.path = path;
}
public User() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "User [account=" + account + ", pass=" + pass + ", birth=" + birth + "]";
}
public User(String account, String pass) {
	super();
	this.account = account;
	this.pass = pass;
}
public Date getBirth() {
	return birth;
}
public void setBirth(Date birth) {
	this.birth = birth;
}
public String getAccount() {
	return account;
}
public void setAccount(String account) {
	this.account = account;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
}
