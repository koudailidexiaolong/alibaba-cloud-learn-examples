package com.julong.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.julong.response.CommonResult;
import com.julong.system.dao.entity.PaymentInfo;

/**
 * 订单调用
 * @author julong
 * @date 2023年2月26日 下午10:35:01
 * @desc 
 */
@RestController
public class OrderAction {

	@Autowired
	private RestTemplate restTemplateImpl;
	
	@SuppressWarnings("unchecked")
	@GetMapping(value="/consumer/get/{paymentId}")
	public CommonResult<PaymentInfo> getPayment(@PathVariable("paymentId") long paymentId){
		return this.restTemplateImpl.getForObject("http://ALIBABA-CLOUD-LEARN-EXAMPLES-PROVIDER-PAYMENT/payment/get/"+paymentId, CommonResult.class);
	}
	
	@SuppressWarnings("unchecked")
	@PostMapping(value="/consumer/save")
	public CommonResult<PaymentInfo> savePayment(@RequestBody PaymentInfo paymentInfo){
		return this.restTemplateImpl.postForObject("http://localhost:8001/payment/save",paymentInfo, CommonResult.class);
	}
}
