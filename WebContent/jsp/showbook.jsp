<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<script type="text/javascript" src="../public/js/jquery.1.9.1.js"></script>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	
	<table style="display:none" id="aa"></table>
	<a href="selectAllBrrow.jsp"> 查询所有借阅</button>
	<a href="addbook.jsp"> 添加图书</a>
	
	<a href="selectBorrow.jsp?uno=${param.uno}"> 查询本人借阅</a>
	
	

   <a  onclick="before()" >上一页</a> <input type="text" size="1" value=""/><a  onclick="after()">下一页</a>
    
    
    
    
    
    
<script type="text/javascript">
	$(document).ready(function () {
		var count=0;
		toborrow=function(bid) {
			$.ajax({
				url : "user_toBorrow",
				type : "post",
				data : {
					"bookinfo.bno" :bid,
					"bookinfo.uname":"${param.uno}",
				},
			
				success : function(data) {
				
						window.location.href = "showbook.jsp?uno=${param.uno}";
				}
				
			});
		}
		todelete=function(bid) {
			$.ajax({
				url : "user_delete",
				type : "post",
				data : {
					"bookinfo.bno" :bid,
				
				},
				success : function(data) {
				
						window.location.href = "showbook.jsp";
				}
				
			});
		}
		 after=function() {
			count++;
			doshow(count);
		}
		 before=function() {
			count--;
			doshow(count);
		}
		function doshow(page) {
			$.ajax({
				url : "user_showBook",
				type : "post",
				data : {
				"page.pageNum":page,
				},
				  success : function(data) {
					
					  var table = $("#aa");
					
					  table.empty();//删除子元素
						
						for(var i=0;i<data.length;i++){
						  var book=data[i];
						  var tr = $("<tr></tr>");
							var bname = $("<td></td>").text(book.bname);
							var writer = $("<td></td>").text(book.writer);
							var price = $("<td></td>").text(book.price);
							var company= $("<td></td>").text(book.company); 
							var img = $("<td></td>").text(book.img);
							var quantity = $("<td></td>").text(book.quantity);
							var de = $("<a onclick='todelete("+book.bno+")'></a>").text("删除");
							var bo = $("<a onclick='toborrow("+book.bno+")'></a>").text("借阅");
							var boo=$("<a href='update.jsp?bno="+book.bno+"'></a>").text("修改");
							tr.append(bname);   
							tr.append(writer);
							tr.append(price);
							tr.append(company);
						/* 	tr.append(img); */
							tr.append(quantity);
						    tr.append(de); 
						 
						    tr.append(bo);
						    tr.append(boo);
							table.append(tr)
						}
					  table.show();
					}
				
				
			});
		}
		doshow(0);
	});
</script>
</body >
</html>

