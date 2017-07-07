package com.unionpay.dao;

import com.unionpay.entity.SystemRole;

public interface SystemRoleDao {
    int deleteByPrimaryKey(Long id);

    int insert(SystemRole record);

    int insertSelective(SystemRole record);

    SystemRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SystemRole record);

    int updateByPrimaryKey(SystemRole record);
}