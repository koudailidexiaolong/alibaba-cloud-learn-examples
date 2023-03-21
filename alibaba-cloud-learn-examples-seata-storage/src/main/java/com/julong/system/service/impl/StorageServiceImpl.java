package com.julong.system.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.julong.system.dao.StorageDao;
import com.julong.system.dao.entity.StorageInfo;
import com.julong.system.service.StorageService;

/**
 * 业务类
 * @author julong
 * @date 2023/2/26 21:30
 * @desc
 */
@Service
public class StorageServiceImpl implements StorageService {

    @Autowired
    private StorageDao storageDaoImpl;

	@Override
	public int deleteStorage(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return this.storageDaoImpl.deleteByPrimaryKey(id);
	}

	@Override
	public int saveStorage(StorageInfo record) throws Exception {
		// TODO Auto-generated method stub
		return this.storageDaoImpl.insertSelective(record);
	}

	@Override
	public StorageInfo getStorage(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return this.storageDaoImpl.selectByPrimaryKey(id);
	}

	@Override
	public int updateStorage(StorageInfo record) throws Exception {
		// TODO Auto-generated method stub
		return this.storageDaoImpl.updateByPrimaryKeySelective(record);
	}
}
