<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<body>

<%! int a = 100; int b = 100; %>

<%
	int c = a + b;
	out.append("Kết quả là: ");
	out.append(String.valueOf(c));
	
%>
	<h2>Hoặc ta có thể xuất theo kiểu expression</h2>
	<%= "Kết quả là: " %>
	<%= c %>
</body>
</html>
