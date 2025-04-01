package com.thiGK.ntu64131850.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/admin")
    public String home() {
        return "pages/admin";
    }
}
