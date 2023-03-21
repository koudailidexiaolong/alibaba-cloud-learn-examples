package com.julong.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 配置bean
 * @author julong
 * @date 2023年2月28日 上午9:15:07
 * @desc 
 */
@Configuration
public class ApplicationConfig {

	@Bean
	@LoadBalanced //配置负载均衡
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}
