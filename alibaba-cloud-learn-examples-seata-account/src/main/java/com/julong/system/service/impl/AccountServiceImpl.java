package com.julong.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.julong.system.dao.AccountDao;
import com.julong.system.dao.entity.AccountInfo;
import com.julong.system.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountDao accountDaoImpl;
	
	@Override
	public int deleteAccount(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return this.accountDaoImpl.deleteByPrimaryKey(id);
	}

	@Override
	public int saveAccount(AccountInfo record) throws Exception {
		// TODO Auto-generated method stub
		return this.accountDaoImpl.insertSelective(record);
	}

	@Override
	public AccountInfo getAccount(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return this.accountDaoImpl.selectByPrimaryKey(id);
	}

	@Override
	public int updateAccount(AccountInfo record) throws Exception {
		// TODO Auto-generated method stub
		return this.accountDaoImpl.updateByPrimaryKeySelective(record);
	}

}
