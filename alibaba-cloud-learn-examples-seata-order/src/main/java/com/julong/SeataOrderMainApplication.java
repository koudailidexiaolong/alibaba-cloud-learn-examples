package com.julong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import io.seata.spring.annotation.datasource.EnableAutoDataSourceProxy;

/**
 * 主启动类
 * @author julong
 * @date 2023/2/26 13:05
 * @desc
 */
@SpringBootApplication
@EnableDiscoveryClient //启用服务发现
@EnableFeignClients
@EnableAutoDataSourceProxy
public class SeataOrderMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeataOrderMainApplication.class, args);
    }
}
