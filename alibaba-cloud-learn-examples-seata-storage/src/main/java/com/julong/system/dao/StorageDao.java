package com.julong.system.dao;

import org.apache.ibatis.annotations.Mapper;

import com.julong.system.dao.entity.StorageInfo;

@Mapper
public interface StorageDao {
    public abstract int deleteByPrimaryKey(Integer id) throws Exception;

    public abstract int insert(StorageInfo record) throws Exception;

    public abstract int insertSelective(StorageInfo record) throws Exception;

    public abstract StorageInfo selectByPrimaryKey(Integer id) throws Exception;

    public abstract StorageInfo selectBySelective(StorageInfo record) throws Exception;

    public abstract int updateByPrimaryKeySelective(StorageInfo record) throws Exception;

    public abstract int updateByPrimaryKey(StorageInfo record) throws Exception;
}