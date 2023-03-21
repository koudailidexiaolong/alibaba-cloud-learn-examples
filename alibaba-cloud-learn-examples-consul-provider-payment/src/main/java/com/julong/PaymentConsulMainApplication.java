package com.julong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 主启动类
 * @author julong
 * @date 2023/2/26 13:05
 * @desc
 */
@SpringBootApplication
@EnableDiscoveryClient //启用服务发现
public class PaymentConsulMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaymentConsulMainApplication.class, args);
    }
}
