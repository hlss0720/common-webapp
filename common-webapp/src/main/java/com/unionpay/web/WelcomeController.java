package com.unionpay.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.unionpay.service.WelcomeService;

@Controller
public class WelcomeController {

	@Value("${jdbc.username}")
	private String username;
	
	@Autowired
	private WelcomeService welcomeService;

	@RequestMapping(path="/showMessage",method=RequestMethod.GET) 
	public String postWelcome(Model model) {
		welcomeService.welcome(username);
		model.addAttribute("message", username);
		return "showMessage";
	}
}
