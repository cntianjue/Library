package com.library.book.po;

public class Page {
private int pageSize=10;
private int pageNum=0;    
private int pageTotal;   //总记录数
private int pageNow;
private int pageCount;  //总页数
private String uname;

public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public int getPageCount() {
	return pageCount;
}
public void setPageCount(int pageCount) {
	this.pageCount = pageCount;
}
public int getPageTotal() {
	return pageTotal;
}
public void setPageTotal(int pageTotal) {
	this.pageTotal = pageTotal;
}
public int getPageNow() {
	return pageNow;
}
public void setPageNow(int pageNow) {
	this.pageNow = pageNow;
}
public void setPageNum(int pageNum) {
	this.pageNum = pageNum;
}
public int getPageSize() {
	return pageSize;
}
public void setPageSize(int pageSize) {
	this.pageSize = pageSize;
}
@Override
public String toString() {
	return "Page [pageSize=" + pageSize + ", pageNum=" + pageNum + "]";
}
public int getPageNum() {
	return pageNum*pageSize;
}

}
