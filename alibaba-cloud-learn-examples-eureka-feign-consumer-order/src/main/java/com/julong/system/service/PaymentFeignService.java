package com.julong.system.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.julong.response.CommonResult;
import com.julong.system.dao.entity.PaymentInfo;

/**
 * 自定义feign
 * @author julong
 * @date 2023/2/26 21:18
 * @desc
 */
@FeignClient(value="ALIBABA-CLOUD-LEARN-EXAMPLES-PROVIDER-PAYMENT")
public interface PaymentFeignService {

	@GetMapping(value="/payment/get/{paymentId}")
	public CommonResult<PaymentInfo> getPayment(@PathVariable("paymentId") long paymentId);
	
	@GetMapping(value="/payment/timeout")
	public String feignTimeout();
}
