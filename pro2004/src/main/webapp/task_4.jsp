<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>4.编程实现：在页面上输出斐波那契数列的前20个数</h1>
	<%
		int a=1,b=1;
		out.write(1+"&nbsp&nbsp"+1+"&nbsp&nbsp");
		for(int i=3;i<=20;i++)
		{
			int c=a+b;
			a=b;
			b=c;
			out.write(c+"&nbsp&nbsp");
		}
	%>
</body>
</html>