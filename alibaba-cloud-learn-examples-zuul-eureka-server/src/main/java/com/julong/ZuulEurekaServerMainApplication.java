package com.julong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * 主启动类
 * @author julong
 * @date 2023/2/26 13:05
 * @desc
 */
@SpringBootApplication
@EnableEurekaServer
@EnableHystrixDashboard
public class ZuulEurekaServerMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulEurekaServerMainApplication.class, args);
    }
}
