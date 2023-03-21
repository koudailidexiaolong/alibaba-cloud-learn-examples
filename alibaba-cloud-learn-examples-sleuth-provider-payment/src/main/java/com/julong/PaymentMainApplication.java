package com.julong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 主启动类
 * @author julong
 * @date 2023/2/26 13:05
 * @desc
 */
@SpringBootApplication
@EnableEurekaClient //启用eureka客户端配置
@EnableDiscoveryClient //启用服务发现
public class PaymentMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMainApplication.class, args);
    }
}
