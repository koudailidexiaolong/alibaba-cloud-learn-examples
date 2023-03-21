package com.julong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 主启动类
 * @author julong
 * @date 2023/2/26 13:05
 * @desc
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaOneMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaOneMainApplication.class, args);
    }
}
