package com.julong.system.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.julong.response.CommonResult;
import com.julong.system.dao.entity.AccountInfo;

/**
 * 账户模块
 * @author julong
 * @date 2023年3月7日 下午8:24:05
 * @desc 
 */
@FeignClient(value="alibaba-cloud-learn-examples-seata-account")
public interface AccountService {

	/**
	 * 修改账户
	 * @param record
	 * @return
	 * @throws Exception
	 * @author julong
	 * @date 2023年3月7日 下午8:24:35
	 * @desc
	 */
	@PostMapping("/account/update")
	public abstract CommonResult<AccountInfo> updateAccount(@RequestBody AccountInfo record) throws Exception;

}
