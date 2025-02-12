package test.controller;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "bmi", urlPatterns = "/bmi")
public class BMI extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/bmi.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            String weightStr = req.getParameter("weight");
            String heightStr = req.getParameter("height");
            if (weightStr == null || heightStr == null || weightStr.isEmpty() || heightStr.isEmpty()) {
                req.setAttribute("error", "Vui lòng nhập đầy đủ thông tin!");
                req.getRequestDispatcher("/bmi.jsp").forward(req, resp);
                return;
            }
            double weight = Double.parseDouble(weightStr);
            double height = Double.parseDouble(heightStr);
            if (weight <= 0 || height <= 0) {
                req.setAttribute("error", "Cân nặng và chiều cao phải lớn hơn 0!");
                req.getRequestDispatcher("/bmi.jsp").forward(req, resp);
                return;
            }
            double bmi = weight / (height * height);
            String status = getBMIStatus(bmi);
            req.setAttribute("bmi", bmi);
            req.setAttribute("status", status);
            req.getRequestDispatcher("/bmi.jsp").forward(req, resp);
        } catch (NumberFormatException e) {
            req.setAttribute("error", "Vui lòng nhập số hợp lệ!");
            req.getRequestDispatcher("/bmi.jsp").forward(req, resp);
        }
    }
    private String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Gầy";
        } else if (bmi < 24.9) {
            return "Bình thường";
        } else if (bmi < 29.9) {
            return "Thừa cân";
        } else {
            return "Béo phì";
        }
    }
}
