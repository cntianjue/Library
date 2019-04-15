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

	<form action="user_toUpdate" method="post"
		enctype="multipart/form-data">
		<input type="text" id="aa" name="bookinfo.bname" value="" /><br>
		<input type="text" id="bb" name="bookinfo.price" value="" /><br>
		<input type="text" id="cc" name="bookinfo.writer" value="" /><br>
		<input type="text" id="dd" name="bookinfo.company" value="" /><br>
		<input type="text" id="ee" name="bookinfo.img" value="" /><br> <input
			type="hidden" name="bookinfo.bno" value="${param.bno}" /> <input
			type="submit" value="确认修改" />

	</form>
	<script type="text/javascript">
  	 /* todelete=function('"+${param.name}+"'); */
	$(document).ready(function () {
	
		function doshow(bno) {
			$.ajax({
				url : "user_selectById",
				type : "post",
				data : {
					"bookinfo.bno" :bno,
				},
				
				success : function(data) {
					 $('#aa').val(data.bname);
					 $('#bb').val(data.price);
					 $('#cc').val(data.writer);
					 $('#dd').val(data.company);
					 $('#ee').val(data.img);
						} 
			});
		}
	doshow(${param.bno});
	});
		</script>
</body>
</html>