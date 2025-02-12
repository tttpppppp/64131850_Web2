<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Tính BMI</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-color: #f8f9fa;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        
        .container {
            max-width: 400px;
            background: #ffffff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            text-align: center;
        }

        h2 {
            font-weight: bold;
            color: #007bff;
            margin-bottom: 20px;
        }

        .form-label {
            font-weight: 600;
            color: #333;
            text-align: left;
            display: block;
        }

        .form-control {
            border-radius: 8px;
            padding: 10px;
        }

        .btn-primary {
            width: 100%;
            font-size: 16px;
            padding: 10px;
            border-radius: 8px;
            background-color: #007bff;
            border: none;
            transition: background 0.3s ease-in-out;
        }

        .btn-primary:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="container">
        <h2>Tính Chỉ Số BMI</h2>
        
        <% String error = (String) request.getAttribute("error"); %>
        <% if (error != null) { %>
            <div class="alert alert-danger"><%= error %></div>
        <% } %>
        
        <form method="post" action="http://localhost:8080/test/bmi">
            <div class="mb-3">
                <label for="weight" class="form-label">Cân nặng (kg):</label>
                <input type="number" class="form-control" id="weight" name="weight" step="0.1">
            </div>
            <div class="mb-3">
                <label for="height" class="form-label">Chiều cao (m):</label>
                <input type="number" class="form-control" id="height" name="height" step="0.01">
            </div>
            <button type="submit" class="btn btn-primary">Tính BMI</button>
        </form>


        <% Double bmi = (Double) request.getAttribute("bmi"); %>
        <% String status = (String) request.getAttribute("status"); %>
        <% if (bmi != null && status != null) { %>
            <div class="alert alert-info mt-4">
                <h4>Kết quả BMI: <%= String.format("%.2f", bmi) %></h4>
                <p>Tình trạng: <strong><%= status %></strong></p>
            </div>
        <% } %>
        
    </div>
</body>
</html>
