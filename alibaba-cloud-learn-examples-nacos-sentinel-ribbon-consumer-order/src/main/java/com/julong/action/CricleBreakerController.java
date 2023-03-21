package com.julong.action;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.julong.response.CommonResult;
import com.julong.system.dao.entity.PaymentInfo;

@RestController
public class CricleBreakerController {

	@Resource
	public RestTemplate restTemplateImpl;
	
	@SuppressWarnings("unchecked")
	@GetMapping(value="/consumer/get/v1/{paymentId}")
//	@SentinelResource(value="fallback") //fallback示例 没有配置的示例
//	@SentinelResource(value="fallback",fallback="handlerFallback") //fallback示例 没有配置的示例
//	@SentinelResource(value="fallback",blockHandler="handlerBlock") //只配置负责sentinel控制台配置违规
	@SentinelResource(value="fallback",fallback="handlerFallback",blockHandler="handlerBlock") //只配置负责sentinel控制台配置违规
	public CommonResult<PaymentInfo> fallback(@PathVariable("paymentId") long paymentId){
		
		if(paymentId == 2){
			throw new IllegalArgumentException("非法参数异常......");
		}
		CommonResult<PaymentInfo> result = this.restTemplateImpl.getForObject("http://alibaba-cloud-learn-examples-sentinel-provider-payment/payment/get/v1/"+paymentId, CommonResult.class);
		if(result.getData() == null){
			throw new NullPointerException("没有查询到此数据异常......");
		}
		return result;
	}
	
	
	/**
	 * 业务处理异常同一方法
	 * @param paymentId
	 * @param throwable
	 * @return
	 * @author julong
	 * @date 2023年3月4日 下午9:42:11
	 * @desc
	 */
	public CommonResult handlerFallback(@PathVariable("paymentId") long paymentId,Throwable throwable){
		return new CommonResult<PaymentInfo>(5001,"查询失败异常-处理业务-v1-");
	}
	
	
	/**
	 * sentinel 异常处理方法
	 * @param paymentId
	 * @param blockException
	 * @return
	 * @author julong
	 * @date 2023年3月4日 下午10:07:08
	 * @desc
	 */
	public CommonResult handlerBlock(@PathVariable("paymentId") long paymentId,BlockException blockException){
		return new CommonResult<PaymentInfo>(5002,"查询失败异常-限流-v1-blockException");
	}
	
}
