<%@page import="entity.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 	<label>姓名：</label><%=session.getAttribute("uname")%><br> --%>
	<table>
		<tr><th>用户名</th><th>姓名</th><th>性别</th><th>年龄</th><th>爱好</th></tr>
		<c:forEach var="u" items="${users }">
			<tr>
				<td>${u.uname }</td>
				<td>${u.truename }</td>
				<td>${u.usex }</td>
				<td>${u.uage }</td>
				<td>${u.ufavor }</td>
				<td><a href="../GetCurUser?id=${u.id }">修改</a></td>
				<td><a href="javascript:preDel(${u.id })">删除</a></td>
			</tr>
		</c:forEach>
		
	</table>
	
	<script type="text/javascript">
		function preDel(id) {
			alert("要删除记录的id是："+id);
			if(confirm("确认要删除吗？"))
				location.href="../DelUser?id="+id;
		}
	</script>
	
</body>
</html>
