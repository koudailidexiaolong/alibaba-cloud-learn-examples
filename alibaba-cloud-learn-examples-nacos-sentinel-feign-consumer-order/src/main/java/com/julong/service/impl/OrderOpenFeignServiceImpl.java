package com.julong.service.impl;

import org.springframework.stereotype.Service;

import com.julong.response.CommonResult;
import com.julong.service.OrderOpenFeignService;
import com.julong.system.dao.entity.PaymentInfo;

@Service
public class OrderOpenFeignServiceImpl implements OrderOpenFeignService {

	@Override
	public CommonResult<PaymentInfo> getPaymentById(long paymentId) {
		// TODO Auto-generated method stub
		return new CommonResult<PaymentInfo>(5005,"查询失败-v1-服务降级返回数据");
	}

}
