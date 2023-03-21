package com.julong.system.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.julong.response.CommonResult;
import com.julong.system.dao.entity.StorageInfo;

/**
 * @author julong
 * @date 2023/2/26 21:18
 * @desc
 */
@FeignClient(value="alibaba-cloud-learn-examples-seata-storage")
public interface StorageService {

	@PostMapping("/storage/update")
	public abstract CommonResult<StorageInfo> updateStorage(@RequestBody StorageInfo record) throws Exception;

}
