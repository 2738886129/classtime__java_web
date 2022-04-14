<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>第一个JSP案例</title>
</head>
<body>
<h1>输出水仙花数</h1>
	<%
		int ge,shi,bai;
		for(int i=100;i<1000;i++){
			ge=i%10;
			shi=i/10%10;
			bai=i/100;
			if(i==ge*ge*ge+shi*shi*shi+bai*bai*bai)
				out.write(i+"&nbsp");
		}
	%>
</body>
</html>