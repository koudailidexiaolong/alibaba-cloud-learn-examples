package com.julong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 主启动类
 * @author julong
 * @date 2023/2/26 13:05
 * @desc
 */
@SpringBootApplication
@EnableEurekaClient
public class StreamOneServerMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(StreamOneServerMainApplication.class, args);
    }
}
