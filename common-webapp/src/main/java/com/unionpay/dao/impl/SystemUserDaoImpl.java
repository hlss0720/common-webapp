package com.unionpay.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.unionpay.dao.SystemUserDao;
import com.unionpay.entity.SystemUser;

@Repository
public class SystemUserDaoImpl implements SystemUserDao {
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public SystemUser findUser(Long id) {
		return sqlSession.selectOne("com.unionpay.entity.SystemUser.selectById", id);
	}
}
