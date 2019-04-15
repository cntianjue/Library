<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<style type="text/css">
.login {
	
}

.sub {
	height: 50px;
	width: 50px;
}
</style>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<div class="user_addBook">
		<form action="user_addBook" method="post"
			enctype="multipart/form-data">
			书名   &nbsp&nbsp&nbsp:<input type="text" name="bookinfo.bname" id="account"> <br>
			作者&nbsp&nbsp&nbsp :<input type="text" name="bookinfo.writer" id="pass"><br>
			价格 &nbsp&nbsp&nbsp:<input type="text" name="bookinfo.price" id="pass"><br>
			出版日期: <input type="date" name="bookinfo.publication" id="pass"><br>
			出版商 &nbsp:<input type="text" name="bookinfo.company" id="pass"><br>
			简介&nbsp&nbsp&nbsp:<input type="textarea" name="bookinfo.content" id="pass"><br>
			封面&nbsp&nbsp&nbsp:<input type="file"> <br>
			<div class="sub">
				<input type="submit" value="添加">
			</div>
		</form>
	</div>

</body>
</html>