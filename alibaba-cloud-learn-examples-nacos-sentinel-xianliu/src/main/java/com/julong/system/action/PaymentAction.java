package com.julong.system.action;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.julong.response.CommonResult;
import com.julong.system.dao.entity.PaymentInfo;

@RestController
public class PaymentAction {

	private static final Logger logger = LoggerFactory.getLogger(PaymentAction.class);
	
	
	@Value("${server.port}")
	private String serverPort;
	
	@Autowired
	private DiscoveryClient discoveryClientImpl;
	
	/**
	 * 查询数据
	 * @param paymentId
	 * @return
	 * @author julong
	 * @date 2023年2月26日 下午10:06:23
	 * @desc
	 */
	@GetMapping(value="/payment/get/v1/{paymentId}")
	public CommonResult<PaymentInfo> getPaymentById(@PathVariable("paymentId") long paymentId){
		PaymentInfo paymentInfo = null;
		try {
			paymentInfo = new PaymentInfo();
			paymentInfo.setPaymentId(10000L);
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //默认限流
		return new CommonResult<PaymentInfo>(200,"查询成功-v1"+serverPort,paymentInfo);
	}
	
	/**
	 * 查询数据
	 * @param paymentId
	 * @return
	 * @author julong
	 * @date 2023年2月26日 下午10:06:23
	 * @desc
	 */
	@GetMapping(value="/payment/get/v2/{paymentId}")
	public CommonResult<PaymentInfo> getPaymentById1(@PathVariable("paymentId") long paymentId){
		PaymentInfo paymentInfo = null;
		paymentInfo = new PaymentInfo();
		paymentInfo.setPaymentId(10000L);
		return new CommonResult<PaymentInfo>(200,"查询成功-v1"+serverPort,paymentInfo);
	}
	
	
	@GetMapping(value="/payment/services")
	public List<String> discovery(){
		List<String> services = discoveryClientImpl.getServices();
		for (int i = 0; i < services.size(); i++) {
			logger.info("【services】-{}",services.get(i));
		}
		List<ServiceInstance> instanceList =  discoveryClientImpl.getInstances("ALIBABA-CLOUD-LEARN-EXAMPLES-PROVIDER-PAYMENT");
		for (ServiceInstance serviceInstance : instanceList) {
			logger.info("【serviceInstance】-{}",serviceInstance.getInstanceId());
		}
		return services;
	}


	
	/**
	 * 异常数测试
	 * @return
	 * @author julong
	 * @date 2023年2月28日 上午10:35:25
	 * @desc
	 */
	@GetMapping(value="/payment/error")
	public String sentinelError(){
		int age = 1/0;
		return "------testE 测试异常比例";
	}
	
	/**
	 * 热点限流
	 * @param one
	 * @param two
	 * @return
	 * @author julong
	 * @date 2023年3月4日 下午2:35:02
	 * @desc
	 */
	@GetMapping("/testHotKey")
	@SentinelResource(value = "testHotKey",blockHandler="showErrorTestHotKey")
	public String testHotKey(String one,String two){
		
		return  "热点参数测试";
	}
	
	public String showErrorTestHotKey(String one,String two,BlockException exception){
		return "showErrorTestHotKey";
	}
}