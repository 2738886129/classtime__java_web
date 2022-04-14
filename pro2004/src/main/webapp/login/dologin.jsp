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
		String passerword=request.getParameter("upassword");
// 		System.out.println(name+"\n"+passerword);
		
// 		if("shangyuhang".equals(name) && "1111".equals(passerword))
		if("尚宇航".equals(name) && "1111".equals(passerword))
		{
			session.setAttribute("uname",name);
			response.sendRedirect("result.jsp");
		}
		else
		{
			//1 start
// 			out.write("<script>alert('用户名或密码错误！');</script>");
// 			out.write("<script>history.go(-1);</script>");
			//1 end
			
			
			//2 start
			%>
			<!--javascript脚本 -->
			<script type="text/javascript">
				//弹窗
				alert("用户名或密码错误！");
				//返回上一页
				history.go(-1);
			</script>
		<%
			//2 end
			
		}

	%>
	
	<%-- <label>姓名：</label><%=name %><br>
	<label>密码：</label><%=passerword %><br> --%>
</body>
</html>