package com.julong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import com.netflix.hystrix.contrib.metrics.eventstream.HystrixMetricsStreamServlet;

/**
 * 主启动类
 * @author julong
 * @date 2023/2/26 13:05
 * @desc
 */
@SpringBootApplication
@EnableEurekaClient //启用eureka客户端配置
@EnableDiscoveryClient //启用服务发现
@EnableCircuitBreaker  //启用hystrix 注解
public class ZuulPaymentMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulPaymentMainApplication.class, args);
    }
    
    @Bean
    public ServletRegistrationBean<HystrixMetricsStreamServlet>  getServlet(){
    	HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
    	ServletRegistrationBean<HystrixMetricsStreamServlet> servletRegistrationBean = new ServletRegistrationBean<HystrixMetricsStreamServlet>(streamServlet);
    	servletRegistrationBean.setLoadOnStartup(1);
    	servletRegistrationBean.addUrlMappings("/hystrix.stream");
    	servletRegistrationBean.setName("HystrixMetricsStreamServlet");
    	return servletRegistrationBean;
    }
    
}
