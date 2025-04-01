package com.thiGK.ntu64131850.controller;

import com.thiGK.ntu64131850.model.Topic;
import com.thiGK.ntu64131850.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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
    @PostMapping("/topic/new")
    public String themSinhVienDb(ModelMap model ,
                                 @RequestParam String id ,
                                 @RequestParam String topicName ,
                                 @RequestParam String topicDescription,
                                 @RequestParam String supervisorId,
                                 @RequestParam String typicType ,
                                 RedirectAttributes redirectAttributes) {
        boolean isSuccess = topicService.addTopic(new Topic(id, topicName, topicDescription, supervisorId, typicType));
        System.out.println(id + topicName + topicDescription + supervisorId + typicType);
        if(isSuccess) {
            redirectAttributes.addFlashAttribute("success", "Thêm topic  thành công");
            return "redirect:/topic/all";
        }
        redirectAttributes.addFlashAttribute("success", "Thêm topic thất bại");
        return "pages/themTopic";
    }
    @GetMapping("/topic/view/{id}")
        public String topicView(@PathVariable String id , ModelMap model) {
        Topic topic = topicService.getTopic(id);
        if(topic == null) {
            return "redirect:/topic/all";
        }
        model.addAttribute("topic" , topicService.getTopic(id));
        return "pages/chiTietTopic";
    }
    @GetMapping("/topic/delete/{id}")
    public String topicDelete(@PathVariable String id , ModelMap model , RedirectAttributes redirectAttributes) {
        boolean isSuccess = topicService.deleteTopic(id);
        if(isSuccess) {
            redirectAttributes.addFlashAttribute("success", "Xóa topic  thành công");
            return "redirect:/topic/all";
        }
        redirectAttributes.addFlashAttribute("success", "Xóa topic  thành công");
        return "redirect:/topic/all";
    }
}
