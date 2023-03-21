package com.julong.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

/**
 * 自定义filter
 * @author julong
 * @date 2023年2月28日 下午8:51:09
 * @desc 
 */
@Component
public class CustomGlobalFilter implements GlobalFilter, Ordered {

	private static final Logger logger = LoggerFactory.getLogger(CustomGlobalFilter.class);
	
	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		// TODO Auto-generated method stub
		String username = exchange.getRequest().getQueryParams().getFirst("username");
		if(username == null){
			logger.info("【CustomGlobalFilter】-用户名为空");
			exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
			return exchange.getResponse().setComplete();
		}
		return chain.filter(exchange);
	}

}
