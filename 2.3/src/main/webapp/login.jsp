<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Trang Đăng Nhập</title>
</head>
<body>
    <%
        String username = request.getParameter("username"); 
        String password = request.getParameter("password");

        if (username != null && !username.isEmpty() && password != null && !password.isEmpty()) {
            if (username.equals("ABC") && password.equals("MNK")) {
            	 response.sendRedirect(request.getContextPath() +"/userprofile.html");
            } else {
    %>
                <h3 style="color: red;">Sai tên đăng nhập hoặc mật khẩu!</h3>
    <%

				//request.getRequestDispatcher("/login.html").forward(request, response);
                response.sendRedirect(request.getContextPath() + "/login.html");
            }
        } else {
    %>
            <h3 style="color: red;">Vui lòng nhập đầy đủ thông tin!</h3>
    <%
        }
    %>
</body>
</html>
