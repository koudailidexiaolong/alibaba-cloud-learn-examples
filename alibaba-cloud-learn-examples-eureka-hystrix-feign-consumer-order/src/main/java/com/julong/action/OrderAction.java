package com.julong.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.julong.response.CommonResult;
import com.julong.system.dao.entity.PaymentInfo;
import com.julong.system.service.PaymentFeignService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

/**
 * 订单调用
 * @author julong
 * @date 2023年2月26日 下午10:35:01
 * @desc 
 */
@RestController
@DefaultProperties(defaultFallback="globalHystrixFallbackMethod")
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
	@HystrixCommand(fallbackMethod="hystrixTimeoutHandler",commandProperties = {
			@HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds", value="6000")
	})
	public String hystrixTimeout(){
		return this.paymentFeignServiceImpl.hystrixTimeout();
	}
	
	/**
	 * 全局异常处理
	 * @return
	 * @author julong
	 * @date 2023年2月28日 下午3:02:55
	 * @desc
	 */
	@HystrixCommand
	@GetMapping(value="/consumer/timeout1")
	public String hystrixTimeout1(){
		return this.paymentFeignServiceImpl.hystrixTimeout();
	}
	
	/**
	 * 全局服务异常
	 * @return
	 * @author julong
	 * @date 2023年2月28日 下午3:27:50
	 * @desc
	 */
	@GetMapping(value="/consumer/timeout2")
	public String hystrixTimeout2(){
		return this.paymentFeignServiceImpl.hystrixTimeout();
	}

	/**
	 * 失败调用方法
	 * @return
	 * @author julong
	 * @date 2023年2月28日 下午2:33:42
	 * @desc
	 */
	public String hystrixTimeoutHandler(){

		return "客户端请求异常";
	}



	/**
	 * 全局hystrix配置
	 * @return
	 * @author julong
	 * @date 2023年2月28日 下午2:59:55
	 * @desc
	 */
	public String globalHystrixFallbackMethod(){

		return "全局客户端请求异常";
	}
}
