package com.julong.system.action;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope //支持nacos的动态刷新功能
public class NacosConfigAction {

	private static final Logger logger = LoggerFactory.getLogger(NacosConfigAction.class);
	
	
	@Value("${server.port}")
	private String serverPort;
	
	@Autowired
	private DiscoveryClient discoveryClientImpl;
	

	@GetMapping(value="/nacos/services")
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
	 * 测试feign超时
	 * @return
	 * @author julong
	 * @date 2023年2月28日 上午10:35:25
	 * @desc
	 */
	@GetMapping(value="/nacos/timeout")
	public String feignTimeout(){
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.serverPort;
	}
	
	@Value("${user.name}")
	private String userName;
	
	@GetMapping(value="/nacos/config")
	public String readConfig(){
		
		return this.userName;
	}
}
