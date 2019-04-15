package com.library.action;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.library.book.dao.DAO;
import com.library.book.po.Book;
import com.library.book.po.Bookinfo;
import com.library.book.po.Borrow;
import com.library.book.po.Login;
import com.library.book.po.Page;
import com.library.book.service.BookService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.woniuxy.bean.User;

public class UserAction extends ActionSupport {
	private DAO bookService;
	private List<Bookinfo> Books;
	private User user;
	private Bookinfo bookinfo;
	private Page page;
	private List<Borrow> borrow;
	private Login login;

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public List<Borrow> getBorrow() {
		return borrow;
	}

	public void setBorrow(List<Borrow> borrow) {
		this.borrow = borrow;
	}

	public List<Bookinfo> getBooks() {
		return Books;
	}

	public void setBooks(List<Bookinfo> books) {
		Books = books;
	}

	public DAO getBookService() {
		return bookService;
	}

	public void setBookService(DAO bookService) {
		this.bookService = bookService;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Page getPage() {
		return page;
	}

	public void setPage(Page page) {
		this.page = page;
	}

	public Bookinfo getBookinfo() {
		return bookinfo;
	}

	public void setBookinfo(Bookinfo bookinfo) {
		this.bookinfo = bookinfo;
	}

	// 数据校验的方法：如果校验失败会返回input
	public void validateLogin() {
		System.out.println("正在进行校验.....");
		// 必须大于0
		// 用户名必须是在[6,10]位之间的字符串

		if (user.getAccount().equals("")) {
			super.addFieldError("account", "用户名不能为null");

		}
		/*
		 * if (user.getAccount().length() < 6 || user.getAccount().length() > 10) {
		 * super.addFieldError("account", "用户名长度必须在6-10个字符之间"); } //
		 * 密码：密码的第一个字符必须是大写字母，第二个必须是小写字母，后面应该跟着6-10个数字 String regex =
		 * "[A-Z][a-z]\\d{6,10}"; if (!user.getPass().matches(regex)) {
		 * super.addFieldError("pass", "密码的第一个字符必须是大写字母，第二个必须是小写字母，后面应该跟着6-10个数字"); }
		 */
		super.validate();
		System.out.println("校验完成");
	}

	public String login() {
		System.out.println(user);
		String a = bookService.login(user);
		if (a.equals(user.getPass())) {
			return "go";
		}
		return "input";

	}

	public String delete() {
		bookService.delete(bookinfo);
		return "success";

	}

	public String selectById() {
		bookinfo = bookService.selectById(bookinfo);
		System.out.println(bookinfo);
		return "show";
	}

	public String toUpdate() {
		bookService.toUpdate(bookinfo);
		return "go";
	}

	public String addBook() {
		bookService.addBook(bookinfo);
		return "go";
	}

	public String selectAllBorrow() {
		borrow = bookService.selectAllBorrow(page);

		return "users";

	}

	public String selectBorrow() {
		String a = login.getUname();
		page.setUname(a);
		borrow = bookService.selectBorrow(page);
		return "users";
	}

	public String toBorrow() {
		Bookinfo bookinfo1 = new Bookinfo();
		bookinfo1.setUno(bookService.selectUById(bookinfo));
		bookinfo1.setBno(bookinfo.getBno());
		bookService.toBorrow(bookinfo1);

		return "go";
	}

	public String returnBook() {
		System.out.println("进入方法");
		Bookinfo bookinfo1 = new Bookinfo();
		bookinfo1.setUno(bookService.selectUById(bookinfo));
		bookinfo1.setBno(bookinfo.getBno());
		bookService.returnBook(bookinfo);
		return "goo";
	}

	public String showBook() {
		/*
		 * List<Bookinfo> Books=bookService.showBook(page); Map<String, Object>session =
		 * ActionContext.getContext().getSession(); session.put("Books", Books);
		 */
		Books = bookService.showBook(page);

		return "success";

	}
}
