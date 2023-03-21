package com.julong.system.action;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.julong.response.CommonResult;
import com.julong.system.dao.entity.StorageInfo;
import com.julong.system.service.StorageService;

@RestController
public class StorageAction {

	private static final Logger logger = LoggerFactory.getLogger(StorageAction.class);
	
	@Autowired
	private StorageService storageServiceImpl;
	
	/**
	 * 查询数据
	 * @param paymentId
	 * @return
	 * @author julong
	 * @date 2023年2月26日 下午10:06:23
	 * @desc
	 */
	@GetMapping(value="/storage/get/{id}")
	public CommonResult<StorageInfo> getStorageById(@PathVariable("id") int id){
		StorageInfo storageInfo = null;
		try {
			storageInfo = this.storageServiceImpl.getStorage(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(storageInfo != null){
			return new CommonResult<StorageInfo>(200,"查询成功",storageInfo);
		}else{
			return new CommonResult<StorageInfo>(500,"查询失败");
		}
	}
	
	@PostMapping(value="/storage/update")
	public CommonResult<StorageInfo> updateStorage(@RequestBody StorageInfo record){
		int result = -1;
		try {
			result = this.storageServiceImpl.updateStorage(record);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(result >0){
			return new CommonResult<StorageInfo>(200,"修改成功");
		}else{
			return new CommonResult<StorageInfo>(500,"修改失败");
		}
	}

	
}
