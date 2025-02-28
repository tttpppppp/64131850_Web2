package com.projectmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.projectmvc.model.Person;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class TrangChuController {
	
	@Autowired
	private Person person;
	
	@RequestMapping(value = {"/" , "/trangchu" ,"/home"} , method = RequestMethod.GET)
	public String ViewTrangChu(ModelMap map) {
		map.addAttribute("person",person);
		return "trangchu";
	}
	
	@RequestMapping(value = {"/say-hello"} , method = RequestMethod.GET)
	public ModelAndView trangchu(HttpServletRequest req , HttpServletResponse res) {
		req.setAttribute("person",person);
		return new ModelAndView("trangchu");
	}
	
	
	@RequestMapping("/login")
	@ResponseBody
	public String ViewLogin() {
		return "Login";
	}
}
