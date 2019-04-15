package com.library.book.dao.impl;

import java.awt.print.Book;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.jdbc.SQL;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.library.book.dao.DAO;
import com.library.book.po.Bookinfo;
import com.library.book.po.Borrow;
import com.library.book.po.Login;
import com.library.book.po.Page;
import com.library.util.MyBatisUtil;
import com.woniuxy.bean.User;

import jdk.nashorn.internal.runtime.options.LoggingOption;

public class DAOImpl implements DAO {
	private DAO dao;

	
	public DAO getDao() {
		return dao;
	}

	public void setDao(DAO dao) {
		this.dao = dao;
	}

	@Override
	public String login(User user)  {

		return dao.login(user);
	}

	@Override
	public List<Bookinfo> showBook(Page page)  {
		return dao.showBook(page);
		/* return getSession().getMapper(DAO.class).showBook(page); */

	}

	

	@Override
	public List<Borrow> selectAllBorrow(Page page)  {
		
		return dao.selectAllBorrow( page);
		/* return getSession().getMapper(DAO.class).selectAllBorrow(); */

	}

	@Override
	public void delete(Bookinfo bookinfo)  {
		  dao.delete(bookinfo);
	}

	@Override
	public void addBook(Bookinfo bookinfo)  {
		dao.addBook(bookinfo);
		/*
		 * session = getSession(); session.getMapper(DAO.class).addBook(book);
		 * session.commit();
		 */
	}

	@Override
	public void toBorrow(Bookinfo bookinfo)  {
		
		dao.toBorrow(bookinfo);
	}

	@Override
	public void toUpdate(Bookinfo bookinfo)  {
		  dao.toUpdate(bookinfo);
	

	}

	@Override
	public void returnBook(Bookinfo bookinfo)  {
		dao.returnBook(bookinfo);

	}

	@Override
	public void returnBookT(Bookinfo bookinfo)  {
		dao.returnBookT(bookinfo);
	}

	@Override
	public Bookinfo selectById(Bookinfo bookinfo) {
		// TODO Auto-generated method stub
		return dao.selectById(bookinfo);
	}

	@Override
	public List<Borrow> selectBorrow(Page page) {
		
		return dao.selectBorrow(page);
	}

	@Override
	public void toBorrowI(Bookinfo bookinfo) {
		dao.toBorrowI(bookinfo);
		
	}

	@Override
	public Integer selectUById(Bookinfo bookinfo) {
		// TODO Auto-generated method stub
		return dao.selectUById(bookinfo);
	}

}
