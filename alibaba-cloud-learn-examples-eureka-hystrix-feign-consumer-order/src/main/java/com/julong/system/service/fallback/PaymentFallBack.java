package com.julong.system.service.fallback;

import org.springframework.stereotype.Service;

import com.julong.response.CommonResult;
import com.julong.system.dao.entity.PaymentInfo;
import com.julong.system.service.PaymentFeignService;

/**
 * 服务降级全局处理类
 * @author julong
 * @date 2023年2月28日 下午3:28:26
 * @desc 
 */
@Service
public class PaymentFallBack implements PaymentFeignService{

	@Override
	public CommonResult<PaymentInfo> getPayment(long paymentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String hystrixTimeout() {
		// TODO Auto-generated method stub
		return "全局定义服务层接口异常返回";
	}

}
