package com.example.SB_TruyenDuLieuSangView.controller;

import com.example.SB_TruyenDuLieuSangView.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/user")
    public String user(ModelMap model) {
        User user = new User("64131850" , "Trần Tiến Phúc" , "Nam" , 2004);
        model.addAttribute("user", user);
        return "user";
    }
}
