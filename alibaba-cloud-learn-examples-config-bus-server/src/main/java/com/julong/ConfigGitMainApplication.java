package com.julong;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 主启动类
 * @author julong
 * @date 2023/2/26 13:05
 * @desc
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer //配置中心
@EnableRabbit
public class ConfigGitMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigGitMainApplication.class, args);
    }
}
