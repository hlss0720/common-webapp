package com.unionpay.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unionpay.dao.SystemUserDao;
import com.unionpay.entity.SystemUser;
import com.unionpay.service.SystemUserService;

@Service
public class SystemUserServiceImpl implements SystemUserService {
	
	@Autowired
	private SystemUserDao systemUserDao;
	
	@Override
	public SystemUser findUser(Long id) {
		return systemUserDao.findUser(id);
	}
}
