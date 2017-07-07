package com.unionpay.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.unionpay.entity.SystemUser;
import com.unionpay.service.SystemUserService;

@Controller
public class SystemUserController {

	@Autowired
	private SystemUserService systemUserService;

	@RequestMapping(path = "/showMessage", method = RequestMethod.GET)
	public String toUser(Model model) {
		SystemUser findUser = systemUserService.findUser(19L);
		model.addAttribute("message", findUser.getUsername());
		return "showMessage";
	}
}
