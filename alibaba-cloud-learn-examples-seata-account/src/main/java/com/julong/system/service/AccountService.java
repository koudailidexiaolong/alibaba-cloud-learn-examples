package com.julong.system.service;

import com.julong.system.dao.entity.AccountInfo;

/**
 * 账户模块
 * @author julong
 * @date 2023年3月7日 下午8:24:05
 * @desc 
 */
public interface AccountService {

	/**
	 * 删除账户
	 * @param id
	 * @return
	 * @throws Exception
	 * @author julong
	 * @date 2023年3月7日 下午8:24:14
	 * @desc
	 */
	public abstract int deleteAccount(Integer id) throws Exception;

	/**
	 * 新增账户
	 * @param record
	 * @return
	 * @throws Exception
	 * @author julong
	 * @date 2023年3月7日 下午8:24:21
	 * @desc
	 */
	public abstract int saveAccount(AccountInfo record) throws Exception;

	/**
	 * 查询账户
	 * @param id
	 * @return
	 * @throws Exception
	 * @author julong
	 * @date 2023年3月7日 下午8:24:28
	 * @desc
	 */
	public abstract AccountInfo getAccount(Integer id) throws Exception;

	/**
	 * 修改账户
	 * @param record
	 * @return
	 * @throws Exception
	 * @author julong
	 * @date 2023年3月7日 下午8:24:35
	 * @desc
	 */
	public abstract int updateAccount(AccountInfo record) throws Exception;

}
