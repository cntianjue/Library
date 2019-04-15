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

	<table style="display: none" id="aa"></table>


	<a onclick="before()">上一页</a>
	<input type="text" size="1" value="1" />
	<a onclick="after()">下一页</a>

	<script type="text/javascript">
		$(document).ready(function() {
			var count = 0;

			after = function() {
				count++;
				doshow(count);
			}
			before = function() {
				count--;
				doshow(count);
			}
			function doshow(page) {
				$.ajax({
					url : "user_selectAllBorrow",
					type : "post",
					data : {
						"page.pageNum" : page,
					},
					success : function(data) {
						var table = $("#aa");
						table.empty();//删除子元素
						for (var i = 0; i < data.length; i++) {
							var book = data[i];
							var tr = $("<tr></tr>");
							var bname = $("<td></td>").text(book.bname);
							var uname = $("<td></td>").text(book.uname);
							var date = $("<td></td>").text(book.date);
							var nu = $("<td></td>").text("");
							tr.append(bname);
							tr.append(tr);
							tr.append(nu);
							tr.append(uname);
							tr.append(tr);
							tr.append(nu);
							tr.append(date);
							table.append(tr)
						}
						table.show();
					}
				});
			}
			doshow(0);
		});
	</script>
</body>
</html>