package com.ribbon.rule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

/**
 * 自定义负载方法
 * @author julong
 * @date 2023年2月28日 上午9:27:45
 * @desc 
 */
@Configuration
public class SelfRuleConfiguration {

	@Bean
	public IRule ribbonRule() {
		//随机
		return new RandomRule();
	}
}
