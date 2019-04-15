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
	<div class="login">
		<form action="user_login" method="post" enctype="multipart/form-data">
			账号 <input type="text" name="user.account" id="account"> <font
				color="red" size="2"> <s:fielderror fieldName="account">
				</s:fielderror></font> <br>密码 <input type="password" name="user.pass"
				id="pass"><br> <font color="red"><s:fielderror
					fieldName="pass">
				</s:fielderror></font> <br>
			<br>
			<div class="sub">
				<input type="submit" value="登录" >
			</div>
		</form>
	</div>

</body>
</html>