package com.library.book.service;

import java.io.IOException;
import java.util.List;

import com.library.book.dao.DAO;

import com.library.book.po.Book;
import com.library.book.po.Bookinfo;
import com.library.book.po.Borrow;
import com.library.book.po.Login;
import com.library.book.po.Page;
import com.sun.java_cup.internal.runtime.virtual_parse_stack;
import com.woniuxy.bean.User;

public class BookService implements DAO {
	private DAO daoImpl;
//	= new daoImplImpl();

	public DAO getDaoImpl() {
		return daoImpl;
	}

	public void setDaoImpl(DAO daoImpl) {
		this.daoImpl = daoImpl;
	}

	@Override
	public String login(User user) {
		return daoImpl.login(user);
	}


	@Override
	public void delete(Bookinfo bookinfo) {
		daoImpl.delete(bookinfo);
	}

	@Override
	public void addBook(Bookinfo book) {
		daoImpl.addBook(book);
	}

	@Override
	public void toBorrow(Bookinfo bookinfo) {
		
		daoImpl.toBorrow(bookinfo);
		daoImpl.toBorrowI(bookinfo);
	}

	@Override
	public void toUpdate(Bookinfo bookinfo) {
		daoImpl.toUpdate(bookinfo);
	}

	

	@Override
	public List<Borrow> selectAllBorrow(Page page) {
		return daoImpl.selectAllBorrow(page);
	}

	@Override
	public void returnBook(Bookinfo bookinfo) {
		daoImpl.returnBook(bookinfo);
		daoImpl.returnBookT(bookinfo);
	}

	@Override
	public void returnBookT(Bookinfo bookinfo) {
		
	}

	@Override
	public List<Bookinfo> showBook(Page page) {
		return daoImpl.showBook(page);
	}

	@Override
	public Bookinfo selectById(Bookinfo bookinfo) {
		// TODO Auto-generated method stub
		return daoImpl.selectById(bookinfo);
	}

	@Override
	public List<Borrow> selectBorrow(Page page) {
		
		return daoImpl.selectBorrow(page);
	}

	@Override
	public void toBorrowI(Bookinfo bookinfo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Integer selectUById(Bookinfo bookinfo) {
		return daoImpl.selectUById(bookinfo);
	}

}
