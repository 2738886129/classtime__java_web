<%@page import="entity.User"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>注册</title>
</head>
<body>
	<%
		User user=(User)session.getAttribute("user");
	%>

	<form action="../UpdateServlet">
		<!-- hidden意味着该标签被隐藏 -->
		<input type="hidden" name="id" value="<%= user.getId() %>" />
		<label>用户名：</label><input type="text" name="uname" value="<%= user.getUname() %>"/><br>
		<label>密码：</label><input type="password" name="upassword" value="<%= user.getUpwd() %>"/><br>
		<label>姓名：</label><input type="text" name="utruename" value="<%= user.getTruename() %>"/><br>
		<label>性别：</label><input type="radio" name="usex" value="男" 
									<% if("男".equals(user.getUsex())){ %>
										checked="checked" <%}%>/>男
							<input type="radio" name="usex" value="女"
									<% if("女".equals(user.getUsex())){ %>
												checked="checked" <%}%>/>女<br>
		<label>年龄：</label>
			<select name="uage">
				<option value="10" <%if(10==user.getUAge()){%>
								selected <%} %> >10</option>
				<option value="20" <%if(20==user.getUAge()){%>
								selected <%} %> >20</option>
				<option value="30" <%if(30==user.getUAge()){%>
								selected <%} %> >30</option>
				<option value="40" <%if(40==user.getUAge()){%>
								selected <%} %> >40</option>
				<option value="50" <%if(50==user.getUAge()){%>
								selected <%} %> >50</option>
			</select><br>
		<label>爱好：</label>
		<input type="checkbox" name="ufavor" value="读书" <%if(user.getUfavor()!=null && user.getUfavor().indexOf("读书")>=0){ %>
									checked <% } %> >读书
		<input type="checkbox" name="ufavor" value="运动" <%if(user.getUfavor()!=null && user.getUfavor().indexOf("运动")>=0){ %>
									checked <% } %> >运动
		<input type="checkbox" name="ufavor" value="听音乐" <%if(user.getUfavor()!=null && user.getUfavor().indexOf("听音乐")>=0){ %>
									checked <% } %> >听音乐<br>
		<input type="submit" value="修改">
		<input type="reset" value="取消">	
	</form>
</body>
</html>