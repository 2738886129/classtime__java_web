<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>2、编程实现：在页面上输出1~100之间所有质数</h1>
	<%
		for(int i=1;i<=100;i++)
		{
			if(i==1) continue;
			
			int j=0;
			for(j=2;j<=i/2;j++)
			{
				if(i%j==0)
					break;
			}
			if(j==i/2+1)
			{
				out.write(i+"&nbsp");
			}
			
		}
	%>
</body>
</html>