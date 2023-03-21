package com.julong.system.dao;

import org.apache.ibatis.annotations.Mapper;

import com.julong.system.dao.entity.OrderInfo;

@Mapper
public interface OrderDao {
	
    public abstract int deleteByPrimaryKey(Integer id) throws Exception;

    public abstract int insert(OrderInfo record) throws Exception;

    public abstract int insertSelective(OrderInfo record) throws Exception;

    public abstract OrderInfo selectByPrimaryKey(Integer id) throws Exception;

    public abstract OrderInfo selectBySelective(OrderInfo record) throws Exception;

    public abstract int updateByPrimaryKeySelective(OrderInfo record) throws Exception;

    public abstract int updateByPrimaryKey(OrderInfo record) throws Exception;
}