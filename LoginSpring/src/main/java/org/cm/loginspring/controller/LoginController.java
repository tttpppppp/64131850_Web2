package org.cm.loginspring.controller;

import org.cm.loginspring.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class LoginController {
    @Autowired
    private LoginService loginService;

    @GetMapping("/login")
    public String login() {
        return "login";
    }
    @PostMapping("/login")
    public String loginPost(ModelMap m , @RequestParam("email") String email, @RequestParam("password") String password) {
        if (email == null || email.isEmpty() || password == null || password.isEmpty()) {
            m.addAttribute("err", "Vui lòng nhập đầy đủ thông tin");
            return "login";
        }
        boolean isSuccess = loginService.login(email, password);
        if (isSuccess) {
            return "redirect:/home";
        }
        m.addAttribute("err", "Sai email hoặc mật khẩu!");
        return "login";
    }
}
