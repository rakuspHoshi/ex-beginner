package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.domain.User;
import com.example.form.UserForm;


@Controller
@RequestMapping("/exam04")
public class Exam04Controller {
	
	@ModelAttribute
	public UserForm setUpForm() {
		return new UserForm();
	}
	
	@RequestMapping("")
	public String index() {
		return "exam04";
	}
	
	@RequestMapping("/create")
	public String create(UserForm form, Model model) {
		User user = new User();
		user.setName(form.getName());
		user.setAge(form.getAge());
		user.setComment(form.getComment());
		
		model.addAttribute("user", user);
		
		return "exam04-result";
	}

}
