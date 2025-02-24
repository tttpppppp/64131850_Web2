<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Nhập hai số</title>
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
        }
        body {
            font-family: 'Poppins', sans-serif;
            background: linear-gradient(to right, #00c6ff, #0072ff);
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
            margin-bottom: 15px;
            font-size: 22px;
            font-weight: bold;
        }
        .form-group {
            display: flex;
            flex-direction: column;
            align-items: flex-start;
            margin-bottom: 15px;
        }
        label {
            font-weight: 600;
            margin-bottom: 5px;
            color: #333;
        }
        input {
            width: 100%;
            padding: 10px;
            border: 1px solid #ccc;
            border-radius: 8px;
            font-size: 16px;
            transition: 0.3s;
        }
        input:focus {
            border-color: #0072ff;
            outline: none;
            box-shadow: 0 0 8px rgba(0, 114, 255, 0.3);
        }
        button {
            background: #0072ff;
            color: white;
            border: none;
            padding: 12px;
            width: 100%;
            border-radius: 8px;
            cursor: pointer;
            font-size: 18px;
            font-weight: bold;
            transition: 0.3s;
        }
        button:hover {
            background: #0056cc;
            box-shadow: 0 5px 15px rgba(0, 114, 255, 0.4);
        }
    </style>
</head>
<body>

    <div class="container">
        <h2>Nhập hai số</h2>
        <form action="process.jsp" method="post">
            <div class="form-group">
                <label for="num1">Số thứ nhất:</label>
                <input type="number" id="num1" name="num1" required>
            </div>

            <div class="form-group">
                <label for="num2">Số thứ hai:</label>
                <input type="number" id="num2" name="num2" required>
            </div>

            <div class="form-group">
                <label for="operation">Phép toán (+, -, *, /):</label>
                <input type="text" id="operation" name="operation" required maxlength="1" pattern="[+\-*/]">
            </div>

            <button type="submit">Tính toán</button>
        </form>
    </div>

</body>
</html>
