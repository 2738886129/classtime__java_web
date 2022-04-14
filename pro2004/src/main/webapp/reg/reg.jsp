<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册</title>
</head>
<body>
<!-- 	<form action="doreg.jsp"> -->
	<form action="../regServlet">	
		<label>用户名：</label><input type="text" name="uname" /><br>
		<label>密码：</label><input type="password" name="upassword" /><br>
		<label>姓名：</label><input type="text" name="utruename" /><br>
		<label>性别：</label><input type="radio" name="usex" value="男" checked="checked"/>男
							<input type="radio" name="usex" value="女"/>女<br>
		<label>年龄：</label>
			<select name="uage">
				<option value="10" selected>10</option>
				<option value="20">20</option>
				<option value="30">30</option>
				<option value="40">40</option>
				<option value="50">50</option>
			</select><br>
		<label>爱好：</label>
		<input type="checkbox" name="ufavor" value="读书">读书
		<input type="checkbox" name="ufavor" value="运动">运动
		<input type="checkbox" name="ufavor" value="听音乐">听音乐<br>
		<input type="submit" value="注册">
		<input type="reset" value="取消">	
	</form>
</body>
</html>