package com.library.book.po;

public class Book {
	private int price;
	private String writer;
	private String publication;
	private String company;
	private String content;
	private int bno;
	private int uno;
    private String bname;
	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public int getUno() {
		return uno;
	}

	public void setUno(int uno) {
		this.uno = uno;
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
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


	@Override
	public String toString() {
		return "Book [price=" + price + ", writer=" + writer + ", publication=" + publication + ", company=" + company
				+ ", content=" + content + ", bno=" + bno + ", uno=" + uno + ", bname=" + bname + "]";
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
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
}
