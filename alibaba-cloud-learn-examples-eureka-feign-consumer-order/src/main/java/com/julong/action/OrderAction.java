package com.julong.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.julong.response.CommonResult;
import com.julong.system.dao.entity.PaymentInfo;
import com.julong.system.service.PaymentFeignService;

/**
 * 订单调用
 * @author julong
 * @date 2023年2月26日 下午10:35:01
 * @desc 
 */
@RestController
public class OrderAction {

	@Autowired
	private PaymentFeignService paymentFeignServiceImpl;
	
	/**
	 * 查询方法
	 * @param paymentId
	 * @return
	 * @author julong
	 * @date 2023年2月28日 上午10:39:24
	 * @desc
	 */
	@GetMapping(value="/consumer/get/{paymentId}")
	public CommonResult<PaymentInfo> getPayment(@PathVariable("paymentId") long paymentId){
		return this.paymentFeignServiceImpl.getPayment(paymentId);
	}
	
	
	/**
	 * 测试超时
	 * @return
	 * @author julong
	 * @date 2023年2月28日 上午10:39:32
	 * @desc
	 */
	@GetMapping(value="/consumer/timeout")
	public String feignTimeout(){
		return this.paymentFeignServiceImpl.feignTimeout();
	}
	
}
