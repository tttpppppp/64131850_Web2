package org.cm.tochucgiaodien.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientController {
    @GetMapping("/")
    public String home() {
        return "client/pages/home";
    }
    @GetMapping("/lienhe")
    public String lienhe() {
        return "client/pages/contact";
    }
}
