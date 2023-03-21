package com.julong.system.service;

import com.julong.system.dao.entity.StorageInfo;

/**
 * @author julong
 * @date 2023/2/26 21:18
 * @desc
 */
public interface StorageService {

	public abstract int deleteStorage(Integer id) throws Exception;

	public abstract int saveStorage(StorageInfo record) throws Exception;

	public abstract StorageInfo getStorage(Integer id) throws Exception;

	public abstract int updateStorage(StorageInfo record) throws Exception;

}
