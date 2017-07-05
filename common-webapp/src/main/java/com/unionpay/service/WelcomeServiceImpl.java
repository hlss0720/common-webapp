package com.unionpay.service;

import org.springframework.stereotype.Service;

@Service
public class WelcomeServiceImpl implements WelcomeService {


	@Override
	public String welcome(String username) {
		return "hlss"+username;
	}
}
