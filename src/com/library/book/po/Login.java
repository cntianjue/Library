package com.library.book.po;

public class Login {
private String pass;
private String uname;
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}

public String getUname() {
	return uname;
}

public void setUname(String uname) {
	this.uname = uname;
}

public Login(String pass, String uname) {
	super();
	this.pass = pass;
	this.uname = uname;
}

public Login() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "Login [pass=" + pass + ", uname=" + uname + "]";
}




}
