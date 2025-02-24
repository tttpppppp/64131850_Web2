<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Kết quả</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        body {
            font-family: 'Poppins', sans-serif;
            background: linear-gradient(to right, #ff758c, #ff7eb3);
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .container {
            background: #ffffff;
            padding: 25px;
            border-radius: 12px;
            box-shadow: 0 5px 15px rgba(0, 0, 0, 0.2);
            text-align: center;
            width: 350px;
        }
        h2 {
            color: #333;
            font-size: 22px;
            font-weight: bold;
            margin-bottom: 15px;
        }
        p {
            font-size: 18px;
            color: #555;
            margin: 5px 0;
        }
        .result {
            font-size: 22px;
            font-weight: bold;
            color: #ff4081;
        }
        .back-btn {
            background: #ff4081;
            color: white;
            border: none;
            padding: 12px;
            width: 100%;
            border-radius: 8px;
            cursor: pointer;
            font-size: 18px;
            font-weight: bold;
            transition: 0.3s;
            margin-top: 15px;
        }
        .back-btn:hover {
            background: #d6336c;
            box-shadow: 0 5px 15px rgba(255, 64, 129, 0.4);
        }
    </style>
</head>
<body>

    <div class="container">
        <h2>Kết quả</h2>

        <%
            int num1 = Integer.parseInt(request.getParameter("num1"));
            int num2 = Integer.parseInt(request.getParameter("num2"));
            String operation = request.getParameter("operation");

            double result = 0;
            String opSymbol = "";

            switch (operation) {
                case "+":
                    result = num1 + num2;
                    opSymbol = " + ";
                    break;
                case "-":
                    result = num1 - num2;
                    opSymbol = " - ";
                    break;
                case "*":
                    result = num1 * num2;
                    opSymbol = " × ";
                    break;
                case "/":
                    if (num2 == 0) {
                        out.println("<p style='color: red;'>Không thể chia cho 0!</p>");
                        opSymbol = "";
                    } else {
                        result = (double) num1 / num2;
                        opSymbol = " ÷ ";
                    }
                    break;
                default:
                    out.println("<p style='color: red;'>Phép toán không hợp lệ!</p>");
            }
        %>

        <% if (!opSymbol.equals("")) { %>
            <p>Số thứ nhất: <strong><%= num1 %></strong></p>
            <p>Số thứ hai: <strong><%= num2 %></strong></p>
            <p class="result">Kết quả: <%= num1 %> <%= opSymbol %> <%= num2 %> = <%= result %></p>
        <% } %>

        <button class="back-btn" onclick="window.history.back()">Quay lại</button>
    </div>

</body>
</html>
