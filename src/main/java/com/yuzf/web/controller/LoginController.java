package com.yuzf.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yuzf.pojo.User;

//@RestController
@Controller
@ResponseBody
@RequestMapping("/test")
public class LoginController {

	
	@GetMapping("/get")
	public User get() {
		
		
		User user = new User();
		user.setUsername("jamesharden");
		user.setPassword("123456");
		return user;
	}
	
}
