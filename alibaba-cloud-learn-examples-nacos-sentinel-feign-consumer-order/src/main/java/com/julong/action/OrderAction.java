package com.julong.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
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
	
    @Autowired
    private LoadBalancerClient loadBalancerClient;
	
	@SuppressWarnings("unchecked")
	@GetMapping(value="/consumer/get/{paymentId}")
	public CommonResult<PaymentInfo> getPayment(@PathVariable("paymentId") long paymentId){
		return this.restTemplateImpl.getForObject("http://alibaba-cloud-learn-examples-sentinel-provider-payment/payment/v1/get/"+paymentId, CommonResult.class);
	}
	
	@SuppressWarnings("unchecked")
	@PostMapping(value="/consumer/save")
	public CommonResult<PaymentInfo> savePayment(@RequestBody PaymentInfo paymentInfo){
		return this.restTemplateImpl.postForObject("http://alibaba-cloud-learn-examples-sentinel-provider-payment/payment/save",paymentInfo, CommonResult.class);
	}
	

	@Value("${spring.application.name}")
    private String appName;

    @GetMapping("/consumer/app")
    public String echoAppName(){
        //Access through the combination of LoadBalanceClient and RestTemolate
        ServiceInstance serviceInstance = loadBalancerClient.choose("alibaba-cloud-learn-examples-sentinel-provider-payment");
        String path = String.format("http://%s:%s/echo/%s",serviceInstance.getHost(),serviceInstance.getPort(),appName);
        System.out.println("request path:" +path);
        return this.restTemplateImpl.getForObject(path,String.class);
    }
}
