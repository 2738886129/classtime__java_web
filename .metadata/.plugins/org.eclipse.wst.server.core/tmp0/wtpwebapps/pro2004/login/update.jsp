<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<title>注册</title>
</head>
<body>
	<form action="../UpdateServlet">
		<!-- hidden意味着该标签被隐藏 -->
		<input type="hidden" name="id" value="${user.id }" />
		<label>用户名：</label><input type="text" name="uname" value="${user.uname }"/><br>
		<label>密码：</label><input type="password" name="upassword" value="${user.upwd }"/><br>
		<label>姓名：</label><input type="text" name="utruename" value="${user.truename }"/><br>
		<label>性别：</label><input type="radio" name="usex" value="男" 
									<c:if test="${user.usex=='男' }">checked</c:if> />男
							<input type="radio" name="usex" value="女"
									<c:if test="${user.usex=='女' }">checked</c:if> />女<br>
		<label>年龄：</label>
			<select name="uage">
				<option value="10" 
						<c:if test="${user.uage == 10 }">selected</c:if> 
						>10</option>
				<option value="20" 
						<c:if test="${user.uage == 20 }">selected</c:if> 
						>20</option>
				<option value="30" 
						<c:if test="${user.uage == 30 }">selected</c:if> 
						>30</option>
				<option value="40" 
						<c:if test="${user.uage == 40 }">selected</c:if> 
						>40</option>
				<option value="50" 
						<c:if test="${user.uage == 50}">selected</c:if> 
						>50</option>
			</select><br>
		<label>爱好：</label>
		<input type="checkbox" name="ufavor" value="读书" 
				<c:if test="${fn:contains(user.ufavor,'读书')}">checked</c:if>
				>读书
		<input type="checkbox" name="ufavor" value="运动" 
				<c:if test="${fn:contains(user.ufavor,'运动')}">checked</c:if>
				>运动
		<input type="checkbox" name="ufavor" value="听音乐" 
				<c:if test="${fn:contains(user.ufavor,'听音乐')}">checked</c:if>
				>听音乐<br>
		<input type="submit" value="修改">
		<input type="reset" value="取消">	
	</form>
</body>
</html>