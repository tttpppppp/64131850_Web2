package com.thiGK.ntu64131850.controller;

import com.thiGK.ntu64131850.model.Student;
import com.thiGK.ntu64131850.model.Topic;
import com.thiGK.ntu64131850.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/student/all")
    public String topicAll(ModelMap model) {
        model.addAttribute("students", studentService.getAllStudents());
        return "pages/danhSachSinhVien";
    }

    @GetMapping("/student/new")
    public String studentNew() {
        return "pages/themHocSinh";
    }
    @PostMapping("/student/new")
    public String themSinhVienDb(ModelMap model ,
                                 @RequestParam String id ,
                                 @RequestParam String name ,
                                 @RequestParam String groupid,
                                 RedirectAttributes redirectAttributes) {
        boolean isSuccess = studentService.addStudent(new Student(id, name, groupid));
        if(isSuccess) {
            redirectAttributes.addFlashAttribute("success", "Thêm student  thành công");
            return "redirect:/student/all";
        }
        redirectAttributes.addFlashAttribute("success", "Thêm student thất bại");
        return "pages/themHocSinh";
    }
    @GetMapping("/student/view/{id}")
    public String studentView(@PathVariable String id , ModelMap model) {
         Student student = studentService.getStudent(id);
        if(student == null) {
            return "redirect:/student/all";
        }
        model.addAttribute("student" , studentService.getStudent(id));
        return "pages/chiTietTopic";
    }
    @GetMapping("/student/delete/{id}")
    public String studentDelete(@PathVariable String id , ModelMap model , RedirectAttributes redirectAttributes) {
        boolean isSuccess = studentService.deleteStudent(id);
        if(isSuccess) {
            redirectAttributes.addFlashAttribute("success", "Xóa topic  thành công");
            return "redirect:/student/all";
        }
        redirectAttributes.addFlashAttribute("success", "Xóa topic  thành công");
        return "redirect:/student/all";
    }
}
