package com.coderbd.scdb.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.coderbd.scdb.web.dto.User;
import com.coderbd.scdb.web.dto.repository.UserRepository;

@Controller
public class HomeController {

	@Autowired
	private UserRepository userRepository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showHome() {
		return "home";
	}
	
	@RequestMapping(value = "/users")
	public String userListPage(Model model) {
		List<User> userList = userRepository.findAll();
		System.out.println(userList);
		
		model.addAttribute("allUsers",userList);
		return "user";
	}
}
