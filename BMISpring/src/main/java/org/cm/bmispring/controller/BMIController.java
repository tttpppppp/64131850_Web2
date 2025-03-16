package org.cm.bmispring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BMIController {
    @GetMapping("/")
    public String index() {
        return "bmi";
    }
    @PostMapping("/tinhBmi")
    public String tinhBmi(@RequestParam double chieuCao, @RequestParam double canNang, ModelMap model) {
        double bmi = canNang / ((chieuCao / 100) * (chieuCao / 100));
        String ketQua;
        if (bmi < 18.5) ketQua = "Gầy";
        else if (bmi < 24.9) ketQua = "Bình thường";
        else if (bmi < 29.9) ketQua = "Thừa cân";
        else ketQua = "Béo phì";
        String bmiFormatted = String.format("%.2f", bmi);
        model.addAttribute("bmi", bmiFormatted);
        model.addAttribute("ketQua", ketQua);
        return "bmi";
    }

}
