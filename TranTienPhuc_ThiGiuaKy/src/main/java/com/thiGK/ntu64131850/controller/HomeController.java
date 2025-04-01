package com.thiGK.ntu64131850.controller;

import com.thiGK.ntu64131850.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    TopicService topicService;


    @GetMapping("/")
    public String home() {
        return "pages/admin";
    }
    @GetMapping("/topic/all")
    public String topicAll(ModelMap model) {
        model.addAttribute("topics", topicService.getAllTopics());
        return "pages/danhsachtopic";
    }
    @GetMapping("/topic/new")
    public String topicNew() {
        return "pages/themTopic";
    }
}
