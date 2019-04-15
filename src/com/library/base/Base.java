package com.library.base;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.library.book.po.Login;
import com.library.book.service.BookService;

public class Base {
	// 通过spring IOC容器获取对象（IOC容器会先创建好对象）
	// 1、读取加载主配置文件:在加载的过程中，spring就会读取配置文件，同时创建对象，
	// 并将这些对象放到ioc容器里面
	public static void main(String[] args) throws IOException {
	System.out.println(1/0);
/*		ApplicationContext context =new ClassPathXmlApplicationContext("spring-context.xml");
		BookService service=context.getBean("bookService",BookService.class);
		String[] names = context.getBeanDefinitionNames();*/
	/*	for (String string : names) {
			System.out.println(string);
		}
		String  result=service.login("admin");
		System.out.println(result);*/
	}
}

