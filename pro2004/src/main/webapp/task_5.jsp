<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<h1>5.编程实现排序</h1>
	<%
		int [] arr={1,5,2,9,4,3};
		
// 		输出原数组
		out.write("原数组为：");
		for(int i=0;i<arr.length;i++)
		{
			out.write(arr[i]+"&nbsp&nbsp&nbsp");
		}
		out.write("<br>");
	
// 		冒泡排序
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
		}
		
// 		输出排序后数组
		out.write("排序后数组为:");
		for(int i=0;i<arr.length;i++)
		{
			out.write(arr[i]+"&nbsp&nbsp&nbsp");
		}
		out.write("<br>");
	%>
</body>
</html>