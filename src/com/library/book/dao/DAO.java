package com.library.book.dao;
/*
* 
*BookDAO 接口 ，定义 BookDAO的基本操作，由 BookBaseDAO 提供实现
*
*<T> 实际操作的泛型类型
*/

import java.awt.print.Book;
import java.io.IOException;
import java.util.List;

import javax.print.attribute.standard.MediaName;
import javax.websocket.Session;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;

import com.library.book.po.*;
import com.library.sql.sqlPro;
import com.woniuxy.bean.User;

import jdk.nashorn.internal.runtime.regexp.joni.ast.BackRefNode;

public interface DAO {
	/*
	 * 用户登录 OK
	 */
	@Select("select pass from login where uname=#{account}")
	public String login(User user) ;

	
	@Select("select uno from login where uname=#{uname}")
	public Integer selectUById(Bookinfo bookinfo) ;
	
	@Select("select * from bookinfo where bno=#{bno}")
	public Bookinfo selectById(Bookinfo bookinfo) ;
	/*
	 * 删除book操作 OK
	 */
	@Delete("delete from bookinfo where bno=#{bno}")
	public void delete(Bookinfo bookinfo) ;

	/*
	 * 增加book操作 Ok
	 */
	@Insert("insert into bookinfo (price,writer,company,content) values(#{price},#{writer},#{company},#{content});")
	public void addBook(Bookinfo bookinfo) ;

	/*
	 * 借阅操作 采用xml代理 先更新 再插入
	 */
	@Update("update bookinfo set quantity=quantity-1 where bno=#{bno}")
	public void toBorrow(Bookinfo bookinfo) ;
	@Insert("insert into borrow (uno,bno,ifs) values(#{uno},#{bno},1)")
	public void toBorrowI(Bookinfo bookinfo) ;
	/*
	 * 修改操作 bug:,问题，解决方案： set设初始值
	 */
	@Update({ "<script>", "update  bookinfo ",
	     	"set price=price",
	     	"<when test='price!=null'>",
	     	",price=#{price} ",
			"</when>",
			"<when test='writer!=null'>",
			", writer=#{writer}", 
			"</when>",
			"<when test='bname!=null'>",
			", bname=#{bname}", 
			"</when>",
			"<when test='publication!=null'>",
			",publication=#{publication}", 
			"</when>", "<when test='company!=null'>",
			",company=#{company}", "</when>",
			"<when test='content!=null'>", 
			",contet=#{content}",
			"</when>",
			"where bno=#{bno}", 
			"</script>" })
	public void toUpdate(Bookinfo bookinfo) ;

	/*
	 * 查询借阅信息
	 */
	@Select("select bookinfo.bno,date ,bname from borrow INNER JOIN  login on  borrow.uno=login.uno\r\n"
			+ "INNER JOIN  bookinfo on borrow.bno=bookinfo.bno where ifs=1 and login.uname=#{uname} limit #{pageNum},#{pageSize}")
	public  List<Borrow> selectBorrow(Page page) ;

	/*
	 * 查询所有用户的借阅信息
	 */
	@Select("select uname ,date ,bname from borrow INNER JOIN  login on  borrow.uno=login.uno\r\n"
			+ "INNER JOIN  bookinfo on borrow.bno=bookinfo.bno where ifs=1 limit #{pageNum},#{pageSize} ")
	public List<Borrow> selectAllBorrow(Page page) ;

	/*
	 * 还book操作
	 */
	@UpdateProvider(type = sqlPro.class, method = "returnBook")
	public void returnBook(Bookinfo bookinfo) ;

	@UpdateProvider(type = sqlPro.class, method = "reBook")
	public void returnBookT(Bookinfo bookinfo) ;

	/*
	 * 页面展示
	 * 
	 * 
	 * 
	 */
	@Select("select * from bookinfo limit #{pageNum},#{pageSize}")
	public List<Bookinfo> showBook(Page page) ;
}