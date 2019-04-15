package com.library.book.po;

import java.util.Date;

public class Borrow {

private String bname;

private Date date;
private String uname;
private int bno;

public int getBno() {
	return bno;
}
public void setBno(int bno) {
	this.bno = bno;
}
@Override
public String toString() {
	return "Borrow [bname=" + bname + ", date=" + date + ", uname=" + uname + "]";
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}

public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}

}
