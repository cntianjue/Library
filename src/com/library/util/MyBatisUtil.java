package com.library.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	private static ThreadLocal<SqlSession> threadLocal = new ThreadLocal<>();// 用于将session绑定到线程上
	public static SqlSession getSession() throws IOException {
		InputStream inputStream = Resources.getResourceAsStream("mybatis-config.xml");
		// 2 创建工厂类对象
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		// 3 创建session对象，操作数据库的对象
		SqlSession session = threadLocal.get();
		if (session == null) {
			session = factory.openSession();
			threadLocal.set(session);

		}
		return session;
	}

	public static void close() {
		SqlSession session = threadLocal.get();
		if (session != null) {
			session.close();
			threadLocal.remove();// 将session从线程上移除
		}
	}
}
