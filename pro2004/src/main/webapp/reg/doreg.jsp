<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		String name=request.getParameter("uname");
		//String sex=request.getParameter("usex");
		//String age=request.getParameter("uage");
		
		//String[] ufavors=request.getParameterValues("ufavor"); 
		
		session.setAttribute("uname",name);
		
		response.sendRedirect("result.jsp");
	%>
	
	<%-- <label>姓名：</label><%=name %><br>
	<label>性别：</label><%=sex %><br>
	<label>年龄：</label><%=age %><br>
	<label>爱好：</label>
	<%
		for(int i=0;i<ufavors.length;i++){
			
	%>		
		
		<%= ufavors[i] %>
		
	<%		
		}
	%> --%>
	
	<hr>
	<label>协议：</label><%=request.getProtocol() %><br>
	<label>服务器名称：</label><%=request.getServerName() %><br>
	<label>访问客户端地址：</label><%=request.getRemoteAddr() %><br>
</body>
</html>