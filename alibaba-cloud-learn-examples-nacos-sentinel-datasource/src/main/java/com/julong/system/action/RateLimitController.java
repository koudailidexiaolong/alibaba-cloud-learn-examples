package com.julong.system.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.julong.response.CommonResult;
import com.julong.system.dao.entity.PaymentInfo;
import com.julong.system.service.PaymentService;

@RestController
public class RateLimitController {

	@Autowired
	private PaymentService paymentServiceImpl;
	
	@Value("${server.port}")
	private String serverPort;
	
	/**
	 * 查询数据
	 * @param paymentId
	 * @return
	 * @author julong
	 * @date 2023年2月26日 下午10:06:23
	 * @desc
	 */
	@GetMapping(value="/payment/get/v2/{paymentId}")
	@SentinelResource(value="/payment/get/v2",blockHandler="handleException")
	public CommonResult<PaymentInfo> getPaymentById(@PathVariable("paymentId") long paymentId){
		PaymentInfo paymentInfo = null;
		try {
			paymentInfo = this.paymentServiceImpl.selectPaymentInfo(paymentId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(paymentInfo != null){
			return new CommonResult<PaymentInfo>(200,"查询成功-v2/"+serverPort,paymentInfo);
		}else{
			return new CommonResult<PaymentInfo>(500,"查询失败-v2/"+serverPort);
		}
	}
	
	public CommonResult handleException(@PathVariable("paymentId") long paymentId,BlockException exception){
		return new CommonResult<PaymentInfo>(444,"查询失败-v2 服务不可用"+serverPort);
	}
}
