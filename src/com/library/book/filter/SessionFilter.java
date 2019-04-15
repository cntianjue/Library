package com.library.book.filter;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.library.util.MyBatisUtil;


public class SessionFilter implements  Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response ,FilterChain chain)
			throws IOException, ServletException {
		// 1.获取一个sqlsession，并且需要将session绑定到线程上
				SqlSession session = MyBatisUtil.getSession();
				// 2.放行，处理请求
				try {
					chain.doFilter(request, response);
					session.commit();
				} catch (Exception e) {
					session.rollback();
					e.printStackTrace();
				}finally{
					//不管是否出异常都应该关闭session
					MyBatisUtil.close();
				}
		
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	

}
