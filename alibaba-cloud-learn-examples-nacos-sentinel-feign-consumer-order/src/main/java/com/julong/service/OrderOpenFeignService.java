package com.julong.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.julong.response.CommonResult;
import com.julong.system.dao.entity.PaymentInfo;

/**
 * openfeign服务调用
 * @author julong
 * @date 2023年3月5日 上午10:09:50
 * @desc 
 */
@FeignClient(value="alibaba-cloud-learn-examples-sentinel-openfeign-provider-payment")
public interface OrderOpenFeignService {

	/**
	 * 调用服务端接口
	 * @param paymentId
	 * @return
	 * @author julong
	 * @date 2023年3月5日 下午1:18:19
	 * @desc
	 */
	@GetMapping(value="/payment/get/v1/{paymentId}")
	public abstract CommonResult<PaymentInfo> getPaymentById(@PathVariable("paymentId") long paymentId);
}
