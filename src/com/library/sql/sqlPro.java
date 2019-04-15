package com.library.sql;

import java.nio.channels.NetworkChannel;

import org.apache.ibatis.jdbc.SQL;

import com.library.book.po.Book;

import jdk.nashorn.api.scripting.NashornScriptEngineFactory;

public class sqlPro {
	private final static String tableNameOne = "bookinfo";
	private final static String tableNameTwo = "borrow";

	public  static String returnBook(Book book) {
		SQL sql = new SQL() {
			{
				UPDATE(tableNameOne);
				SET("quantity=quantity+1");
				WHERE("bno=#{bno}");
			}
		};

         reBook(book);
		return sql.toString();
		
	}
	public static String reBook(Book book) {
		SQL sql1 = new SQL() {
			{
				UPDATE(tableNameTwo);
				SET("ifs=0");
				WHERE("bno=#{bno} and uno=#{uno}");
			}
		};
		return sql1.toString();
	}

}
