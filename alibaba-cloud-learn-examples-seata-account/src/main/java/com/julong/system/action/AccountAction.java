package com.julong.system.action;

import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.julong.response.CommonResult;
import com.julong.system.dao.entity.AccountInfo;
import com.julong.system.service.AccountService;

@RestController
public class AccountAction {

	private static final Logger logger = LoggerFactory.getLogger(AccountAction.class);
	
	@Autowired
	private AccountService accountServiceImpl;
	
	/**
	 * 查询数据
	 * @param id
	 * @return
	 * @author julong
	 * @date 2023年2月26日 下午10:06:23
	 * @desc
	 */
	@GetMapping(value="/account/get/{id}")
	public CommonResult<AccountInfo> getPaymentById(@PathVariable("id") int id){
		AccountInfo accountInfo = null;
		try {
			accountInfo = this.accountServiceImpl.getAccount(id);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(accountInfo != null){
			return new CommonResult<AccountInfo>(200,"查询成功",accountInfo);
		}else{
			return new CommonResult<AccountInfo>(500,"查询失败");
		}
	}
	
	@PostMapping(value="/account/update")
	public CommonResult<AccountInfo> updateAccount(@RequestBody AccountInfo record){
		int result = -1;
		try {
			TimeUnit.SECONDS.sleep(10);
			result = this.accountServiceImpl.updateAccount(record);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(result >0){
			return new CommonResult<AccountInfo>(200,"修改成功");
		}else{
			return new CommonResult<AccountInfo>(500,"修改失败");
		}
	}
}
