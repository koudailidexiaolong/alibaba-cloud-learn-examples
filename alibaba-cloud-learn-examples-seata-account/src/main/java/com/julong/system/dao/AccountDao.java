package com.julong.system.dao;

import org.apache.ibatis.annotations.Mapper;

import com.julong.system.dao.entity.AccountInfo;

@Mapper
public interface AccountDao {
	public abstract int deleteByPrimaryKey(Integer id) throws Exception;

	public abstract int insert(AccountInfo record) throws Exception;

	public abstract int insertSelective(AccountInfo record) throws Exception;

	public abstract AccountInfo selectByPrimaryKey(Integer id) throws Exception;

	public abstract AccountInfo selectBySelective(AccountInfo record) throws Exception;

	public abstract int updateByPrimaryKeySelective(AccountInfo record) throws Exception;

	public abstract int updateByPrimaryKey(AccountInfo record) throws Exception;
}