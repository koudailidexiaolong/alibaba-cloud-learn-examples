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
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.julong.response.CommonResult;
import com.julong.system.dao.entity.PaymentInfo;
import com.julong.system.service.PaymentService;

@RestController
public class PaymentAction {

	private static final Logger logger = LoggerFactory.getLogger(PaymentAction.class);
	
	@Autowired
	private PaymentService paymentServiceImpl;
	
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
			TimeUnit.SECONDS.sleep(1); //默认限流
			paymentInfo = this.paymentServiceImpl.selectPaymentInfo(paymentId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(paymentInfo != null){
			return new CommonResult<PaymentInfo>(200,"查询成功-v1-"+serverPort,paymentInfo);
		}else{
			return new CommonResult<PaymentInfo>(500,"查询失败-v1-"+serverPort);
		}
	}
	
	@PostMapping(value="/payment/save")
	public CommonResult<PaymentInfo> savePayment(@RequestBody PaymentInfo paymentInfo){
		int result = -1;
		try {
			result = this.paymentServiceImpl.savePayment(paymentInfo);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(result > 0){
			return new CommonResult<PaymentInfo>(200,"新增成功");
		}else{
			return new CommonResult<PaymentInfo>(500,"新增失败");
		}
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

}
