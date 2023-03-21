package com.julong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import zipkin2.server.internal.EnableZipkinServer;



/**
 * 主启动类
 * @author julong
 * @date 2023/2/26 13:05
 * @desc
 */
@SpringBootApplication
@EnableZipkinServer
@EnableEurekaClient
public class SleuthZipkinServerMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(SleuthZipkinServerMainApplication.class, args);
    }
}
