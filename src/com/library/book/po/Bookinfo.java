package com.library.book.po;

import java.util.Date;

public class Bookinfo {
private int price;
private String  writer;
private Date  publication;
private int bno;
private int quantity;
private String uname;
private int uno;
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public int getUno() {
	return uno;
}
public void setUno(int uno) {
	this.uno = uno;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public int getBno() {
	return bno;
}
public void setBno(int bno) {
	this.bno = bno;
}
public Bookinfo() {
	super();
	// TODO Auto-generated constructor stub
}
public Bookinfo(int price, String writer, Date publication, String company, String content, String bname, String img) {
	super();
	this.price = price;
	this.writer = writer;
	this.publication = publication;
	this.company = company;
	this.content = content;
	this.bname = bname;
	this.img = img;
}
private String company;
private String content;

private String bname;
private String img;

public String getImg() {
	return img;
}
public void setImg(String img) {
	this.img = img;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public String getWriter() {
	return writer;
}
public void setWriter(String writer) {
	this.writer = writer;
}
public Date getPublication() {
	return publication;
}
public void setPublication(Date publication) {
	this.publication = publication;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
@Override
public String toString() {
	return "Bookinfo [price=" + price + ", writer=" + writer + ", publication=" + publication + ", bno=" + bno
			+ ", quantity=" + quantity + ", uname=" + uname + ", uno=" + uno + ", company=" + company + ", content="
			+ content + ", bname=" + bname + ", img=" + img + "]";
}

}
