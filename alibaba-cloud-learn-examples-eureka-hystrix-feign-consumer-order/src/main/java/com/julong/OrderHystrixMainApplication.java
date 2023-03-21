package com.julong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 主启动类
 * @author julong
 * @date 2023/2/26 13:05
 * @desc
 */
@SpringBootApplication
@EnableEurekaClient //配置eureka
@EnableFeignClients //配置feign
@EnableCircuitBreaker //配置hystrix
public class OrderHystrixMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderHystrixMainApplication.class, args);
    }
}
