#### 

# SpringCloud开发笔记

## 版本信息依赖版本

### Hoxton.SR6

2020-06-23

    Spring Cloud Contract 2.2.3.RELEASE (issues)
    Spring Cloud Kubernetes 1.1.3.RELEASE (issues)
    Spring Cloud Starter Build Hoxton.SR6
    Spring Cloud Cloudfoundry 2.2.2.RELEASE (issues)
    Spring Cloud Build 2.3.0.RELEASE (issues)
    Spring Cloud Commons 2.2.3.RELEASE (issues)
    Spring Cloud Netflix 2.2.3.RELEASE (issues)
    Spring Cloud Consul 2.2.3.RELEASE (issues)
    Spring Cloud Config 2.2.3.RELEASE (issues)
    Spring Cloud Gateway 2.2.3.RELEASE (issues)
    Spring Cloud Gcp 1.2.3.RELEASE
    Spring Cloud Zookeeper 2.2.2.RELEASE (issues)
    Spring Cloud Vault 2.2.3.RELEASE (issues)
    Spring Cloud Circuitbreaker 1.0.3.RELEASE (issues)
    Spring Cloud Bus 2.2.2.RELEASE (issues)
    Spring Cloud Security 2.2.2.RELEASE (issues)
    Spring Cloud Openfeign 2.2.3.RELEASE (issues)
    Spring Cloud Aws 2.2.2.RELEASE (issues)
    Spring Cloud Sleuth 2.2.3.RELEASE (issues)

### Hoxton.SR5

2020-05-29

All Issues

    Spring Cloud Contract 2.2.3.RELEASE (issues)
    Spring Cloud Kubernetes 1.1.3.RELEASE (issues)
    Spring Cloud Cloudfoundry 2.2.2.RELEASE (issues)
    Spring Cloud Commons 2.2.3.RELEASE (issues)
    Spring Cloud Starter Build Hoxton.SR5
    Spring Cloud Netflix 2.2.3.RELEASE (issues)
    Spring Cloud Consul 2.2.3.RELEASE (issues)
    Spring Cloud Config 2.2.3.RELEASE (issues)
    Spring Cloud Gateway 2.2.3.RELEASE (issues)
    Spring Cloud Gcp 1.2.3.RELEASE
    Spring Cloud Zookeeper 2.2.2.RELEASE (issues)
    Spring Cloud Vault 2.2.3.RELEASE (issues)
    Spring Cloud Circuitbreaker 1.0.3.RELEASE (issues)
    Spring Cloud Bus 2.2.2.RELEASE (issues)
    Spring Cloud Security 2.2.2.RELEASE (issues)
    Spring Cloud Openfeign 2.2.3.RELEASE (issues)
    Spring Cloud Aws 2.2.2.RELEASE (issues)
    Spring Cloud Sleuth 2.2.3.RELEASE (issues)

### Hoxton.SR4

2020-04-23

    Spring Cloud Starter Build Hoxton.SR4

### Hoxton.SR3

Breaking Changes

The writable env endpoint has been disabled by default. To re-enable this please set management.endpoint.env.post.enabled=true. Please make sure this endpoint is not publicly available.

2020-03-05

    Spring Cloud Aws 2.2.1.RELEASE
    Spring Cloud Vault 2.2.2.RELEASE (issues)
    Spring Cloud Circuitbreaker 1.0.2.RELEASE (issues)
    Spring Cloud Cli 2.2.1.RELEASE
    Spring Cloud Gateway 2.2.2.RELEASE (issues)
    Spring Cloud Zookeeper 2.2.1.RELEASE
    Spring Cloud Starter Hoxton.SR3
    Spring Cloud Build 2.2.3.RELEASE
    Spring Cloud Config 2.2.2.RELEASE (issues)
    Spring Cloud Dependencies Parent 2.2.2.RELEASE
    Spring Cloud Starter Hoxton.SR3
    Spring Cloud Starter Parent Hoxton.SR3
    Spring Cloud Sleuth 2.2.2.RELEASE (issues)
    Spring Cloud Contract 2.2.2.RELEASE (issues)
    Spring Cloud Gcp 1.2.2.RELEASE
    Spring Cloud Bus 2.2.1.RELEASE
    Spring Cloud Consul 2.2.2.RELEASE
    Spring Cloud Stream Horsham.SR3 (issues)
    Spring Cloud Kubernetes 1.1.2.RELEASE (issues)
    Spring Cloud Release Hoxton.SR3
    Spring Cloud Openfeign 2.2.2.RELEASE (issues)
    Spring Cloud Commons 2.2.2.RELEASE (issues)
    Spring Cloud Task 2.2.3.RELEASE
    Spring Cloud Function 3.0.3.RELEASE
    Spring Cloud Netflix 2.2.2.RELEASE (issues)
    Spring Cloud Security 2.2.1.RELEASE
    Spring Cloud Release Hoxton.SR3
    Spring Cloud Cloudfoundry 2.2.1.RELEASE

### Hoxton.SR1

Known Issues with Hoxton.SR1

The ordering of property sources in the property source loader can affect the ordering of property sources returned from config server (https://github.com/spring-cloud/spring-cloud-commons/issues/668).
Versions included in Hoxton.SR1

2019-12-20

    Spring Cloud Config 2.2.1.RELEASE (issues)
    Spring Cloud Cloudfoundry 2.2.0.RELEASE
    Spring Cloud Hoxton.SR1
    Spring Cloud Vault 2.2.1.RELEASE (issues)
    Spring Cloud Aws 2.2.1.RELEASE
    Spring Cloud Bus 2.2.0.RELEASE
    Spring Cloud Cli 2.2.1.RELEASE
    Spring Cloud Gcp 1.2.1.RELEASE
    Spring Cloud Contract 2.2.1.RELEASE (issues)
    Spring Cloud Consul 2.2.1.RELEASE
    Spring Cloud Dependencies Parent 2.2.1.RELEASE
    Spring Cloud Starter Hoxton.SR1
    Spring Cloud Build 2.2.1.RELEASE
    Spring Cloud Dependencies Hoxton.SR1
    Spring Cloud Starter Parent Hoxton.SR1
    Spring Cloud Sleuth 2.2.1.RELEASE (issues)
    Spring Cloud Commons 2.2.1.RELEASE (issues)
    Spring Cloud Openfeign 2.2.1.RELEASE (issues)
    Spring Cloud Zookeeper 2.2.0.RELEASE (issues)
    Spring Cloud Kubernetes 1.1.1.RELEASE
    Spring Cloud Release Hoxton.SR1
    Spring Cloud Security 2.2.0.RELEASE
    Spring Cloud Circuitbreaker 1.0.0.RELEASE (issues)
    Spring Cloud Stream Horsham.SR1 (issues)
    Spring Cloud Gateway 2.2.1.RELEASE (issues)
    Spring Cloud Netflix 2.2.1.RELEASE (issues)
    Spring Cloud Function 3.0.1.RELEASE (issues)
    Spring Cloud Task 2.2.2.RELEASE
文档地址：https://cloud.spring.io/spring-cloud-static/Hoxton.SR1/reference/htmlsingle/

## 开发版本信息



### spring boot 版本

```xml
<!-- 引入 springboot 版本控制-->
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-dependencies</artifactId>
    <version>2.2.2.RELEASE</version>
    <type>pom</type>
    <scope>import</scope>
</dependency>
```

### spring cloud 版本

```xml
<!-- 引入 springcloud 版本控制-->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-dependencies</artifactId>
    <version>Hoxton.SR1</version>
    <type>pom</type>
    <scope>import</scope>
</dependency>
```

### alibaba cloud 版本

```xml
<!-- 引入 cloud-alibaba 版本控制-->
<dependency>
    <groupId>com.alibaba.cloud</groupId>
    <artifactId>spring-cloud-alibaba-dependencies</artifactId>
    <version>2.1.0.RELEASE</version>
    <type>pom</type>
    <scope>import</scope>
</dependency>
```

### maven 版本



| Build Tool | Version                                                      |
| ---------- | ------------------------------------------------------------ |
| Maven      | 3.3+                                                         |
| Gradle     | 5.x and 6.x (4.10 is also supported but in a deprecated form) |

###  Servlet Containers

| Name         | Servlet Version |
| ------------ | --------------- |
| Tomcat 9.0   | 4.0             |
| Jetty 9.4    | 3.1             |
| Undertow 2.0 | 4.0             |



## alibaba-cloud-learn-examples

### pom.xml引入依赖

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<groupId>com.julong</groupId>
	<artifactId>alibaba-cloud-learn-examples</artifactId>
	<version>0.0.1-SNAPSHOT</version>
	<packaging>pom</packaging>
	<description>阿里巴巴spring cloud 学习</description>
	<properties>
		<project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
		<project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
		<java.version>1.8</java.version>

	</properties>

	<dependencyManagement>
		<dependencies>
			<!-- 引入 springboot 版本控制-->
			<dependency>
				<groupId>org.springframework.boot</groupId>
				<artifactId>spring-boot-dependencies</artifactId>
				<version>2.2.2.RELEASE</version>
				<type>pom</type>
				<scope>import</scope>
			</dependency>
			<!-- 引入 springcloud 版本控制-->
			<dependency>
				<groupId>org.springframework.cloud</groupId>
				<artifactId>spring-cloud-dependencies</artifactId>
				<version>Hoxton.SR1</version>
				<type>pom</type>
				<scope>import</scope>
			</dependency>
			<!-- 引入 cloud-alibaba 版本控制-->
			<dependency>
				<groupId>com.alibaba.cloud</groupId>
				<artifactId>spring-cloud-alibaba-dependencies</artifactId>
				<version>2.1.0.RELEASE</version>
				<type>pom</type>
				<scope>import</scope>
			</dependency>

		</dependencies>
	</dependencyManagement>

	<build>
		<plugins>
			<plugin>
				<artifactId>maven-compiler-plugin</artifactId>
				<configuration>
					<source>1.8</source>
					<target>1.8</target>
				</configuration>
			</plugin>
		</plugins>
	</build>
</project>
```

dependencyManagement 的作用是锁定版本信息

### mybaits

```xml
<dependency>
    <groupId>org.mybatis.spring.boot</groupId>
    <artifactId>mybatis-spring-boot-starter</artifactId>
    <version>2.1.0</version>
</dependency>
```

### mysql

```xml
<dependency>
    <groupId>mysql</groupId>
    <artifactId>mysql-connector-java</artifactId>
    <version>5.1.49</version>
</dependency>
```

### druid

```xml
<dependency>
    <groupId>com.alibaba</groupId>
    <artifactId>druid-spring-boot-starter</artifactId>
    <version>1.1.10</version>
</dependency>
```

### alibaba-cloud-learn-examples-commons-api

公用代码模块主要为系统公用模块代码集合 供其他接口使用调用

#### 数据库创建脚本

```sql
CREATE TABLE `payment` (
  `payment_id` bigint(11) NOT NULL AUTO_INCREMENT COMMENT '支付编号',
  `payment_serial` varchar(255) DEFAULT NULL COMMENT '支付流水号',
  PRIMARY KEY (`payment_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;


```



## 基于netflix eureka的服务注册与发现

### alibaba-cloud-learn-examples-eureka-provider-payment

支付生产者

#### application.yml相关配置

```yaml
### 项目名
spring:
  application:
    name: alibaba-cloud-learn-examples-provider-payment     # 项目名称
  datasource:
    driver-class-name: org.gjt.mm.mysql.Driver              # 驱动名称
    url: jdbc:mysql://192.168.10.222:3306/test?useUnicode=true&characterEncoding=utf-8&useSSL=false
    username: root                                          # 账户
    password: root                                          # 密码
    type: com.alibaba.druid.pool.DruidDataSource            # 数据源操作类型

### 服务端口
server:
  port: 8001


mybatis:
  mapper-locations: classpath:/mapper/*.xml
  type-aliases-package: com.julong.**.entity

logging:
  config: classpath:logback.xml

```

#### logback.xml配置

```xml
<?xml version="1.0" encoding="UTF-8"?>
<configuration>
	<appender name="console" class="ch.qos.logback.core.ConsoleAppender">
        <!--设置输出格式-->
        <encoder class="ch.qos.logback.classic.encoder.PatternLayoutEncoder">
            <!--格式化输出：%d表示日期，%thread表示线程名，%-5level：级别从左显示5个字符宽度%msg：日志消息，%n是换行符-->
            <pattern>%d{yyyy-MM-dd HH:mm:ss.SSS} [%thread] %-5level %logger{50} - %msg%n</pattern>
        </encoder>
    </appender>
	 <!--文件输出,时间窗口滚动-->
    <appender name="FILE" class="ch.qos.logback.core.rolling.RollingFileAppender">
        <!--日志名,指定最新的文件名，其他文件名使用FileNamePattern -->
        <File>./logs/info.log</File>
        <!-- 过滤日志级别 -->
        <filter class="ch.qos.logback.classic.filter.ThresholdFilter">
      		<level>INFO</level>
   		</filter>
        <!--文件滚动模式-->
        <rollingPolicy class="ch.qos.logback.core.rolling.TimeBasedRollingPolicy">
            <!--日志文件输出的文件名,可设置文件类型为gz,开启文件压缩-->
            <FileNamePattern>./logs/info.%d{yyyy-MM-dd}.%i.log.gz</FileNamePattern>
            <!--日志文件保留天数-->
            <MaxHistory>30</MaxHistory>
            <!--按大小分割同一天的-->
            <timeBasedFileNamingAndTriggeringPolicy class="ch.qos.logback.core.rolling.SizeAndTimeBasedFNATP">
                <maxFileSize>10MB</maxFileSize>
            </timeBasedFileNamingAndTriggeringPolicy>
        </rollingPolicy>
		
        <!--输出格式-->
        <encoder class="ch.qos.logback.classic.encoder.PatternLayoutEncoder">
            <!--格式化输出：%d表示日期，%thread表示线程名，%-5level：级别从左显示5个字符宽度%msg：日志消息，%n是换行符-->
            <pattern>%d{yyyy-MM-dd HH:mm:ss.SSS} [%thread] %-5level %logger{50} - %msg%n</pattern>
        </encoder>
    </appender>
	 <!--文件输出,时间窗口滚动-->
    <appender name="FILE_ERROR" class="ch.qos.logback.core.rolling.RollingFileAppender">
        <!--日志名,指定最新的文件名，其他文件名使用FileNamePattern -->
        <File>./logs/error.log</File>
        <!-- 过滤日志级别 -->
        <filter class="ch.qos.logback.classic.filter.ThresholdFilter">
      		<level>ERROR</level>
   		</filter>
        <!--文件滚动模式-->
        <rollingPolicy class="ch.qos.logback.core.rolling.TimeBasedRollingPolicy">
            <!--日志文件输出的文件名,可设置文件类型为gz,开启文件压缩-->
            <FileNamePattern>./logs/error.%d{yyyy-MM-dd}.%i.log.gz</FileNamePattern>
            <!--日志文件保留天数-->
            <MaxHistory>30</MaxHistory>
            <!--按大小分割同一天的-->
            <timeBasedFileNamingAndTriggeringPolicy class="ch.qos.logback.core.rolling.SizeAndTimeBasedFNATP">
                <maxFileSize>10MB</maxFileSize>
            </timeBasedFileNamingAndTriggeringPolicy>
        </rollingPolicy>
		
        <!--输出格式-->
        <encoder class="ch.qos.logback.classic.encoder.PatternLayoutEncoder">
            <!--格式化输出：%d表示日期，%thread表示线程名，%-5level：级别从左显示5个字符宽度%msg：日志消息，%n是换行符-->
            <pattern>%d{yyyy-MM-dd HH:mm:ss.SSS} [%thread] %-5level %logger{50} - %msg%n</pattern>
        </encoder>
    </appender>
	<root level="DEBUG">
		<appender-ref ref="console" />
		<!-- <appender-ref ref="FILE" />
		<appender-ref ref="FILE_ERROR" /> -->
	</root>
</configuration>
```



启动服务进行测试：

![image-20230227103846773](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230227103846773.png)



### alibaba-cloud-learn-examples-eureka-consumer-order

订单服务

#### application.yml 相关配置

```yaml
### 项目名
spring:
  application:
    name: alibaba-cloud-learn-examples-consumer-order     # 项目名称


### 服务端口
server:
  port: 80

logging:
  config: classpath:logback.xml
```



#### pom.xml引入配置

```xml
<dependencies>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-actuator</artifactId>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>


		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<optional>true</optional>
		</dependency>
	<!-- 引入公共模块 -->
		<dependency>
			<groupId>com.julong</groupId>
			<artifactId>alibaba-cloud-learn-examples-commons-api</artifactId>
			<version>0.0.1-SNAPSHOT</version>
		</dependency>
	</dependencies>
```

启动进行测试：

![image-20230227103945576](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230227103945576.png)

### alibaba-cloud-learn-examples-eureka-server

#### eureka 客户端 

客户端需要引入此配置才可以被注册中心使用

```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
    <version>2.1.0.RELEASE</version>
</dependency>
```

#### eureka 服务端

```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
    <version>2.1.0.RELEASE</version>
</dependency>
```

#### application.yml 相关配置

```yaml
### 项目名
spring:
  application:
    name: alibaba-cloud-learn-examples-eureka-server-7001     # 项目名称


### 服务端口
server:
  port: 7001

eureka:
  client:
    # 不需要注册自己
    register-with-eureka: false 
    # 标识本服务为注册中心 职责就是维护服务实例 并不需要取检索服务
    fetch-registry: false 
    service-url:
       ## 图形界面交互地址
       defaultZone: http://${eureka.instance.hostname}:${server.port}/eureka/  
## 日志配置
logging:
  config: classpath:logback.xml
```



#### 配置注册中心

需要在启动类中加入 @EnableEurekaServer

```java
/**
 * 主启动类
 * @author julong
 * @date 2023/2/26 13:05
 * @desc
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaMainApplication.class, args);
    }
}

```



访问页面：http://192.168.10.128:7001/

![image-20230227104016474](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230227104016474.png)

#### 程序改造

##### alibaba-cloud-learn-examples-eureka-provider-payment

启动类加入配置

```java
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
@EnableEurekaClient //启用eureka客户端配置
public class PaymentMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaymentMainApplication.class, args);
    }
}

```



application.yml 增加配置：

```yaml
### eureka配置
eureka:
  client:
    # 不需要注册自己
    register-with-eureka: true 
    # 标识本服务为注册中心 职责就是维护服务实例 并不需要取检索服务
    fetch-registry: true 
    service-url:
       ## 图形界面交互地址
       defaultZone: http://localhost:7001/eureka/  
```



注意：红色区域为eureka的保护机制

![image-20230227105327226](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230227105327226.png)

某一时刻注册的服务不会被删除 属于 CAP理论中的 AP（ 可用性和分区容错性）





##### alibaba-cloud-learn-examples-eureka-consumer-order

配置参考 ：alibaba-cloud-learn-examples-eureka-provider-payment



### eureka注册服务集群配置

创建工程 alibaba-cloud-learn-examples-eureka-server-one 配合 alibaba-cloud-learn-examples-eureka-server工程做集群

两个工程需要修改配置 

eureka.client.service-url.defaultZone 属性集群 使用,号隔开

#### alibaba-cloud-learn-examples-eureka-server

```yaml
### eureka配置
eureka:
  client:
    # 不需要注册自己
    register-with-eureka: false 
    # 标识本服务为注册中心 职责就是维护服务实例 并不需要取检索服务
    fetch-registry: false 
    service-url:
       ## 图形界面交互地址
       defaultZone: http://192.168.10.128:7002/eureka/ 
```

#### alibaba-cloud-learn-examples-eureka-server-one

```yaml
### eureka配置
eureka:
  client:
    # 不需要注册自己
    register-with-eureka: false 
    # 标识本服务为注册中心 职责就是维护服务实例 并不需要取检索服务
    fetch-registry: false 
    service-url:
       ## 图形界面交互地址
       defaultZone: http://192.168.10.128:7001/eureka/  
```

测试地址： http://192.168.10.128:7001/   http://192.168.10.128:7002/

![image-20230227115458131](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230227115458131.png)

可以相互看到对方的地址代表成功

### 服务注册

#### application.yml 中加入配置 

在 alibaba-cloud-learn-examples-provider-payment 、alibaba-cloud-learn-examples-consumer-order 

```yaml
### eureka配置
eureka:
  client:
    # 不需要注册自己
    register-with-eureka: true 
    # 标识本服务为注册中心 职责就是维护服务实例 并不需要取检索服务
    fetch-registry: true 
    service-url:
       ## 图形界面交互地址
       defaultZone: http://localhost:7001/eureka/,http://localhost:7002/eureka/
```

启动类添加配置

@EnableEurekaClient

#### alibaba-cloud-learn-examples-eureka-consumer-order

增加负载均衡配置

```java
package com.julong.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ApplicationConfig {

	@Bean
	@LoadBalanced //配置负载均衡
	public RestTemplate restTemplate(){
		return new RestTemplate();
	}
}

```

对应的访问地址 

```java
	@SuppressWarnings("unchecked")
	@GetMapping(value="/consumer/get/{paymentId}")
	public CommonResult<PaymentInfo> getPayment(@PathVariable("paymentId") long paymentId){
		return this.restTemplateImpl.getForObject("http://ALIBABA-CLOUD-LEARN-EXAMPLES-PROVIDER-PAYMENT/payment/get/"+paymentId, CommonResult.class);
	}
	
```

将127.0.0.1 或 localhost 改为服务名 ALIBABA-CLOUD-LEARN-EXAMPLES-PROVIDER-PAYMENT

注册成功页面

![image-20230227150721454](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230227150721454.png)

服务调用记录

![image-20230227150825533](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230227150825533.png)



### 问题解决

#### 主机名的修改

```yaml
eureka:
  instance:
    instance-id: ${spring.application.name}:${server.port}  # 服务实例名称  alibaba-cloud-learn-examples-provider-payment
```



#### ip地址显示的修改

```yaml
eureka:
  instance:
    prefer-ip-address: true ## 显示真实IP地址
```

#### 服务发现

com.netflix.discovery.EurekaClient

```java
@Autowired
private EurekaClient discoveryClient;

public String serviceUrl() {
    InstanceInfo instance = discoveryClient.getNextServerFromEureka("STORES", false);
    return instance.getHomePageUrl();
}
```



@EnableDiscoveryClient //启用服务发现

org.springframework.cloud.client.discovery.DiscoveryClient

```java
@Autowired
private DiscoveryClient discoveryClient;

public String serviceUrl() {
    List<ServiceInstance> list = discoveryClient.getInstances("STORES");
    if (list != null && list.size() > 0 ) {
        return list.get(0).getUri();
    }
    return null;
}
```



#### eureka 禁用自我保护

```yaml
eureka:
  server:
    enable-self-preservation: true ## 启用自我保护 改为false 为禁用自我保护
```



## 基于zookeeper的服务注册与发现

#### pom配置文件引入配置

```xml
<!-- 第一种引入方式-->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-zookeeper-discovery</artifactId>
</dependency>
<!-- 第二种引入方式-->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-zookeeper-all</artifactId>
    <exclusions>
        <exclusion>
            <groupId>org.apache.zookeeper</groupId>
            <artifactId>zookeeper</artifactId>
        </exclusion>
    </exclusions>
</dependency>
<dependency>
    <groupId>org.apache.zookeeper</groupId>
    <artifactId>zookeeper</artifactId>
    <version>3.4.12</version>
    <exclusions>
        <exclusion>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-log4j12</artifactId>
        </exclusion>
    </exclusions>
</dependency>

```

#### 配置zookeeper地址

```yaml
### 项目名
spring:
  cloud:        ### 配置 zookeeper地址
    zookeeper:
      connect-string: 192.168.10.222:2181
```

### alibaba-cloud-learn-examples-zookeeper-provider-payment

支付服务-服务生产者

#### 启动报错问题，zookeeper版本问题

![image-20230227182609462](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230227182609462.png)

修改maven pom 配置  需要修改为自己安装的zookeeper版本一致的版本信息

```xml
<!-- 引入 zookeeper注册中心 -->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-zookeeper-discovery</artifactId>
    <exclusions>
        <exclusion>
            <groupId>org.apache.zookeeper</groupId>
            <artifactId>zookeeper</artifactId>
        </exclusion>
    </exclusions>
</dependency>
<dependency>
    <groupId>org.apache.zookeeper</groupId>
    <artifactId>zookeeper</artifactId>
    <version>3.4.6</version>
</dependency>
```

重新启动服务 后正常

![image-20230227183048441](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230227183048441.png)

#### zookeeper 查看注册信息

```shell
[julong@localhost bin]$ ./zkCli.sh 
Connecting to localhost:2181
2023-02-27 18:21:10,304 [myid:] - INFO  [main:Environment@100] - Client environment:zookeeper.version=3.4.6-1569965, built on 02/20/2014 09:09 GMT
2023-02-27 18:21:10,311 [myid:] - INFO  [main:Environment@100] - Client environment:host.name=localhost
2023-02-27 18:21:10,311 [myid:] - INFO  [main:Environment@100] - Client environment:java.version=1.8.0_45
2023-02-27 18:21:10,313 [myid:] - INFO  [main:Environment@100] - Client environment:java.vendor=Oracle Corporation
2023-02-27 18:21:10,313 [myid:] - INFO  [main:Environment@100] - Client environment:java.home=/usr/etc/jdk1.8.0_45/jre
2023-02-27 18:21:10,313 [myid:] - INFO  [main:Environment@100] - Client environment:java.class.path=/home/julong/zookeeper-3.4.6/bin/../build/classes:/home/julong/zookeeper-3.4.6/bin/../build/lib/*.jar:/home/julong/zookeeper-3.4.6/bin/../lib/slf4j-log4j12-1.6.1.jar:/home/julong/zookeeper-3.4.6/bin/../lib/slf4j-api-1.6.1.jar:/home/julong/zookeeper-3.4.6/bin/../lib/netty-3.7.0.Final.jar:/home/julong/zookeeper-3.4.6/bin/../lib/log4j-1.2.16.jar:/home/julong/zookeeper-3.4.6/bin/../lib/jline-0.9.94.jar:/home/julong/zookeeper-3.4.6/bin/../zookeeper-3.4.6.jar:/home/julong/zookeeper-3.4.6/bin/../src/java/lib/*.jar:/home/julong/zookeeper-3.4.6/bin/../conf:.:/usr/etc/jdk1.8.0_45/lib:/usr/etc/jdk1.8.0_45/jre/lib
2023-02-27 18:21:10,313 [myid:] - INFO  [main:Environment@100] - Client environment:java.library.path=/usr/java/packages/lib/amd64:/usr/lib64:/lib64:/lib:/usr/lib
2023-02-27 18:21:10,313 [myid:] - INFO  [main:Environment@100] - Client environment:java.io.tmpdir=/tmp
2023-02-27 18:21:10,313 [myid:] - INFO  [main:Environment@100] - Client environment:java.compiler=<NA>
2023-02-27 18:21:10,314 [myid:] - INFO  [main:Environment@100] - Client environment:os.name=Linux
2023-02-27 18:21:10,314 [myid:] - INFO  [main:Environment@100] - Client environment:os.arch=amd64
2023-02-27 18:21:10,314 [myid:] - INFO  [main:Environment@100] - Client environment:os.version=3.10.0-123.el7.x86_64
2023-02-27 18:21:10,314 [myid:] - INFO  [main:Environment@100] - Client environment:user.name=julong
2023-02-27 18:21:10,314 [myid:] - INFO  [main:Environment@100] - Client environment:user.home=/home/julong
2023-02-27 18:21:10,314 [myid:] - INFO  [main:Environment@100] - Client environment:user.dir=/home/julong/zookeeper-3.4.6/bin
2023-02-27 18:21:10,316 [myid:] - INFO  [main:ZooKeeper@438] - Initiating client connection, connectString=localhost:2181 sessionTimeout=30000 watcher=org.apache.zookeeper.ZooKeeperMain$MyWatcher@3eb07fd3
Welcome to ZooKeeper!
2023-02-27 18:21:10,398 [myid:] - INFO  [main-SendThread(localhost:2181):ClientCnxn$SendThread@975] - Opening socket connection to server localhost/127.0.0.1:2181. Will not attempt to authenticate using SASL (unknown error)
JLine support is enabled
2023-02-27 18:21:10,504 [myid:] - INFO  [main-SendThread(localhost:2181):ClientCnxn$SendThread@852] - Socket connection established to localhost/127.0.0.1:2181, initiating session
2023-02-27 18:21:10,516 [myid:] - INFO  [main-SendThread(localhost:2181):ClientCnxn$SendThread@1235] - Session establishment complete on server localhost/127.0.0.1:2181, sessionid = 0x186924c68a60002, negotiated timeout = 30000

WATCHER::

WatchedEvent state:SyncConnected type:None path:null
[zk: localhost:2181(CONNECTED) 1] ls /
[dubbo, services, zookeeper]
[zk: localhost:2181(CONNECTED) 2] ls /services/alibaba-cloud-learn-examples-zookeeper-provider-payment/f16fd209-d5e8-4ce8-ab1a-5d3822f552c8
[]
[zk: localhost:2181(CONNECTED) 5] get /services/alibaba-cloud-learn-examples-zookeeper-provider-payment/f16fd209-d5e8-4ce8-ab1a-5d3822f552c8 
{"name":"alibaba-cloud-learn-examples-zookeeper-provider-payment","id":"f16fd209-d5e8-4ce8-ab1a-5d3822f552c8","address":"192.168.10.128","port":8004,"sslPort":null,"payload":{"@class":"org.springframework.cloud.zookeeper.discovery.ZookeeperInstance","id":"application-1","name":"alibaba-cloud-learn-examples-zookeeper-provider-payment","metadata":{}},"registrationTimeUTC":1677493734985,"serviceType":"DYNAMIC","uriSpec":{"parts":[{"value":"scheme","variable":true},{"value":"://","variable":false},{"value":"address","variable":true},{"value":":","variable":false},{"value":"port","variable":true}]}}
cZxid = 0x47
ctime = Mon Feb 27 18:28:57 CST 2023
mZxid = 0x47
mtime = Mon Feb 27 18:28:57 CST 2023
pZxid = 0x47
cversion = 0
dataVersion = 0
aclVersion = 0
ephemeralOwner = 0x186924c68a60004
dataLength = 601
numChildren = 0
[zk: localhost:2181(CONNECTED) 6] 

```

zookeeper 的节点是临时性的  CAP理论中的  CP （一致性和分区容错性）

### alibaba-cloud-learn-examples-zookeeper-consumer-order

配置调用方配置

```yaml
### 项目名
spring:
  application:
    name: alibaba-cloud-learn-examples-zookeeper-consumer-order    # 项目名称
  cloud:
    zookeeper:
      connect-string: 192.168.10.222:2181
```

```java
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
@EnableDiscoveryClient
public class OrderZookeeperMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderZookeeperMainApplication.class, args);
    }
}

```

方法调用：

![image-20230227193202566](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230227193202566.png)

## 基于Consul 的服务注册与发现

### consul安装

官网：https://developer.hashicorp.com/consul/downloads

```she
sudo yum install -y yum-utils
sudo yum-config-manager --add-repo https://rpm.releases.hashicorp.com/RHEL/hashicorp.repo
sudo yum -y install consul
```

linux 下载地址:https://releases.hashicorp.com/consul/1.15.0/consul_1.15.0_linux_arm64.zip

###  执行命令

```shell
consul agent -data-dir=./temp/consul -client=192.168.10.222 -dev
```

### 启动日志

```shell
[julong@localhost consul-1.15]$ ./consul agent -data-dir=./temp/consul -client=192.168.10.222 -dev
==> Starting Consul agent...
              Version: '1.15.0'
           Build Date: '2023-02-24 01:39:35 +0000 UTC'
              Node ID: '74f5e65d-3d36-17f2-b154-d91983e4256a'
            Node name: 'localhost.localdomain'
           Datacenter: 'dc1' (Segment: '<all>')
               Server: true (Bootstrap: false)
          Client Addr: [127.0.0.1] (HTTP: 8500, HTTPS: -1, gRPC: 8502, gRPC-TLS: 8503, DNS: 8600)
         Cluster Addr: 127.0.0.1 (LAN: 8301, WAN: 8302)
    Gossip Encryption: false
     Auto-Encrypt-TLS: false
            HTTPS TLS: Verify Incoming: false, Verify Outgoing: false, Min Version: TLSv1_2
             gRPC TLS: Verify Incoming: false, Min Version: TLSv1_2
     Internal RPC TLS: Verify Incoming: false, Verify Outgoing: false (Verify Hostname: false), Min Version: TLSv1_2

==> Log data will now stream in as it occurs:

2023-02-27T20:23:22.318+0800 [WARN]  agent: Node name "localhost.localdomain" will not be discoverable via DNS due to invalid characters. Valid characters include all alpha-numerics and dashes.
2023-02-27T20:23:22.326+0800 [DEBUG] agent.grpc.balancer: switching server: target=consul://dc1.74f5e65d-3d36-17f2-b154-d91983e4256a/server.dc1 from=<none> to=<none>
2023-02-27T20:23:22.339+0800 [WARN]  agent.auto_config: Node name "localhost.localdomain" will not be discoverable via DNS due to invalid characters. Valid characters include all alpha-numerics and dashes.
2023-02-27T20:23:22.361+0800 [INFO]  agent.server.raft: initial configuration: index=1 servers="[{Suffrage:Voter ID:74f5e65d-3d36-17f2-b154-d91983e4256a Address:127.0.0.1:8300}]"
2023-02-27T20:23:22.361+0800 [INFO]  agent.server.raft: entering follower state: follower="Node at 127.0.0.1:8300 [Follower]" leader-address= leader-id=
2023-02-27T20:23:22.363+0800 [INFO]  agent.server.serf.wan: serf: EventMemberJoin: localhost.localdomain.dc1 127.0.0.1
2023-02-27T20:23:22.364+0800 [INFO]  agent.server.serf.lan: serf: EventMemberJoin: localhost.localdomain 127.0.0.1
2023-02-27T20:23:22.364+0800 [INFO]  agent.router: Initializing LAN area manager
2023-02-27T20:23:22.364+0800 [DEBUG] agent.grpc.balancer: switching server: target=consul://dc1.74f5e65d-3d36-17f2-b154-d91983e4256a/server.dc1 from=<none> to=dc1-127.0.0.1:8300
2023-02-27T20:23:22.365+0800 [INFO]  agent.server: Handled event for server in area: event=member-join server=localhost.localdomain.dc1 area=wan
2023-02-27T20:23:22.366+0800 [INFO]  agent.server.autopilot: reconciliation now disabled
2023-02-27T20:23:22.366+0800 [INFO]  agent.server: Adding LAN server: server="localhost.localdomain (Addr: tcp/127.0.0.1:8300) (DC: dc1)"
2023-02-27T20:23:22.371+0800 [INFO]  agent.server.cert-manager: initialized server certificate management
2023-02-27T20:23:22.372+0800 [INFO]  agent: Started DNS server: address=127.0.0.1:8600 network=udp
2023-02-27T20:23:22.371+0800 [DEBUG] agent.server.autopilot: autopilot is now running
2023-02-27T20:23:22.373+0800 [DEBUG] agent.server.autopilot: state update routine is now running
2023-02-27T20:23:22.374+0800 [INFO]  agent: Started DNS server: address=127.0.0.1:8600 network=tcp
2023-02-27T20:23:22.375+0800 [DEBUG] agent.hcp_manager: HCP manager starting
2023-02-27T20:23:22.375+0800 [INFO]  agent: Starting server: address=127.0.0.1:8500 network=tcp protocol=http
2023-02-27T20:23:22.376+0800 [INFO]  agent: Started gRPC listeners: port_name=grpc address=127.0.0.1:8502 network=tcp
2023-02-27T20:23:22.376+0800 [INFO]  agent: Started gRPC listeners: port_name=grpc_tls address=127.0.0.1:8503 network=tcp
2023-02-27T20:23:22.377+0800 [INFO]  agent: started state syncer
2023-02-27T20:23:22.377+0800 [INFO]  agent: Consul agent running!

```

访问地址： http://192.168.10.222:8500/

![image-20230227204753330](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230227204753330.png)



### alibaba-cloud-learn-examples-consul-provider-payment



#### pom文件配置

```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-consul-discovery</artifactId>
</dependency>
```



#### application.yml 配置

```yaml
## consul 配置
spring:
  cloud:
    consul:
      discovery:
        enabled: true ## 启用consul配置
        service-name: ${spring.application.name}  ## 服务名称
      host: 192.168.10.222 ## 服务地址
      port: 8500 ## 服务端口

```

### alibaba-cloud-learn-examples-consul-consumer-order

配置参考生产者配置



## CAP理论

eureka 为 AP 可用性、容错性

zookeeper 、Consul 为 CP  一致性、容错性

## 基于Netflix Ribbon的本地负载均衡

默认在此配置中已引入 ribbon 配置

```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
    <version>2.2.1.RELEASE</version>
</dependency>
```

也可以单独引入

```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-ribbon</artifactId>
</dependency>
```



#### 自定义加载负载算法

##### SelfRuleConfiguration 

自定义加载规则需要不通过@ComponentScan or @SpringBootApplication 包扫描

```txt
The CustomConfiguration class must be a @Configuration class, but take care that it is not in a @ComponentScan for the main application context. Otherwise, it is shared by all the @RibbonClients. If you use @ComponentScan (or @SpringBootApplication), you need to take steps to avoid it being included (for instance, you can put it in a separate, non-overlapping package or specify the packages to scan explicitly in the @ComponentScan). 
```

com.ribbon.rule

```java
package com.ribbon.rule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

/**
 * 自定义负载方法
 * @author julong
 * @date 2023年2月28日 上午9:27:45
 * @desc 
 */
@Configuration
public class SelfRuleConfiguration {

	@Bean
	public IRule ribbonRule() {
		//随机
		return new RandomRule();
	}
}

```

主启动类

##### OrderMainApplication

@RibbonClient(name = "ALIBABA-CLOUD-LEARN-EXAMPLES-PROVIDER-PAYMENT", configuration = SelfRuleConfiguration.class)

name 调用服务名称

configuration  自定义规则类

```java
package com.julong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.ribbon.rule.SelfRuleConfiguration;

/**
 * 主启动类
 * @author julong
 * @date 2023/2/26 13:05
 * @desc
 */
@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name = "ALIBABA-CLOUD-LEARN-EXAMPLES-PROVIDER-PAYMENT", configuration = SelfRuleConfiguration.class)
public class OrderMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderMainApplication.class, args);
    }
}

```

## 基于OpenFeign的服务调用

### alibaba-cloud-learn-examples-eureka-feign-consumer-order

### pom文件引入配置

```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-openfeign</artifactId>
</dependency>

```



### 定义feign 接口

PaymentFeignService.java

```java
package com.julong.system.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.julong.response.CommonResult;
import com.julong.system.dao.entity.PaymentInfo;

/**
 * 自定义feign
 * @author julong
 * @date 2023/2/26 21:18
 * @desc
 */
@FeignClient(value="ALIBABA-CLOUD-LEARN-EXAMPLES-PROVIDER-PAYMENT")
public interface PaymentFeignService {

	@GetMapping(value="/payment/get/{paymentId}")
	public CommonResult<PaymentInfo> getPayment(@PathVariable("paymentId") long paymentId);
}

```

OrderAction.java

```java
package com.julong.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.julong.response.CommonResult;
import com.julong.system.dao.entity.PaymentInfo;
import com.julong.system.service.PaymentFeignService;

/**
 * 订单调用
 * @author julong
 * @date 2023年2月26日 下午10:35:01
 * @desc 
 */
@RestController
public class OrderAction {

	@Autowired
	private PaymentFeignService paymentFeignServiceImpl;
	
	@GetMapping(value="/consumer/get/{paymentId}")
	public CommonResult<PaymentInfo> getPayment(@PathVariable("paymentId") long paymentId){
		return this.paymentFeignServiceImpl.getPayment(paymentId);
	}
	
}

```



### 启用 feign 配置

@EnableFeignClients

```java
package com.julong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 主启动类
 * @author julong
 * @date 2023/2/26 13:05
 * @desc
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class OrderMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderMainApplication.class, args);
    }
}

```



![image-20230228102827904](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230228102827904.png)

### openFeign 超时问题

openFeign默认等待1秒钟 超时后报错

在 服务方增加测试代码

alibaba-cloud-learn-examples-eureka-provider-payment  PaymentAction.java

```java
/**
	 * 测试feign超时
	 * @return
	 * @author julong
	 * @date 2023年2月28日 上午10:35:25
	 * @desc
	 */
	@GetMapping(value="/payment/timeout")
	public String feignTimeout(){
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.serverPort;
	}
```



alibaba-cloud-learn-examples-eureka-feign-consumer-order PaymentFeignService.java

```java
package com.julong.system.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.julong.response.CommonResult;
import com.julong.system.dao.entity.PaymentInfo;

/**
 * 自定义feign
 * @author julong
 * @date 2023/2/26 21:18
 * @desc
 */
@FeignClient(value="ALIBABA-CLOUD-LEARN-EXAMPLES-PROVIDER-PAYMENT")
public interface PaymentFeignService {

	@GetMapping(value="/payment/get/{paymentId}")
	public CommonResult<PaymentInfo> getPayment(@PathVariable("paymentId") long paymentId);
	
	@GetMapping(value="/payment/timeout")
	public String feignTimeout();
}

```

OrderAction.java

```java
	/**
	 * 测试超时
	 * @return
	 * @author julong
	 * @date 2023年2月28日 上午10:39:32
	 * @desc
	 */
	@GetMapping(value="/consumer/timeout")
	public String feignTimeout(){
		return this.paymentFeignServiceImpl.feignTimeout();
	}
	
```

服务自测

http://192.168.10.128:8001/payment/timeout

![image-20230228104236770](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230228104236770.png)

服务调用超时效果

![image-20230228104410262](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230228104410262.png)



通过参数配置修改超时问题

```yaml
## 设置feign客户端超时
feign:
  client:
    config:
      default:
        connectTimeout: 5000 ## 设置建立连接后从服务器读取数据的所用时间
        readTimeout: 5000 ## 设置双方连接时间超时
        loggerLevel: basic ## 日志级别
```

对应的参数位于：

​	org.springframework.cloud.openfeign.FeignClientProperties.class

​				FeignClientConfiguration 内部类中 参数列举如下

```java
		private Logger.Level loggerLevel;

		private Integer connectTimeout;

		private Integer readTimeout;

		private Class<Retryer> retryer;

		private Class<ErrorDecoder> errorDecoder;

		private List<Class<RequestInterceptor>> requestInterceptors;

		private Boolean decode404;

		private Class<Decoder> decoder;

		private Class<Encoder> encoder;

		private Class<Contract> contract;
```

### 日志配置

application.yml

```java
logging.level.com.julong.system.service.PaymentFeignService: DEBUG
```



The Logger.Level object that you may configure per client, tells Feign how much to log. Choices are:

    NONE, No logging (DEFAULT).
    
    BASIC, Log only the request method and URL and the response status code and execution time.
    
    HEADERS, Log the basic information along with request and response headers.
    
    FULL, Log the headers, body, and metadata for both requests and responses.


## 基于Netflix Hystrix 服务器熔断、降级、限流

Hystrix 是用于处理分布式系统的延迟和容错的开源库 ，能够保证在一个依赖服务出现故障的情况下不会导致整体服务不可用，避免级联失败 提高系统的可用性

https://github.com/Netflix/Hystrix

```java
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-hystrix</artifactId>
</dependency>
```

### 服务降级

当服务器忙时 不让客户端处于等待状态，并给一个友好的提示。包括：

​	程序运行异常、超时、服务熔断触发服务降级、线程池信号量满

### 服务熔断

达到最大访问数时 直接拒绝访问 ，调用服务降级的 方法并友好返回提示

### 服务限流

QPS一秒允许的访问数量、处理数量 意思排队等待一个一个处理

### alibaba-cloud-learn-examples-eureka-hystrix-server

服务中心

### alibaba-cloud-learn-examples-eureka-hystrix-provider-payment

服务生产者

#### 增加主配置 @EnableCircuitBreaker

```java
package com.julong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
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
@EnableCircuitBreaker  //启用hystrix 注解
public class PaymentHystrixMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(PaymentHystrixMainApplication.class, args);
    }
}

```



#### 业务方法 PaymentServiceImpl类

```java
	@HystrixCommand(fallbackMethod="hystrixTimeoutHandler",commandProperties = {
		      @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds", value="3000")
		    })
	@Override
	public int testHystrix() throws Exception {
		// TODO Auto-generated method stub
		TimeUnit.SECONDS.sleep(5);
		return 0;
	}
    
    /**
     * 失败调用方法
     * @return
     * @author julong
     * @date 2023年2月28日 下午2:33:42
     * @desc
     */
    public int hystrixTimeoutHandler(){
    	
    	return 999;
    }
    
```



execution.isolation.thread.timeoutInMilliseconds 超时设置

#### 服务降级配置

```java
	@HystrixCommand(fallbackMethod="hystrixTimeoutHandler",commandProperties = {
		      @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds", value="3000")
		    })
```

#### 测试示例

![image-20230228144607276](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230228144607276.png)



### alibaba-cloud-learn-examples-eureka-hystrix-feign-consumer-order

#### 客户端服务启用服务降级

```yaml
feign:
  hystrix:
    enabled: true ## 启用服务降级
  
```

#### 服务降级配置

OrderHystrixMainApplication.java

```java
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

```

OrderAction.java

```java
package com.julong.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.julong.response.CommonResult;
import com.julong.system.dao.entity.PaymentInfo;
import com.julong.system.service.PaymentFeignService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

/**
 * 订单调用
 * @author julong
 * @date 2023年2月26日 下午10:35:01
 * @desc 
 */
@RestController
public class OrderAction {

	@Autowired
	private PaymentFeignService paymentFeignServiceImpl;
	
	/**
	 * 查询方法
	 * @param paymentId
	 * @return
	 * @author julong
	 * @date 2023年2月28日 上午10:39:24
	 * @desc
	 */
	@GetMapping(value="/consumer/get/{paymentId}")
	public CommonResult<PaymentInfo> getPayment(@PathVariable("paymentId") long paymentId){
		return this.paymentFeignServiceImpl.getPayment(paymentId);
	}
	
	
	/**
	 * 测试超时
	 * @return
	 * @author julong
	 * @date 2023年2月28日 上午10:39:32
	 * @desc
	 */
	@GetMapping(value="/consumer/timeout")
	@HystrixCommand(fallbackMethod="hystrixTimeoutHandler",commandProperties = {
		      @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds", value="6000")
		    })
	public String hystrixTimeout(){
		return this.paymentFeignServiceImpl.hystrixTimeout();
	}
	
	
	  /**
     * 失败调用方法
     * @return
     * @author julong
     * @date 2023年2月28日 下午2:33:42
     * @desc
     */
    public String hystrixTimeoutHandler(){
    	
    	return "客户端请求异常";
    }
}

```



使用服务降级后效果

![image-20230228145536873](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230228145536873.png)



未使用hystrix接口调用地址：http://192.168.10.128/consumer/timeout  出现如下错误：

![image-20230228141047966](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230228141047966.png)



#### 类服务降级配置

```java
@RestController
@DefaultProperties(defaultFallback="GlobalHystrixFallbackMethod")
public class OrderAction {
    ......
   /**
	 * 全局异常处理
	 * @return
	 * @author julong
	 * @date 2023年2月28日 下午3:02:55
	 * @desc
	 */
	@HystrixCommand
	@GetMapping(value="/consumer/timeout1")
	public String hystrixTimeout1(){
		return this.paymentFeignServiceImpl.hystrixTimeout();
	} 
    
   /**
	 * 全局hystrix配置
	 * @return
	 * @author julong
	 * @date 2023年2月28日 下午2:59:55
	 * @desc
	 */
	public String GlobalHystrixFallbackMethod(){

		return "全局客户端请求异常";
	}
}    
```

![image-20230228150519254](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230228150519254.png)



#### 全局服务降级配置

##### 创建全局处理类

```java
package com.julong.system.service.fallback;

import org.springframework.stereotype.Service;

import com.julong.response.CommonResult;
import com.julong.system.dao.entity.PaymentInfo;
import com.julong.system.service.PaymentFeignService;

/**
 * 服务降级全局处理类
 * @author julong
 * @date 2023年2月28日 下午3:28:26
 * @desc 
 */
@Service
public class PaymentFallBack implements PaymentFeignService{

	@Override
	public CommonResult<PaymentInfo> getPayment(long paymentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String hystrixTimeout() {
		// TODO Auto-generated method stub
		return "全局定义服务层接口异常返回";
	}

}

```



##### PaymentFeignService 调用配置

@FeignClient(value="ALIBABA-CLOUD-LEARN-EXAMPLES-HYSTRIX-PROVIDER-PAYMENT",fallback=PaymentFallBack.class)

```java
package com.julong.system.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.julong.response.CommonResult;
import com.julong.system.dao.entity.PaymentInfo;
import com.julong.system.service.fallback.PaymentFallBack;

/**
 * 自定义feign
 * @author julong
 * @date 2023/2/26 21:18
 * @desc
 */
@FeignClient(value="ALIBABA-CLOUD-LEARN-EXAMPLES-HYSTRIX-PROVIDER-PAYMENT",fallback=PaymentFallBack.class)
public interface PaymentFeignService {

	@GetMapping(value="/payment/get/{paymentId}")
	public CommonResult<PaymentInfo> getPayment(@PathVariable("paymentId") long paymentId);
	
	@GetMapping(value="/payment/timeout")
	public String hystrixTimeout();
	
}

```



控制器调用测试方法

```java
	/**
	 * 全局服务异常
	 * @return
	 * @author julong
	 * @date 2023年2月28日 下午3:27:50
	 * @desc
	 */
	@GetMapping(value="/consumer/timeout2")
	public String hystrixTimeout2(){
		return this.paymentFeignServiceImpl.hystrixTimeout();
	}
```



![image-20230228153103586](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230228153103586.png)





### 服务熔断配置



![image-20230228153707010](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230228153707010.png)

![image-20230228153836679](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230228153836679.png)

#### 对应的参数属性类地址

com.netflix.hystrix.contrib.javanica.conf.HystrixPropertiesManager.class

```java
/**
     * Command execution properties.
     */
    public static final String EXECUTION_ISOLATION_STRATEGY = "execution.isolation.strategy";
    public static final String EXECUTION_ISOLATION_THREAD_TIMEOUT_IN_MILLISECONDS = "execution.isolation.thread.timeoutInMilliseconds";
    public static final String EXECUTION_TIMEOUT_ENABLED = "execution.timeout.enabled";
    public static final String EXECUTION_ISOLATION_THREAD_INTERRUPT_ON_TIMEOUT = "execution.isolation.thread.interruptOnTimeout";
    public static final String EXECUTION_ISOLATION_SEMAPHORE_MAX_CONCURRENT_REQUESTS = "execution.isolation.semaphore.maxConcurrentRequests";

    /**
     * Command fallback properties.
     */
    public static final String FALLBACK_ISOLATION_SEMAPHORE_MAX_CONCURRENT_REQUESTS = "fallback.isolation.semaphore.maxConcurrentRequests";
    public static final String FALLBACK_ENABLED = "fallback.enabled";

    /**
     * Command circuit breaker properties.
     */
    public static final String CIRCUIT_BREAKER_ENABLED = "circuitBreaker.enabled";
    public static final String CIRCUIT_BREAKER_REQUEST_VOLUME_THRESHOLD = "circuitBreaker.requestVolumeThreshold";
    public static final String CIRCUIT_BREAKER_SLEEP_WINDOW_IN_MILLISECONDS = "circuitBreaker.sleepWindowInMilliseconds";
    public static final String CIRCUIT_BREAKER_ERROR_THRESHOLD_PERCENTAGE = "circuitBreaker.errorThresholdPercentage";
    public static final String CIRCUIT_BREAKER_FORCE_OPEN = "circuitBreaker.forceOpen";
    public static final String CIRCUIT_BREAKER_FORCE_CLOSED = "circuitBreaker.forceClosed";

    /**
     * Command metrics properties.
     */
    public static final String METRICS_ROLLING_PERCENTILE_ENABLED = "metrics.rollingPercentile.enabled";
    public static final String METRICS_ROLLING_PERCENTILE_TIME_IN_MILLISECONDS = "metrics.rollingPercentile.timeInMilliseconds";
    public static final String METRICS_ROLLING_PERCENTILE_NUM_BUCKETS = "metrics.rollingPercentile.numBuckets";
    public static final String METRICS_ROLLING_PERCENTILE_BUCKET_SIZE = "metrics.rollingPercentile.bucketSize";
    public static final String METRICS_HEALTH_SNAPSHOT_INTERVAL_IN_MILLISECONDS = "metrics.healthSnapshot.intervalInMilliseconds";

    /**
     * Command CommandRequest Context properties.
     */
    public static final String REQUEST_CACHE_ENABLED = "requestCache.enabled";
    public static final String REQUEST_LOG_ENABLED = "requestLog.enabled";

    /**
     * Thread pool properties.
     */
    public static final String MAX_QUEUE_SIZE = "maxQueueSize";
    public static final String CORE_SIZE = "coreSize";
    public static final String KEEP_ALIVE_TIME_MINUTES = "keepAliveTimeMinutes";
    public static final String QUEUE_SIZE_REJECTION_THRESHOLD = "queueSizeRejectionThreshold";
    public static final String METRICS_ROLLING_STATS_NUM_BUCKETS = "metrics.rollingStats.numBuckets";
    public static final String METRICS_ROLLING_STATS_TIME_IN_MILLISECONDS = "metrics.rollingStats.timeInMilliseconds";

    /**
     * Collapser properties.
     */
    public static final String MAX_REQUESTS_IN_BATCH = "maxRequestsInBatch";
    public static final String TIMER_DELAY_IN_MILLISECONDS = "timerDelayInMilliseconds";
```





```java
/**
     * 测试服务熔断
     * @return
     * @throws Exception
     * @author julong
     * @date 2023年2月28日 下午4:16:46
     * @desc
     */
    @Override
    @HystrixCommand(fallbackMethod = "circuitBreakerFallback",commandProperties = {
    		@HystrixProperty(name = "circuitBreaker.enabled",value="true"),//是否开启断路器   默认为true
    		@HystrixProperty(name = "circuitBreaker.requestVolumeThreshold",value="10"),//请求次数   默认为20
    		@HystrixProperty(name = "circuitBreaker.sleepWindowInMilliseconds",value="10000"),//时间窗口期   默认为5000
    		@HystrixProperty(name = "circuitBreaker.errorThresholdPercentage",value="50"),//失败率达到多少跳闸   默认为50
    })
    public String testCircuitBreaker(int id) {
    	// TODO Auto-generated method stub
    	if(id < 10){
    		throw new RuntimeException("数字过小！");
    	}
    	return "数字符合要求！";
    }
    
    public String circuitBreakerFallback(int id){
    	return "circuitBreakerFallback方法发生错误！请稍后再试！";
    }
```

#### 属性参数

文档地址 https://github.com/Netflix/Hystrix/wiki/Configuration   


        Execution
            execution.isolation.strategy
            execution.isolation.thread.timeoutInMilliseconds
            execution.timeout.enabled
            execution.isolation.thread.interruptOnTimeout
            execution.isolation.thread.interruptOnCancel
            execution.isolation.semaphore.maxConcurrentRequests
        Fallback
            fallback.isolation.semaphore.maxConcurrentRequests
            fallback.enabled
        Circuit Breaker
            circuitBreaker.enabled
            circuitBreaker.requestVolumeThreshold
            circuitBreaker.sleepWindowInMilliseconds
            circuitBreaker.errorThresholdPercentage
            circuitBreaker.forceOpen
            circuitBreaker.forceClosed
        Metrics
            metrics.rollingStats.timeInMilliseconds
            metrics.rollingStats.numBuckets
            metrics.rollingPercentile.enabled
            metrics.rollingPercentile.timeInMilliseconds
            metrics.rollingPercentile.numBuckets
            metrics.rollingPercentile.bucketSize
            metrics.healthSnapshot.intervalInMilliseconds
        Request Context
            requestCache.enabled
            requestLog.enabled
    Collapser Properties
        maxRequestsInBatch
        timerDelayInMilliseconds
        requestCache.enabled
    Thread Pool Properties
        coreSize
        maximumSize
        maxQueueSize
        queueSizeRejectionThreshold
        keepAliveTimeMinutes
        allowMaximumSizeToDivergeFromCoreSize
        metrics.rollingStats.timeInMilliseconds
        metrics.rollingStats.numBuckets
## 基于Netflix Hystrix Dashboard 配置

### pom 引入配置

```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-hystrix-dashboard</artifactId>
</dependency>
```

因为集成eureka 访问地址如下进行访问

访问地址：http://192.168.10.128:9001/hystrix



![image-20230228170540621](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230228170540621.png)



错误解决：

![image-20230228171839707](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230228171839707.png)



在对应的服务中需要加上此配置 方可使用

```java
@Bean
public ServletRegistrationBean<HystrixMetricsStreamServlet>  getServlet(){
    HystrixMetricsStreamServlet streamServlet = new HystrixMetricsStreamServlet();
    ServletRegistrationBean<HystrixMetricsStreamServlet> servletRegistrationBean = new ServletRegistrationBean<HystrixMetricsStreamServlet>(streamServlet);
    servletRegistrationBean.setLoadOnStartup(1);
    servletRegistrationBean.addUrlMappings("/hystrix.stream");
    servletRegistrationBean.setName("HystrixMetricsStreamServlet");
    return servletRegistrationBean;
}
```



## 基于Zuul的网关配置

pom引入配置

```java
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-zuul</artifactId>
</dependency>
```

![image-20230228175725400](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230228175725400.png)

#### 注册中心服务

alibaba-cloud-learn-examples-zuul-eureka-server

#### 支付服务

alibaba-cloud-learn-examples-zuul-provider-payment

#### 网关服务

alibaba-cloud-learn-examples-zuul-server

#### application.yml配置

```yaml
zuul:
  routes:
    users:
      path: /myusers/**
      serviceId: alibaba-cloud-learn-examples-hystrix-provider-payment
      
  prefix: /api  ## 配置统一访问路径
```

@EnableZuulProxy

```java
package com.julong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * 主启动类
 * @author julong
 * @date 2023/2/26 13:05
 * @desc
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy //启用zuul代理
public class ZuulMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulMainApplication.class, args);
    }
}

```

测试 是否成功

![image-20230228184443184](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230228184443184.png)

## 基于Spring Cloud Gateway的网关配置

![image-20230228195651376](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230228195651376.png)

#### 注册中心服务

alibaba-cloud-learn-examples-gateway-eureka-server

#### 网关服务

alibaba-cloud-learn-examples-gateway-server

#### 支付服务

alibaba-cloud-learn-examples-gateway-provider-payment

application.yml

```yaml
### 项目名
spring:
  application:
    name: alibaba-cloud-learn-examples-getway-server-9000    # 项目名称
  cloud:
    gateway:
      enabled: true
      routes:
        - id: alibaba-cloud-learn-examples-hystrix-provider-payment ## 路由编号  建议使用服务名称 唯一标识
#          uri: http://localhost:8001  ## 请求地址
          uri: lb://alibaba-cloud-learn-examples-hystrix-provider-payment  ## 请求地址
          predicates:                 ## 断言 路径相匹配的路由
            - Path=/payment/**,/admin/**   ## 根据路径匹配路由
      discovery:
        locator:
          enabled: true ## 启用动态路由
```



predicates参数解释：

#### Path 

匹配路径 ：Path=/payment/**,/admin/**

```shell
[julong@localhost ~]$ curl http://192.168.10.128:9000/payment/get/1
{"code":200,"message":"查询成功8001","times":1677587129486,"data":{"paymentId":1,"paymentSerial":"1q1q1q1q1"}}
[julong@localhost ~]$ 

```



#### After 

特定时间之后执行：After=2017-01-20T17:42:47.789-07:00[America/Denver]

#### Before

 特定时间之前执行：Before=2017-01-20T17:42:47.789-07:00[America/Denver]

#### Between 

特定时间之间执行：Between=2017-01-20T17:42:47.789-07:00[America/Denver], 2017-01-21T17:42:47.789-07:00[America/Denver]

#### Cookie

自定义cookie规则： Cookie=chocolate, ch.p

```shell
[julong@localhost ~]$ curl http://192.168.10.128:9000/payment/get/1 --cookie "username=julong"
{"code":200,"message":"查询成功8001","times":1677587381009,"data":{"paymentId":1,"paymentSerial":"1q1q1q1q1"}}
[julong@localhost ~]$ 

```



#### Header

自定义请求头规则：Header=X-Request-Id, \d+

#### Host

请求头规则：Host=.somehost.org,**.anotherhost.org



![image-20230228204100623](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230228204100623.png)

#### 自定义filter

```java
package com.julong.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import reactor.core.publisher.Mono;

/**
 * 自定义filter
 * @author julong
 * @date 2023年2月28日 下午8:51:09
 * @desc 
 */
@Component
public class CustomGlobalFilter implements GlobalFilter, Ordered {

	private static final Logger logger = LoggerFactory.getLogger(CustomGlobalFilter.class);
	
	@Override
	public int getOrder() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
		// TODO Auto-generated method stub
		String username = exchange.getRequest().getQueryParams().getFirst("username");
		if(username == null){
			logger.info("【CustomGlobalFilter】-用户名为空");
			exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
			return exchange.getResponse().setComplete();
		}
		return chain.filter(exchange);
	}

}

```

![image-20230228205616289](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230228205616289.png)

## 基于Spring Cloud Config的配置中心

目标：集中管理配置文件

```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-config-server</artifactId>
</dependency>

```

### 配置服务注册中心

alibaba-cloud-learn-examples-config-eureka-server

### git配置中心

alibaba-cloud-learn-examples-config-git-server

#### application.yml配置

```yaml
### 项目名
spring:
  application:
    name: alibaba-cloud-learn-examples-config-git-server    # 项目名称

  cloud:
    config:
      enabled: true   ##启用config配置
      server:
        git:
          uri: https://gitee.com/julong/spring-cloud-config.git
          search-paths:
            - spring-cloud-config
          default-label: master    ## 分支信息
          username: koudailidexiaolong@163.com   ## 账号密码信息
          password: xiaolong0627
### 服务端口
server:
  port: 7007

### eureka配置
eureka:
  instance:
    instance-id: ${spring.application.name}:${server.port}  # 服务实例名称  alibaba-cloud-learn-examples-provider-payment
    prefer-ip-address: true ## 显示真实IP地址
  client:
    # 不需要注册自己
    register-with-eureka: true 
    # 标识本服务为注册中心 职责就是维护服务实例 并不需要取检索服务
    fetch-registry: true 
    service-url:
       ## 图形界面交互地址
       defaultZone: http://localhost:7001/eureka/
    
## 日志配置
logging:
  config: classpath:logback.xml
  

```

#### ConfigGitMainApplication启动类配置

```java
package com.julong;

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
public class ConfigGitMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigGitMainApplication.class, args);
    }
}

```



git上提前准备配置文件

![image-20230301102303547](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230301102303547.png)

直接以url的方式访问：

http://192.168.10.128:7007/master/application-dev.properties

![image-20230301102437435](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230301102437435.png)

以文件规则的方式访问：

http://192.168.10.128:7007/application/dev/master

![image-20230301102418788](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230301102418788.png)

配置访问方式

```prop
/{application}/{profile}[/{label}]
/{application}-{profile}.yml
/{label}/{application}-{profile}.yml
/{application}-{profile}.properties
/{label}/{application}-{profile}.properties




The Config Service serves property sources from /{application}/{profile}/{label}, where the default bindings in the client app are as follows:

    "name" = ${spring.application.name}

    "profile" = ${spring.profiles.active} (actually Environment.getActiveProfiles())

    "label" = "master"


```

#### 客户端调用测试

alibaba-cloud-learn-examples-config-git-client

***注意***

![image-20230301113611943](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230301113611943.png)

因为bootstarp.yml 高于 application.yml   以下config 配置才会生效

bootstarp.yml

```yaml
### 项目名
spring:
  application:
    name: alibaba-cloud-learn-examples-config-git-client    # 项目名称

  cloud:
    config:
      uri:
        - http://192.168.10.128:7007/
      label: master ## 分支信息
      name: application ##配置名称
      profile: dev ## 文件后缀名
      enabled: true
      
### 服务端口
server:
  port: 7008

### eureka配置
eureka:
  instance:
    instance-id: ${spring.application.name}:${server.port}  # 服务实例名称  alibaba-cloud-learn-examples-provider-payment
    prefer-ip-address: true ## 显示真实IP地址
  client:
    # 不需要注册自己
    register-with-eureka: true 
    # 标识本服务为注册中心 职责就是维护服务实例 并不需要取检索服务
    fetch-registry: true 
    service-url:
       ## 图形界面交互地址
       defaultZone: http://localhost:7001/eureka/
    
## 日志配置
logging:
  config: classpath:logback.xml
  

```

测试类

```java
package com.julong.action;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexAction {

	@Value("${welcome.message}")
	private String message;
	
	@GetMapping(value="")
	public String readConfig(){
		
		return "test git client!"+message;
	}
}

```

![image-20230301113843440](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230301113843440.png)

#### 客户端获取最新配置文件

需要增加配置 bootstarp.yml 

```yaml
  
## 开启健康监控端点web访问  
management:
  endpoints:
    web:
      exposure:
        include: "*"
```



访问层类需要加载@RefreshScope 注解

```java
package com.julong.action;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope //手动刷新标签
public class IndexAction {

	/**
	 * 此信息为远程配置信息
	 * @author julong
	 * @date 2023年3月1日 下午12:50:13
	 */
	@Value("${welcome.message}")
	private String message;
	
	@GetMapping(value="")
	public String readConfig(){
		
		return "test git client!"+message;
	}
}


```

/actuator/refresh to re-load the boot strap context and refresh the @RefreshScope beans.



![image-20230301140935078](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230301140935078.png)

![image-20230301141013415](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230301141013415.png)



需要通过post 请求 执行 http://192.168.10.128:7008/actuator/refresh 客户端服务读取配置中心的配置才会刷新

```powershell
C:\Users\julong>curl -X POST "http://192.168.10.128:7008/actuator/refresh"
["config.client.version","welcome.message"]
C:\Users\julong>

```

![image-20230301141049629](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230301141049629.png)



### 本地化配置中心

alibaba-cloud-learn-examples-config-local-server

![image-20230301144309783](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230301144309783.png)

根据官网的解释 本地化加载需要配置  spring.profiles.active=native 属性 指定读取本地

```yaml
### 项目名
spring:
  application:
    name: alibaba-cloud-learn-examples-config-local-server    # 项目名称

  cloud:
    config:
      enabled: true   ##启用config配置
      server:
        native:
          search-locations:
            - file:///D:/spring-config
  profiles:
    active:
      - native ## 指定本地化加载
```

调用示例：

![image-20230301144554301](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230301144554301.png)

![image-20230301144602795](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230301144602795.png)

## 基于 Spring Cloud Bus 消息总线配置

消息访问页面：http://192.168.10.222:15672/#/queues

消息总线设计思想：

​	第一种利用消息总线触发一个客户端 /bus/refresh 刷新所有客户端的配置

​	第二种利用消息总线触发一个配置服务端config-server服务的  /bus/refresh 端点 刷新所有客户端的配置

#### pom文件引入配置

```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-bus-amqp</artifactId>
</dependency>
		
```

#### 引入rabbitmq配置

alibaba-cloud-learn-examples-config-bus-server

```yaml
### 项目名
spring:
  application:
    name: alibaba-cloud-learn-examples-config-bus-server    # 项目名称

  cloud:
    config:
      enabled: true   ##启用config配置
      server:
        git:
          uri: https://gitee.com/julong/spring-cloud-config.git
          search-paths:
            - spring-cloud-config
          default-label: master    ## 分支信息
          username: koudailidexiaolong@163.com   ## 账号密码信息
          password: xiaolong0627
    
## 配置 rabbitmq
  rabbitmq:
    host: 192.168.10.222
    port: 5672
    username: julong
    password: julong  
### 服务端口
server:
  port: 7007

### eureka配置
eureka:
  instance:
    instance-id: ${spring.application.name}:${server.port}  # 服务实例名称  alibaba-cloud-learn-examples-provider-payment
    prefer-ip-address: true ## 显示真实IP地址
  client:
    # 不需要注册自己
    register-with-eureka: true 
    # 标识本服务为注册中心 职责就是维护服务实例 并不需要取检索服务
    fetch-registry: true 
    service-url:
       ## 图形界面交互地址
       defaultZone: http://localhost:7001/eureka/
    
## 日志配置
logging:
  config: classpath:logback.xml
  
  
## 开启健康监控端点web访问  
management:
  endpoints:
    web:
      exposure:
        include: "bus-refresh"


```

alibaba-cloud-learn-examples-config-bus-client

bootstrap.yml

```yaml
### 项目名
spring:
  application:
    name: alibaba-cloud-learn-examples-config-bus-client    # 项目名称

  cloud:
    config:
      uri:
        - http://192.168.10.128:7007/
      label: master ## 分支信息
      name: application ##配置名称
      profile: dev ## 文件后缀名
      enabled: true
## 配置 rabbitmq
  rabbitmq:
    host: 192.168.10.222
    port: 5672
    username: julong
    password: julong
       
### 服务端口
server:
  port: 7008

### eureka配置
eureka:
  instance:
    instance-id: ${spring.application.name}:${server.port}  # 服务实例名称  alibaba-cloud-learn-examples-provider-payment
    prefer-ip-address: true ## 显示真实IP地址
  client:
    # 不需要注册自己
    register-with-eureka: true 
    # 标识本服务为注册中心 职责就是维护服务实例 并不需要取检索服务
    fetch-registry: true 
    service-url:
       ## 图形界面交互地址
       defaultZone: http://localhost:7001/eureka/
    
## 日志配置
logging:
  config: classpath:logback.xml
  
## 开启健康监控端点web访问  
management:
  endpoints:
    web:
      exposure:
        include: "*"

```

修改配置后 手动刷新配置中心

```powershell
curl -X POST "http://192.168.10.128:7007/actuator/bus-refresh"
```

执行后可以看到 客户端数据也跟着刷新了



点对点刷新 /bus-refresh/customers:9000

```shell
curl -X POST "http://192.168.10.128:7007/actuator/bus-refresh/alibaba-cloud-learn-examples-config-bus-client:7008"
```



## 基于 Spring Cloud Stream 的消息驱动配置

#### 消息生产者

##### pom文件引入配置

```xml
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-stream-rabbit</artifactId>
</dependency>
```



##### application.yml 配置

```yaml
### 项目名
spring:
  application:
    name: alibaba-cloud-learn-examples-stream-provider-client   # 项目名称
  cloud:
    stream:
#      default-binder: rabbit ## 默认绑定消息组件类型
      binders: ## 此处需要配置绑定的rabbitmq服务信息
        defaultRabbit: 
          type: rabbit 
          environment: 
            spring:  ## rabbitmq环境信息
              rabbitmq:
                host: 192.168.10.222
                port: 5672
                username: julong
                password: julong
      bindings: 
        output: ## output 为通道名称
          destination: streamExchange ## 标识使用定义名称 
          content-type: application/json  ## 设置消息类型格式
          binder: defaultRabbit ## 绑定的消息服务的具体配置和设置  
### 服务端口
server:
  port: 7007

### eureka配置
eureka:
  instance:
    instance-id: ${spring.application.name}:${server.port}  # 服务实例名称  alibaba-cloud-learn-examples-provider-payment
    prefer-ip-address: true ## 显示真实IP地址
  client:
    # 不需要注册自己
    register-with-eureka: true 
    # 标识本服务为注册中心 职责就是维护服务实例 并不需要取检索服务
    fetch-registry: true 
    service-url:
       ## 图形界面交互地址
       defaultZone: http://localhost:7001/eureka/
    
## 日志配置
logging:
  config: classpath:logback.xml
  



```



##### 定义接口和实现

RabbitMessageProviderService.java

```java
package com.julong.service.impl;

import javax.annotation.Resource;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;

import com.julong.service.RabbitMessageProviderService;

@EnableBinding(Source.class) //定义消息为发送端
public class RabbitMessageProviderServiceImpl implements RabbitMessageProviderService {

	/**
	 * 定义消息推送管道
	 * @author julong
	 * @date 2023年3月1日 下午8:37:03
	 */
	@Resource
	private MessageChannel output;
	
	@Override
	public boolean sendMessage() {
		// TODO Auto-generated method stub
		String message ="测试消息:";
        System.out.println("Sending: "+ message + System.currentTimeMillis() );
        boolean send = output.send(MessageBuilder.withPayload(message).build());
        System.out.println("Sending:结果 "+ send );
		return send;
	}

}

```



##### 调用消息

```java
package com.julong.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.julong.service.RabbitMessageProviderService;

@RestController
public class IndexAction {

	@Autowired
	private RabbitMessageProviderService rabbitMessageProviderServiceImpl;
	
	@GetMapping("/send")
	public String sendMessage(){
		boolean result = this.rabbitMessageProviderServiceImpl.sendMessage();
		return "消息发送结果："+result;
	}
}

```

##### 启动测试

![image-20230301212634365](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230301212634365.png)

![image-20230301212813932](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230301212813932.png)



#### 消息接收者

alibaba-cloud-learn-examples-stream-consumer-client

##### application.yml文件配置

```yaml
### 项目名
spring:
  application:
    name: alibaba-cloud-learn-examples-stream-consumer-client   # 项目名称
  cloud:
    stream:
#      default-binder: rabbit ## 默认绑定消息组件类型
      binders: ## 此处需要配置绑定的rabbitmq服务信息
        defaultRabbit: 
          type: rabbit 
          environment: 
            spring:  ## rabbitmq环境信息
              rabbitmq:
                host: 192.168.10.222
                port: 5672
                username: julong
                password: julong
      bindings: 
        input: ## input 为通道名称
          destination: streamExchange ## 标识使用定义名称  交换机通道
          content-type: application/json  ## 设置消息类型格式
          binder: defaultRabbit ## 绑定的消息服务的具体配置和设置  
### 服务端口
server:
  port: 8007

### eureka配置
eureka:
  instance:
    instance-id: ${spring.application.name}:${server.port}  # 服务实例名称  alibaba-cloud-learn-examples-provider-payment
    prefer-ip-address: true ## 显示真实IP地址
  client:
    # 不需要注册自己
    register-with-eureka: true 
    # 标识本服务为注册中心 职责就是维护服务实例 并不需要取检索服务
    fetch-registry: true 
    service-url:
       ## 图形界面交互地址
       defaultZone: http://localhost:7001/eureka/
    
## 日志配置
logging:
  config: classpath:logback.xml
  



```



##### 消息接收监听

```java
package com.julong.service.impl;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;
import org.springframework.messaging.Message;

@EnableBinding(Sink.class) //定义消息为接收
public class RabbitMessageConsumerListener{

	@StreamListener(value=Sink.INPUT)
	public void readMessage(Message<String> message) {
		// TODO Auto-generated method stub
        System.out.println("reading1: " + System.currentTimeMillis() );
        String read = message.getPayload();
        System.out.println("reading1:结果 "+ read );
	}


	
	

}

```



##### 接收消息

![image-20230301222626388](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230301222626388.png)



### 消息重复消费问题

在Stream 中 处于同一个 group 中多个消费者是竞争关系 就能保证消息知会被其中一个应用消费一次 

不同组是可以全面消费消息 意思就是 重复消费 相当于 一条消息发送到了 两个组 

#### 问题视图

![image-20230301224201006](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230301224201006.png)

![image-20230301224211381](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230301224211381.png)



查看 rabbitmq 消息ui信息 ，发现产出两个组

![image-20230301224311850](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230301224311850.png)



#### 解决方法

定义分组信息  ，如果定义为同一组只要名字叫一样就可以了

spring.cloud.stream.bindings.input.group=stream-rabbit-A

spring.cloud.stream.bindings.input.group=stream-rabbit-B

![image-20230301225006415](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230301225006415.png)



### 消息持久化

只要订阅分组 就会将没有消费的消息消费掉







## 基于Spring Cloud Sleuth责任链配置

#### 监控平台下载地址

https://repo1.maven.org/maven2/io/zipkin/java/zipkin-server/

https://repo1.maven.org/maven2/io/zipkin/zipkin-server/

zipkin 监控平台工具下载地址：https://github.com/openzipkin/zipkin

最新版下载地址：https://repo1.maven.org/maven2/io/zipkin/zipkin-server/2.24.0/zipkin-server-2.24.0-exec.jar

下载下来直接运行即可  默认访问端口 9411 

#### pom引入配置

```xml
	<!--  If you want both Sleuth and Zipkin, add the spring-cloud-starter-zipkin dependency.  -->
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-zipkin</artifactId>
</dependency>
```



多个服务启动：

alibaba-cloud-learn-examples-sleuth-eureka-server

##### alibaba-cloud-learn-examples-sleuth-provider-payment

application.yml增加配置

```yaml
### 项目名
spring:
  application:
    name: alibaba-cloud-learn-examples-provider-payment     # 项目名称
  datasource:
    driver-class-name: org.gjt.mm.mysql.Driver              # 驱动名称
    url: jdbc:mysql://192.168.10.222:3306/test?useUnicode=true&characterEncoding=utf-8&useSSL=false
    username: root                                          # 账户
    password: root                                          # 密码
    type: com.alibaba.druid.pool.DruidDataSource            # 数据源操作类型

  sleuth:
    enabled: true
    sampler:
      probability: 1 ## 采样率 1为最大 0为最小 在之间取值
  zipkin:
    enabled: true
    base-url: http://localhost:9411
```



##### alibaba-cloud-learn-examples-sleuth-consumer-order

application.yml增加配置

```yaml
### 项目名
spring:
  application:
    name: alibaba-cloud-learn-examples-consumer-order-80     # 项目名称
  sleuth:
    enabled: true
    sampler:
      probability: 1 ## 采样率 1为最大 0为最小 在之间取值
  zipkin:
    enabled: true
    base-url: http://localhost:9411
```

#### alibaba-cloud-learn-examples-sleuth-zipkin-server

自己搭建的平台配置如下

##### pom.xml

```xml
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
	<modelVersion>4.0.0</modelVersion>
	<!-- <parent> <groupId>com.julong</groupId> <artifactId>alibaba-cloud-learn-examples</artifactId> 
		<version>0.0.1-SNAPSHOT</version> </parent> -->
	<parent>
		<groupId>org.springframework.boot</groupId>
		<artifactId>spring-boot-starter-parent</artifactId>
		<version>2.1.3.RELEASE</version>
	</parent>
	<artifactId>alibaba-cloud-learn-examples-sleuth-zipkin-server</artifactId>
	<name>alibaba-cloud-learn-examples-sleuth-zipkin-server</name>
	<version>0.0.1-SNAPSHOT</version>

	<dependencies>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-actuator</artifactId>
		</dependency>
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-test</artifactId>
			<scope>test</scope>
		</dependency>
		<dependency>
			<groupId>org.springframework.cloud</groupId>
			<artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
			<version>2.1.3.RELEASE</version>
		</dependency>

		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-devtools</artifactId>
			<optional>true</optional>
		</dependency>

		<dependency>
			<groupId>io.zipkin.java</groupId>
			<artifactId>zipkin-server</artifactId>
			<version>2.12.3</version>
			<exclusions>
				<!-- <exclusion> <groupId>org.springframework.boot</groupId> <artifactId>spring-boot-starter-log4j2</artifactId> 
					</exclusion> -->
				<exclusion>
					<groupId>org.apache.logging.log4j</groupId>
					<artifactId>log4j-slf4j-impl</artifactId>
				</exclusion>

			</exclusions>
		</dependency>

		<dependency>
			<groupId>io.zipkin.java</groupId>
			<artifactId>zipkin-autoconfigure-ui</artifactId>
			<version>2.12.3</version>
		</dependency>


	</dependencies>
	<build />
</project>
```

##### application.yml

```yaml
### 项目名
spring:
  application:
    name: alibaba-cloud-learn-examples-sleuth-zipkin-server   # 项目名称
management:
  metrics:
    web:
      server:
        auto-time-requests: false
        
  endpoints: 
    web:
      exposure:
        include: "*"
          
### 服务端口
server:
  port: 9411
## eureka配置
eureka:
  instance: 
    instance-id: ${spring.application.name}:${server.port}  # 服务实例名称  alibaba-cloud-learn-examples-provider-payment
    prefer-ip-address: true ## 显示真实IP地址
  client:
    # 不需要注册自己
    register-with-eureka: true 
    # 标识本服务为注册中心 职责就是维护服务实例 并不需要取检索服务
    fetch-registry: true 
    service-url:
       ## 图形界面交互地址
       defaultZone: http://localhost:7001/eureka/
    
# 日志配置
logging:
  config: classpath:logback.xml
  



```

##### SleuthZipkinServerMainApplication

```java
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

```

##### 演示效果

![image-20230302102253787](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230302102253787.png)

![image-20230302102518859](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230302102518859.png)



## 基于Spring Cloud Alibaba的使用和配置

官网地址：

https://spring-cloud-alibaba-group.github.io/github-pages/edgware/spring-cloud-alibaba.html

### nacos注册中心

官网地址：

https://nacos.io/zh-cn/docs/quick-start.html

下载地址：

https://github.com/alibaba/nacos/releases

![image-20230302114059023](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230302114059023.png)

#### 运行命令

```txt
Linux/Unix/Mac

启动命令(standalone代表着单机模式运行，非集群模式):

sh startup.sh -m standalone

如果您使用的是ubuntu系统，或者运行脚本报错提示[[符号找不到，可尝试如下运行：

bash startup.sh -m standalone
Windows

启动命令(standalone代表着单机模式运行，非集群模式):

startup.cmd -m standalone

Linux/Unix/Mac

sh shutdown.sh
Windows

shutdown.cmd

或者双击shutdown.cmd运行文件。
```

    1.安装数据库，版本要求：5.6.5+
    2.初始化mysql数据库，数据库初始化文件：mysql-schema.sql
    3.修改conf/application.properties文件，增加支持mysql数据源配置（目前只支持mysql），添加mysql数据源的url、用户名和密码。


#### 测试页面

![image-20230302112653212](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230302112653212.png)

#### 测试服务

pom引入配置

```xml
<dependency>
    <groupId>com.alibaba.cloud</groupId>
    <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
</dependency>
```

#### 服务发现

![image-20230302201911729](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230302201911729.png)

##### alibaba-cloud-learn-examples-nacos-provider-payment

```yaml
### 项目名
spring:
### nacos配置
  cloud: 
    nacos:
      discovery:
        server-addr: 192.168.10.222:8848
        enabled: true
        service: ${spring.application.name}
management:
  endpoints:
    web:
      exposure:
        include: "*"
```

启动类加入注解 @EnableDiscoveryClient

##### alibaba-cloud-learn-examples-nacos-consumer-order

```yaml
### 项目名
spring:
### nacos配置
  cloud: 
    nacos:
      discovery:
        server-addr: 192.168.10.222:8848
        enabled: true
        
management:
  endpoints:
    web:
      exposure:
        include: "*"
```



启动类加入注解 @EnableDiscoveryClient



#### 服务注册

![image-20230302113242841](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230302113242841.png)

### nacos config 配置中心

#### 配置中心需要引入pom

```xml
<dependency>
    <groupId>com.alibaba.cloud</groupId>
    <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
</dependency>
<dependency>
    <groupId>com.alibaba.cloud</groupId>
    <artifactId>spring-cloud-starter-alibaba-nacos-config</artifactId>
</dependency>
```

#### 配置中心需要加入配置

使用配置中心需要和 spring config 一样 有一个 bootstrap配置文件  spring boot 优先加载 bootstrap 文件

##### application.yml

```yaml
management: 
  endpoints:
    web:
      exposure:
        include: "*"

### 日志配置
logging:
  config: classpath:logback.xml
  

```

##### bootstrap.yml

```yml
### 项目名
spring:
  application:
    name: alibaba-cloud-learn-examples-nacos-config-client     # 项目名称
### nacos配置
  cloud: 
    nacos:
      discovery:
        server-addr: 192.168.10.222:8848
        enabled: true
        service: ${spring.application.name}
      config: ### 配置中心
        server-addr: 192.168.10.222:8848
        encode: utf-8
        file-extension: yaml  ## 指定配置中心文件后缀名 默认为 properties
  profiles:
    active:
      - dev

### 服务端口
server:
  port: 9009



```



#### 文件名的定义规则

在 Nacos Spring Cloud 中，dataId 的完整格式如下：

${prefix}-${spring.profiles.active}.${file-extension}

    prefix 默认为 spring.application.name 的值，也可以通过配置项 spring.cloud.nacos.config.prefix来配置。
    spring.profiles.active 即为当前环境对应的 profile，详情可以参考 Spring Boot文档。 注意：当 spring.profiles.active 为空时，对应的连接符 - 也将不存在，dataId 的拼接格式变成 ${prefix}.${file-extension}
    file-exetension 为配置内容的数据格式，可以通过配置项 spring.cloud.nacos.config.file-extension 来配置。目前只支持 properties 和 yaml 类型。
${spring.application.name}. ${file-extension:properties} 

${spring.application.name}-${profile}. ${file-extension:properties}

${spring.profiles.active} 模式  ： dev prod test

![image-20230302151915325](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230302151915325.png)

#### 访问类NacosConfigAction

​	通过 Spring Cloud 原生注解 @RefreshScope 实现配置自动更新

```yaml
package com.julong.system.action;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class NacosConfigAction {

	private static final Logger logger = LoggerFactory.getLogger(NacosConfigAction.class);
	
	
	@Value("${server.port}")
	private String serverPort;
	
	@Autowired
	private DiscoveryClient discoveryClientImpl;
	

	@GetMapping(value="/nacos/services")
	public List<String> discovery(){
		List<String> services = discoveryClientImpl.getServices();
		for (int i = 0; i < services.size(); i++) {
			logger.info("【services】-{}",services.get(i));
		}
		List<ServiceInstance> instanceList =  discoveryClientImpl.getInstances("ALIBABA-CLOUD-LEARN-EXAMPLES-PROVIDER-PAYMENT");
		for (ServiceInstance serviceInstance : instanceList) {
			logger.info("【serviceInstance】-{}",serviceInstance.getInstanceId());
		}
		return services;
	}
	
	/**
	 * 测试feign超时
	 * @return
	 * @author julong
	 * @date 2023年2月28日 上午10:35:25
	 * @desc
	 */
	@GetMapping(value="/nacos/timeout")
	public String feignTimeout(){
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return this.serverPort;
	}
	
	@Value("${user.name}")
	private String userName;
	
	@GetMapping(value="/nacos/config")
	public String readConfig(){
		
		return this.userName;
	}
}

```



![image-20230302152010171](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230302152010171.png)

#### 动态刷新

修改config数据

![image-20230302152227107](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230302152227107.png)





### 自定义分组

#### bootstrap.yml 

```yaml
### 服务端口
server:
  port: 9009
### 项目名
spring:
  application:
    name: alibaba-cloud-learn-examples-nacos-config-client     # 项目名称
### nacos配置
  cloud: 
    nacos:
      discovery:
        server-addr: 192.168.10.222:8848
        enabled: true
        service: ${spring.application.name}
      config: ### 配置中心
        server-addr: 192.168.10.222:8848
        encode: utf-8
        file-extension: yaml  ## 指定配置中心文件后缀名 默认为 properties
        group: DEV_GROUP  ## 分组

management: 
  endpoints:
    web:
      exposure:
        include: "*"

### 日志配置
logging:
  config: classpath:logback.xml
  

```

#### nacos 增加配置

##### ![image-20230302205719812](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230302205719812.png)访问示例

![image-20230302205745010](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230302205745010.png)

#### nameSpace 命名空间的配置

![image-20230302211247035](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230302211247035.png)



#### bootstrap.yml配置

```yaml
### 服务端口
server:
  port: 9009
### 项目名
spring:
  application:
    name: alibaba-cloud-learn-examples-nacos-config-client     # 项目名称
### nacos配置
  cloud: 
    nacos:
      discovery:
        server-addr: 192.168.10.222:8848
        enabled: true
        service: ${spring.application.name}
      config: ### 配置中心
        server-addr: 192.168.10.222:8848
        encode: utf-8
        file-extension: yaml  ## 指定配置中心文件后缀名 默认为 properties
        group: DEV_GROUP  ## 分组
        namespace: nacos-config-dev

management: 
  endpoints:
    web:
      exposure:
        include: "*"

### 日志配置
logging:
  config: classpath:logback.xml
  

```

![image-20230302211335799](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230302211335799.png)



###  Spring Cloud Alibaba Sentinel熔断限流的使用和配置

#### pom文件引入配置

```xml
<dependency>
    <groupId>com.alibaba.cloud</groupId>
    <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
</dependency>
<dependency>
    <groupId>com.alibaba.cloud</groupId>
    <artifactId>spring-cloud-starter-alibaba-sentinel</artifactId>
</dependency>
<!-- 持久化会用到 -->
<dependency>
    <groupId>com.alibaba.csp</groupId>
    <artifactId>sentinel-datasource-nacos</artifactId>
</dependency>
```



####  Sentinel Dashboard

官网地址：https://sentinelguard.io/zh-cn/

下载地址：https://github.com/alibaba/Sentinel/releases

![image-20230303182910668](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230303182910668.png)

启动命令：

```cmd
java -Dserver.port=8080 -Dcsp.sentinel.dashboard.server=localhost:8080 -Dproject.name=sentinel-dashboard -jar sentinel-dashboard.jar

或者  -jar sentinel-dashboard.jar
```

![image-20230303132311171](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230303132311171.png)

登录账号 ：sentinel  密码：sentinel

用户可以通过如下参数进行配置：

```txt
-Dsentinel.dashboard.auth.username=sentinel 用于指定控制台的登录用户名为 sentinel；
-Dsentinel.dashboard.auth.password=123456 用于指定控制台的登录密码为 123456；如果省略这两个参数，默认用户和密码均为 sentinel；
-Dserver.servlet.session.timeout=7200 用于指定 Spring Boot 服务端 session 的过期时间，如 7200 表示 7200 秒；60m 表示 60 分钟，默认为 30 分钟；
```


#### alibaba-cloud-learn-examples-nacos-sentinel-provider-payment

测试项目

##### 引入配置

pom.xml

```xml
<dependency>
    <groupId>com.alibaba.cloud</groupId>
    <artifactId>spring-cloud-starter-alibaba-nacos-discovery</artifactId>
</dependency>
<dependency>
    <groupId>com.alibaba.cloud</groupId>
    <artifactId>spring-cloud-starter-alibaba-sentinel</artifactId>
</dependency>
```



application.yml

```yaml
### 项目名
spring:
  application:
    name: alibaba-cloud-learn-examples-sentinel-provider-payment     # 项目名称
  datasource:
    driver-class-name: org.gjt.mm.mysql.Driver              # 驱动名称
    url: jdbc:mysql://192.168.10.222:3306/test?useUnicode=true&characterEncoding=utf-8&useSSL=false
    username: root                                          # 账户
    password: root                                          # 密码
    type: com.alibaba.druid.pool.DruidDataSource            # 数据源操作类型
### nacos配置
  cloud: 
    nacos:
      discovery:
        server-addr: 192.168.10.222:8848
        enabled: true
        service: ${spring.application.name}
    sentinel:
      enabled: true ## 启用 sentinel
      transport:
        port: 8719
        dashboard: 127.0.0.1:8080    ## 面板ui界面    
        
management:
  endpoints:
    web:
      exposure:
        include: "*"
```

#### 配置限流 

##### QPS限流

  假设一秒请求一次 只允许请求一次

![image-20230303194941291](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230303194941291.png)

多刷新几次浏览器 会发现 出现如下错误

 ![image-20230303195044559](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230303195044559.png)

##### 线程数限流

示例：一个线程处理此请求

测试代码 修改：

```ava
	/**
	 * 查询数据
	 * @param paymentId
	 * @return
	 * @author julong
	 * @date 2023年2月26日 下午10:06:23
	 * @desc
	 */
	@GetMapping(value="/payment/get/v1/{paymentId}")
	public CommonResult<PaymentInfo> getPaymentById(@PathVariable("paymentId") long paymentId){
		PaymentInfo paymentInfo = null;
		try {
			TimeUnit.SECONDS.sleep(1); //默认限流 
			paymentInfo = this.paymentServiceImpl.selectPaymentInfo(paymentId);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(paymentInfo != null){
			return new CommonResult<PaymentInfo>(200,"查询成功-v1"+serverPort,paymentInfo);
		}else{
			return new CommonResult<PaymentInfo>(500,"查询失败-v1"+serverPort);
		}
	}
```



![image-20230303200505634](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230303200505634.png)



测试效果：

 ![image-20230303195044559](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230303195044559.png)

![image-20230303202547823](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230303202547823.png)

#### 降级规则

异常数测试：

![image-20230303225230280](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230303225230280.png)

运行结果：

![image-20230303225256326](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230303225256326.png)

测试代码：

```java
	/**
	 * 异常数
	 * @return
	 * @author julong
	 * @date 2023年2月28日 上午10:35:25
	 * @desc
	 */
	@GetMapping(value="/payment/error")
	public String sentinelError(){
		int age = 1/0;
		return "------testE 测试异常比例";
	}
```

#### 热点限流



示例代码

```java
	/**
	 * 热点限流
	 * @param one
	 * @param two
	 * @return
	 * @author julong
	 * @date 2023年3月4日 下午2:35:02
	 * @desc
	 */
	@GetMapping("/testHotKey")
	@SentinelResource(value = "testHotKey",blockHandler="showErrorTestHotKey")
	public String testHotKey(String one,String two){
		
		return  "热点参数测试";
	}
	
	public String showErrorTestHotKey(String one,String two,BlockException exception){
		return "showErrorTestHotKey";
	}
```

配置：

![image-20230304190919843](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230304190919843.png)

效果演示：

![image-20230304185530305](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230304185530305.png)

自定义 异常处理类

```java
@SentinelRestTemplate(blockHandler = "handleException", blockHandlerClass = ExceptionUtil.class)


public class ExceptionUtil {
    public static ClientHttpResponse handleException(HttpRequest request, byte[] body, ClientHttpRequestExecution execution, BlockException exception) {
        ...
    }
}


 // 对应的 `handleException` 函数需要位于 `ExceptionUtil` 类中，并且必须为 static 函数.
    @SentinelResource(value = "test", blockHandler = "handleException", blockHandlerClass = {ExceptionUtil.class})
    public void test() {
        System.out.println("Test");
    }

    // 原函数
    @SentinelResource(value = "hello", blockHandler = "exceptionHandler", fallback = "helloFallback")
    public String hello(long s) {
        return String.format("Hello at %d", s);
    }
    
    // Fallback 函数，函数签名与原函数一致或加一个 Throwable 类型的参数.
    public String helloFallback(long s) {
        return String.format("Halooooo %d", s);
    }

    // Block 异常处理函数，参数最后多一个 BlockException，其余与原函数一致.
    public String exceptionHandler(long s, BlockException ex) {
        // Do some log here.
        ex.printStackTrace();
        return "Oops, error occurred at " + s;
    }
```



#### 基于 ribbon 的本地负载 sentinel服务熔断功能

值配置两个 服务端 一个客户端

alibaba-cloud-learn-examples-nacos-sentinel-ribbon-provider-payment-one

alibaba-cloud-learn-examples-nacos-sentinel-ribbon-provider-payment-two

application.yml

```yaml
### 项目名
spring:
  application:
    name: alibaba-cloud-learn-examples-sentinel-provider-payment     # 项目名称
  datasource:
    driver-class-name: org.gjt.mm.mysql.Driver              # 驱动名称
    url: jdbc:mysql://192.168.10.222:3306/test?useUnicode=true&characterEncoding=utf-8&useSSL=false
    username: root                                          # 账户
    password: root                                          # 密码
    type: com.alibaba.druid.pool.DruidDataSource            # 数据源操作类型
### nacos配置
  cloud: 
    nacos:
      discovery:
        server-addr: 192.168.10.222:8848
        enabled: true
        service: ${spring.application.name}
  devtools:
    livereload:
      port: 19091
        
management:
  endpoints:
    web:
      exposure:
        include: "*"
### 服务端口
server:
  port: 9003

### mybaits配置
mybatis:
  mapper-locations: classpath:/mapper/*.xml
  type-aliases-package: com.julong.**.entity
### 日志配置
logging:
  config: classpath:logback.xml
  

```



alibaba-cloud-learn-examples-nacos-sentinel-ribbon-consumer-order

application.yml

```yaml
### 项目名
spring:
  application:
    name: alibaba-cloud-learn-examples-sentinel-consumer-order-80     # 项目名称
### nacos配置
  cloud: 
    nacos:
      discovery:
        server-addr: 192.168.10.222:8848
        enabled: true
    sentinel: 
        enabled: true ## 启用 sentinel
        transport:
          port: 8719 ## 如果此端口被占用则会默认扫描 +1 端口
          dashboard: 127.0.0.1:8080    ## 面板ui界面         sentinel dashboard地址
  devtools:
    livereload:
      port: 19094
      
management:
  endpoints:
    web:
      exposure:
        include: "*"
        
        
### 服务端口
server:
  port: 80


logging:
  config: classpath:logback.xml
```



##### 无配置代码示例

```java
package com.julong.action;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.julong.response.CommonResult;
import com.julong.system.dao.entity.PaymentInfo;

@RestController
public class CricleBreakerController {

	@Resource
	public RestTemplate restTemplateImpl;
	
	@SuppressWarnings("unchecked")
	@GetMapping(value="/consumer/get/v1/{paymentId}")
	@SentinelResource(value="fallback") //fallback示例 没有配置的示例
	public CommonResult<PaymentInfo> fallback(@PathVariable("paymentId") long paymentId){
		
		if(paymentId == 2){
			throw new IllegalArgumentException("非法参数异常......");
		}
		CommonResult<PaymentInfo> result = this.restTemplateImpl.getForObject("http://alibaba-cloud-learn-examples-sentinel-provider-payment/payment/get/v1/"+paymentId, CommonResult.class);
		if(result.getData() == null){
			throw new NullPointerException("没有查询到此数据异常......");
		}
		return result;
	}
	
	
	
}

```



![image-20230304213848854](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230304213848854.png)



##### 业务代码处理异常

```java
	@SuppressWarnings("unchecked")
	@GetMapping(value="/consumer/get/v1/{paymentId}")
//	@SentinelResource(value="fallback") //fallback示例 没有配置的示例
	@SentinelResource(value="fallback",fallback="handlerFallback") //fallback示例 没有配置的示例
	public CommonResult<PaymentInfo> fallback(@PathVariable("paymentId") long paymentId){
		
		if(paymentId == 2){
			throw new IllegalArgumentException("非法参数异常......");
		}
		CommonResult<PaymentInfo> result = this.restTemplateImpl.getForObject("http://alibaba-cloud-learn-examples-sentinel-provider-payment/payment/get/v1/"+paymentId, CommonResult.class);
		if(result.getData() == null){
			throw new NullPointerException("没有查询到此数据异常......");
		}
		return result;
	}	

	/**
	 * 业务处理异常同一方法
	 * @param paymentId
	 * @param throwable
	 * @return
	 * @author julong
	 * @date 2023年3月4日 下午9:42:11
	 * @desc
	 */
	public CommonResult handlerFallback(@PathVariable("paymentId") long paymentId,Throwable throwable){
		return new CommonResult<PaymentInfo>(500,"查询失败异常-处理业务-v1-");
	}
```

效果：

![image-20230304214355922](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230304214355922.png)

两个属性配置 需要在 sentinel 配置限流规则

```java
package com.julong.action;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.julong.response.CommonResult;
import com.julong.system.dao.entity.PaymentInfo;

@RestController
public class CricleBreakerController {

	@Resource
	public RestTemplate restTemplateImpl;
	
	@SuppressWarnings("unchecked")
	@GetMapping(value="/consumer/get/v1/{paymentId}")
//	@SentinelResource(value="fallback") //fallback示例 没有配置的示例
//	@SentinelResource(value="fallback",fallback="handlerFallback") //fallback示例 没有配置的示例
//	@SentinelResource(value="fallback",blockHandler="handlerBlock") //只配置负责sentinel控制台配置违规
	@SentinelResource(value="fallback",fallback="handlerFallback",blockHandler="handlerBlock") //只配置负责sentinel控制台配置违规
	public CommonResult<PaymentInfo> fallback(@PathVariable("paymentId") long paymentId){
		
		if(paymentId == 2){
			throw new IllegalArgumentException("非法参数异常......");
		}
		CommonResult<PaymentInfo> result = this.restTemplateImpl.getForObject("http://alibaba-cloud-learn-examples-sentinel-provider-payment/payment/get/v1/"+paymentId, CommonResult.class);
		if(result.getData() == null){
			throw new NullPointerException("没有查询到此数据异常......");
		}
		return result;
	}
	
	
	/**
	 * 业务处理异常同一方法
	 * @param paymentId
	 * @param throwable
	 * @return
	 * @author julong
	 * @date 2023年3月4日 下午9:42:11
	 * @desc
	 */
	public CommonResult handlerFallback(@PathVariable("paymentId") long paymentId,Throwable throwable){
		return new CommonResult<PaymentInfo>(5001,"查询失败异常-处理业务-v1-");
	}
	
	
	/**
	 * sentinel 异常处理方法
	 * @param paymentId
	 * @param blockException
	 * @return
	 * @author julong
	 * @date 2023年3月4日 下午10:07:08
	 * @desc
	 */
	public CommonResult handlerBlock(@PathVariable("paymentId") long paymentId,BlockException blockException){
		return new CommonResult<PaymentInfo>(5002,"查询失败异常-限流-v1-blockException");
	}
	
}

```



#### 基于 openFeign 的服务调用和sentinel 服务熔断功能

服务生产者

alibaba-cloud-learn-examples-nacos-sentinel-feign-provider-payment-one
alibaba-cloud-learn-examples-nacos-sentinel-feign-provider-payment-two

application.yml

```yaml
### 项目名
spring:
  application:
    name: alibaba-cloud-learn-examples-sentinel-openfeign-provider-payment     # 项目名称
  datasource:
    driver-class-name: org.gjt.mm.mysql.Driver              # 驱动名称
    url: jdbc:mysql://192.168.10.222:3306/test?useUnicode=true&characterEncoding=utf-8&useSSL=false
    username: root                                          # 账户
    password: root                                          # 密码
    type: com.alibaba.druid.pool.DruidDataSource            # 数据源操作类型
### nacos配置
  cloud: 
    nacos:
      discovery:
        server-addr: 192.168.10.222:8848
        enabled: true
        service: ${spring.application.name}

  devtools:
    livereload:
      port: 19090
management:
  endpoints:
    web:
      exposure:
        include: "*"
### 服务端口
server:
  port: 9004

### mybaits配置
mybatis:
  mapper-locations: classpath:/mapper/*.xml
  type-aliases-package: com.julong.**.entity
### 日志配置
logging:
  config: classpath:logback.xml
  

```



服务消费者

alibaba-cloud-learn-examples-nacos-sentinel-feign-consumer-order

application.yml

```yaml
### 项目名
spring:
  application:
    name: alibaba-cloud-learn-examples-sentinel-consumer-order-80     # 项目名称
### nacos配置
  cloud: 
    nacos:
      discovery:
        server-addr: 192.168.10.222:8848
        enabled: true
    sentinel: 
        enabled: true ## 启用 sentinel
        transport:
          port: 8719 ## 如果此端口被占用则会默认扫描 +1 端口
          dashboard: 127.0.0.1:8080    ## 面板ui界面         sentinel dashboard地址
  devtools:
    livereload:
      port: 19094
## 整合 openfeign      
feign:
  sentinel:
    enabled: true
          
management:
  endpoints:
    web:
      exposure:
        include: "*"
        
        
### 服务端口
server:
  port: 80


logging:
  config: classpath:logback.xml
```



项目参考 openfeign的使用示例

 OrderMainApplication .java

```java
package com.julong;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * 主启动类
 * @author julong
 * @date 2023/2/26 13:05
 * @desc
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class OrderMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderMainApplication.class, args);
    }
}

```



增加代码 OrderOpenFeignService .java

```java
package com.julong.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.julong.response.CommonResult;
import com.julong.system.dao.entity.PaymentInfo;

/**
 * openfeign服务调用
 * @author julong
 * @date 2023年3月5日 上午10:09:50
 * @desc 
 */
@FeignClient(value="alibaba-cloud-learn-examples-sentinel-openfeign-provider-payment")
public interface OrderOpenFeignService {

	@GetMapping(value="/payment/get/v1/{paymentId}")
	public abstract CommonResult<PaymentInfo> getPaymentById(@PathVariable("paymentId") long paymentId);
}

```



错误处理的类

```java
package com.julong.service.impl;

import org.springframework.stereotype.Service;

import com.julong.response.CommonResult;
import com.julong.service.OrderOpenFeignService;
import com.julong.system.dao.entity.PaymentInfo;

@Service
public class OrderOpenFeignServiceImpl implements OrderOpenFeignService {

	@Override
	public CommonResult<PaymentInfo> getPaymentById(long paymentId) {
		// TODO Auto-generated method stub
		return new CommonResult<PaymentInfo>(5005,"查询失败-v1-服务降级返回数据");
	}

}

```

测试 同时启动服务后 在访问正常 后 关闭其中一个 provider 服务 进行测试

#### Sentinel 持久化配置

数据源配置示例 For example, 4 data sources are configures：

```txt


spring.cloud.sentinel.datasource.ds1.file.file=classpath: degraderule.json
spring.cloud.sentinel.datasource.ds1.file.rule-type=flow

#spring.cloud.sentinel.datasource.ds1.file.file=classpath: flowrule.json
#spring.cloud.sentinel.datasource.ds1.file.data-type=custom
#spring.cloud.sentinel.datasource.ds1.file.converter-class=JsonFlowRuleListConverter
#spring.cloud.sentinel.datasource.ds1.file.rule-type=flow

spring.cloud.sentinel.datasource.ds2.nacos.server-addr=localhost:8848
spring.cloud.sentinel.datasource.ds2.nacos.data-id=sentinel
spring.cloud.sentinel.datasource.ds2.nacos.group-id=DEFAULT_GROUP
spring.cloud.sentinel.datasource.ds2.nacos.data-type=json
spring.cloud.sentinel.datasource.ds2.nacos.rule-type=degrade

spring.cloud.sentinel.datasource.ds3.zk.path = /Sentinel-Demo/SYSTEM-CODE-DEMO-FLOW
spring.cloud.sentinel.datasource.ds3.zk.server-addr = localhost:2181
spring.cloud.sentinel.datasource.ds3.zk.rule-type=authority

spring.cloud.sentinel.datasource.ds4.apollo.namespace-name = application
spring.cloud.sentinel.datasource.ds4.apollo.flow-rules-key = sentinel
spring.cloud.sentinel.datasource.ds4.apollo.default-flow-rule-value = test
spring.cloud.sentinel.datasource.ds4.apollo.rule-type=param-flow
```



alibaba-cloud-learn-examples-nacos-sentinel-datasource  数据源配置

application.yml

```yaml
### 项目名
spring:
  application:
    name: alibaba-cloud-learn-examples-sentinel-provider-payment     # 项目名称
  datasource:
    driver-class-name: org.gjt.mm.mysql.Driver              # 驱动名称
    url: jdbc:mysql://192.168.10.222:3306/test?useUnicode=true&characterEncoding=utf-8&useSSL=false
    username: root                                          # 账户
    password: root                                          # 密码
    type: com.alibaba.druid.pool.DruidDataSource            # 数据源操作类型
### nacos配置
  cloud: 
    nacos:
      discovery:
        server-addr: 192.168.10.222:8848
        enabled: true
        service: ${spring.application.name}
    sentinel:
      enabled: true ## 启用 sentinel
      transport:
        port: 8719
        dashboard: 127.0.0.1:8080    ## 面板ui界面    
      datasource:  ## 持久化配置
        ds1:
          nacos:
            server-addr: 192.168.10.222:8848
            data-id: alibaba-cloud-learn-examples-sentinel-provider-payment
            group-id: DEFAULT_GROUP
            data-type: json
            rule-type: flow
management:
  endpoints:
    web:
      exposure:
        include: "*"
### 服务端口
server:
  port: 9001

### mybaits配置
mybatis:
  mapper-locations: classpath:/mapper/*.xml
  type-aliases-package: com.julong.**.entity
### 日志配置
logging:
  config: classpath:logback.xml
  

```





配置流控规则：

```json
[
    {
        "resource":"/payment/get/v2",
        "limitApp":"default",
        "grade":1,
        "count":1,
        "strategy":0,
        "countrolBehavior":0,
        "clusterMode":false
    }
]
```

参数解释：

​	resource ： 资源名称

​	limitApp ：来源应用

grade：阀值类型 0线程数 1 QPS

count：单击阀值

strategy：流控模式 0 直接 1 关联 2 链路

countrolBehavior：流控效果 0 快速失败 1标识 Warm Up 2 标识排队等待

clusterMode：是否集群


nacos上配置

![image-20230305152839242](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230305152839242.png)

![image-20230305153239697](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230305153239697.png)



测试示例 ：每秒请求数超过1 次报下面错误

![image-20230305153834979](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230305153834979.png)



### Spring cloud alibaba seata 分布式事务

官网：http://seata.io/zh-cn/index.html

下载地址：https://github.com/seata/seata/releases

TC (Transaction Coordinator) - 事务协调者

维护全局和分支事务的状态，驱动全局事务提交或回滚。
TM (Transaction Manager) - 事务管理器

定义全局事务的范围：开始全局事务、提交或回滚全局事务。
RM (Resource Manager) - 资源管理器

管理分支事务处理的资源，与TC交谈以注册分支事务和报告分支事务的状态，并驱动分支事务提交或回滚。



![image-20230305163052912](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230305163052912.png)

流程说明：

TM (事务管理器) 向 TC（事务协调者）申请开启一个全局事务，全局事务创建成功后生成一个全局唯一的XID

XID在微服务调用链路的上下文中传播

RM（资源管理器）向TC（事务协调者）注册分支事务并将其纳入XID对应的全局事务的管辖

TM（事务管理器）向TC（事务协调者）发起针对XID的全局事务提交或者回滚命令

TC（事务协调者）调度XID下管辖的全部分支事务完成提交或者回滚请求命令



#### 安装配置

##### file.conf

```conf

## transaction log store, only used in seata-server
store {
  ## store mode: file、db  数据存储模式
  mode = "db"

  ## file store property
  file {
    ## store location dir
    dir = "sessionStore"
    # branch session size , if exceeded first try compress lockkey, still exceeded throws exceptions
    maxBranchSessionSize = 16384
    # globe session size , if exceeded throws exceptions
    maxGlobalSessionSize = 512
    # file buffer size , if exceeded allocate new buffer
    fileWriteBufferCacheSize = 16384
    # when recover batch read size
    sessionReloadReadSize = 100
    # async, sync
    flushDiskMode = async
  }

  ## database store property  数据库配置
  db {
    ## the implement of javax.sql.DataSource, such as DruidDataSource(druid)/BasicDataSource(dbcp) etc.
    datasource = "dbcp"
    ## mysql/oracle/h2/oceanbase etc.
    dbType = "mysql"
    driverClassName = "com.mysql.jdbc.Driver"
    url = "jdbc:mysql://192.168.10.222:3306/alibaba_seata"
    user = "root"
    password = "root"
    minConn = 1
    maxConn = 10
    globalTable = "global_table"
    branchTable = "branch_table"
    lockTable = "lock_table"
    queryLimit = 100
  }
}
```

##### registry.conf

```conf
registry {
  # file 、nacos 、eureka、redis、zk、consul、etcd3、sofa 配置注册中心
  type = "nacos"

  nacos {
    serverAddr = "192.168.10.222:8848"
    namespace = ""
    cluster = "default"
  }
  eureka {
    serviceUrl = "http://localhost:8761/eureka"
    application = "default"
    weight = "1"
  }
  redis {
    serverAddr = "localhost:6379"
    db = "0"
  }
  zk {
    cluster = "default"
    serverAddr = "127.0.0.1:2181"
    session.timeout = 6000
    connect.timeout = 2000
  }
  consul {
    cluster = "default"
    serverAddr = "127.0.0.1:8500"
  }
  etcd3 {
    cluster = "default"
    serverAddr = "http://localhost:2379"
  }
  sofa {
    serverAddr = "127.0.0.1:9603"
    application = "default"
    region = "DEFAULT_ZONE"
    datacenter = "DefaultDataCenter"
    cluster = "default"
    group = "SEATA_GROUP"
    addressWaitTime = "3000"
  }
  file {
    name = "file.conf"
  }
}

config {
  # file、nacos 、apollo、zk、consul、etcd3
  type = "file"

  nacos {
    serverAddr = "localhost"
    namespace = ""
    group = "SEATA_GROUP"
  }
  consul {
    serverAddr = "127.0.0.1:8500"
  }
  apollo {
    app.id = "seata-server"
    apollo.meta = "http://192.168.1.204:8801"
    namespace = "application"
  }
  zk {
    serverAddr = "127.0.0.1:2181"
    session.timeout = 6000
    connect.timeout = 2000
  }
  etcd3 {
    serverAddr = "http://localhost:2379"
  }
  file {
    name = "file.conf"
  }
}

```

##### 创建数据表

1.0.0版本后安装包中就没有sql建表语句了 需要自己去github上下载

下载地址：https://github.com/seata/seata/blob/master/script/server/db/mysql.sql

```sql
-- -------------------------------- The script used when storeMode is 'db' --------------------------------
-- the table to store GlobalSession data
CREATE TABLE IF NOT EXISTS `global_table`
(
    `xid`                       VARCHAR(128) NOT NULL,
    `transaction_id`            BIGINT,
    `status`                    TINYINT      NOT NULL,
    `application_id`            VARCHAR(32),
    `transaction_service_group` VARCHAR(32),
    `transaction_name`          VARCHAR(128),
    `timeout`                   INT,
    `begin_time`                BIGINT,
    `application_data`          VARCHAR(2000),
    `gmt_create`                DATETIME,
    `gmt_modified`              DATETIME,
    PRIMARY KEY (`xid`),
    KEY `idx_status_gmt_modified` (`status` , `gmt_modified`),
    KEY `idx_transaction_id` (`transaction_id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;

-- the table to store BranchSession data
CREATE TABLE IF NOT EXISTS `branch_table`
(
    `branch_id`         BIGINT       NOT NULL,
    `xid`               VARCHAR(128) NOT NULL,
    `transaction_id`    BIGINT,
    `resource_group_id` VARCHAR(32),
    `resource_id`       VARCHAR(256),
    `branch_type`       VARCHAR(8),
    `status`            TINYINT,
    `client_id`         VARCHAR(64),
    `application_data`  VARCHAR(2000),
    `gmt_create`        DATETIME(6),
    `gmt_modified`      DATETIME(6),
    PRIMARY KEY (`branch_id`),
    KEY `idx_xid` (`xid`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;

-- the table to store lock data
CREATE TABLE IF NOT EXISTS `lock_table`
(
    `row_key`        VARCHAR(128) NOT NULL,
    `xid`            VARCHAR(128),
    `transaction_id` BIGINT,
    `branch_id`      BIGINT       NOT NULL,
    `resource_id`    VARCHAR(256),
    `table_name`     VARCHAR(32),
    `pk`             VARCHAR(36),
    `status`         TINYINT      NOT NULL DEFAULT '0' COMMENT '0:locked ,1:rollbacking',
    `gmt_create`     DATETIME,
    `gmt_modified`   DATETIME,
    PRIMARY KEY (`row_key`),
    KEY `idx_status` (`status`),
    KEY `idx_branch_id` (`branch_id`),
    KEY `idx_xid` (`xid`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;

CREATE TABLE IF NOT EXISTS `distributed_lock`
(
    `lock_key`       CHAR(20) NOT NULL,
    `lock_value`     VARCHAR(20) NOT NULL,
    `expire`         BIGINT,
    primary key (`lock_key`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8mb4;

INSERT INTO `distributed_lock` (lock_key, lock_value, expire) VALUES ('AsyncCommitting', ' ', 0);
INSERT INTO `distributed_lock` (lock_key, lock_value, expire) VALUES ('RetryCommitting', ' ', 0);
INSERT INTO `distributed_lock` (lock_key, lock_value, expire) VALUES ('RetryRollbacking', ' ', 0);
INSERT INTO `distributed_lock` (lock_key, lock_value, expire) VALUES ('TxTimeoutCheck', ' ', 0);
```



#### 实例应用

用户购买商品的业务逻辑。整个业务逻辑由3个微服务提供支持：

    仓储服务：对给定的商品扣除仓储数量。
    订单服务：根据采购需求创建订单。
    帐户服务：从用户帐户中扣除余额。
![image-20230307175759717](D:\Workspaces\OWER\alibaba-cloud-learn-examples\images\image-20230307175759717.png)

注意: 实际上，在示例用例中，这3个服务应该有3个数据库。 但是，为了简单起见，我们只创建一个数据库并配置3个数据源。

##### 为示例业务创建表

```sql
DROP TABLE IF EXISTS `tbl_storage`;
DROP TABLE IF EXISTS `tbl_storage`;
CREATE TABLE `tbl_storage` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `commodity_code` varchar(255) DEFAULT NULL,
  `count` int(11) DEFAULT 0,
  PRIMARY KEY (`id`),
  UNIQUE KEY (`commodity_code`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `tbl_order`;
CREATE TABLE `tbl_order` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(255) DEFAULT NULL,
  `commodity_code` varchar(255) DEFAULT NULL,
  `count` int(11) DEFAULT 0,
  `money` int(11) DEFAULT 0,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


DROP TABLE IF EXISTS `tbl_account`;
CREATE TABLE `tbl_account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(255) DEFAULT NULL,
  `money` int(11) DEFAULT 0,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
```

##### 创建 UNDO_LOG 表

```sql
-- 注意此处0.3.0+ 增加唯一索引 ux_undo_log
CREATE TABLE `undo_log` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `branch_id` bigint(20) NOT NULL,
  `xid` varchar(100) NOT NULL,
  `context` varchar(128) NOT NULL,
  `rollback_info` longblob NOT NULL,
  `log_status` int(11) NOT NULL,
  `log_created` datetime NOT NULL,
  `log_modified` datetime NOT NULL,
  `ext` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `ux_undo_log` (`xid`,`branch_id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;
```



#### 引入包

```xml
<dependency>
    <groupId>com.alibaba.cloud</groupId>
    <artifactId>spring-cloud-starter-alibaba-seata</artifactId>
    <exclusions>
        <exclusion>
            <groupId>io.seata</groupId>
            <artifactId>seata-all</artifactId>
        </exclusion>
    </exclusions>
</dependency>

<dependency>
    <groupId>io.seata</groupId>
    <artifactId>seata-all</artifactId>
    <version>1.1.0</version>
</dependency>
```



##### 注意事项

###### seata-spring-boot-starter

内置GlobalTransactionScanner自动初始化功能，若外部实现初始化，请参考SeataAutoConfiguration保证依赖加载顺序
默认开启数据源自动代理，可配置seata.enable-auto-data-source-proxy: false关闭

###### spring-cloud-starter-alibaba-seata

    查看版本说明 2.1.0内嵌seata-all 0.7.1，2.1.1内嵌seata-all 0.9.0，2.2.0内嵌seata-spring-boot-starter 1.0.0, 2.2.1内嵌seata-spring-boot-starter 1.1.0
    
    2.1.0和2.1.1兼容starter解决方案:
    @SpringBootApplication注解内exclude掉spring-cloud-starter-alibaba-seata内的com.alibaba.cloud.seata.GlobalTransactionAutoConfiguration
spring-cloud-starter-alibaba-seata推荐依赖配置方式

```xml
 <dependency>
     <groupId>io.seata</groupId>
     <artifactId>seata-spring-boot-starter</artifactId>
     <version>最新版</version>
</dependency>
<dependency>
    <groupId>com.alibaba.cloud</groupId>
    <artifactId>spring-cloud-starter-alibaba-seata</artifactId>
    <version>最新版本</version>
    <exclusions>
        <exclusion>
            <groupId>io.seata</groupId>
            <artifactId>seata-spring-boot-starter</artifactId>
        </exclusion>
    </exclusions>
</dependency>
```



支持的启动参数

| 参数 | 全写         | 作用                       | 备注                                                         |
| ---- | :----------- | -------------------------- | ------------------------------------------------------------ |
| -h   | --host       | 指定在注册中心注册的 IP    | 不指定时获取当前的 IP，外部访问部署在云环境和容器中的 server 建议指定 |
| -p   | --port       | 指定 server 启动的端口     | 默认为 8091                                                  |
| -m   | --storeMode  | 事务日志存储方式           | 支持file,db,redis，默认为 file 注:redis需seata-server 1.3版本及以上 |
| -n   | --serverNode | 用于指定seata-server节点ID | 如 1,2,3..., 默认为 1                                        |
| -e   | --seataEnv   | 指定 seata-server 运行环境 | 如 dev, test 等, 服务启动时会使用 registry-dev.conf 这样的配置 |

```yaml
### nacos配置
  cloud: 
    nacos:
      discovery:
        server-addr: 192.168.10.222:8848
        enabled: true
        service: ${spring.application.name}
    alibaba:
      seata:
        tx-service-group: tx_seata_default_group ##绑定事务组
```

##### 数据源代理（不支持自动和手动配置并存）

###### 如果使用seata-all

0.9.0版本开始seata支持自动代理数据源

```yaml
1.1.0: seata-all取消属性配置，改由注解@EnableAutoDataSourceProxy开启，并可选择jdk proxy或者cglib proxy
1.0.0: client.support.spring.datasource.autoproxy=true
0.9.0: support.spring.datasource.autoproxy=true
```

如果采用XA模式，@EnableAutoDataSourceProxy(dataSourceProxyMode = "XA")

手动配置可参考下方的例子

```java
@Primary
@Bean("dataSource")
public DataSource dataSource(DataSource druidDataSource) {
    //AT 代理 二选一
    return new DataSourceProxy(druidDataSource);
    //XA 代理
    return new DataSourceProxyXA(druidDataSource)
}
```

###### 如果使用seata-starter

使用自动代理数据源时，如果使用XA模式还需要调整配置文件

application.properties

```properties
seata.data-source-proxy-mode=XA  
```

如何关闭seata-spring-boot-starter的数据源自动代理？

application.properties

```properties
seata.enable-auto-data-source-proxy=false  
```



测试

```txt
io.seata.core.exception.TmTransactionException: TransactionException[begin global request failed. xid=null, msg=Data truncation: Data too long for column 'application_id' at ro
	at io.seata.tm.DefaultTransactionManager.begin(DefaultTransactionManager.java:55)
	at io.seata.tm.api.DefaultGlobalTransaction.begin(DefaultGlobalTransaction.java:105)
	at io.seata.tm.api.TransactionalTemplate.beginTransaction(TransactionalTemplate.java:123)
	at io.seata.tm.api.TransactionalTemplate.execute(TransactionalTemplate.java:58)
	at io.seata.spring.annotation.GlobalTransactionalInterceptor.handleGlobalTransaction(GlobalTransactionalInterceptor.java:106)
	at io.seata.spring.annotation.GlobalTransactionalInterceptor.invoke(GlobalTransactionalInterceptor.java:83)
	at org.springframework.aop.framework.ReflectiveMethodInvocation.proceed(ReflectiveMethodInvocation.java:186)
	at org.springframework.aop.framework.CglibAopProxy$CglibMethodInvocation.proceed(CglibAopProxy.java:747)
	at org.springframework.aop.framework.CglibAopProxy$DynamicAdvisedInterceptor.intercept(CglibAopProxy.java:689)
	at com.julong.system.service.impl.OrderServiceImpl$$EnhancerBySpringCGLIB$$f68c0c45.updateOrder(<generated>)
	at com.julong.system.action.OrderAction.updateOrderById(OrderAction.java:58)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:497)
	at org.springframework.web.method.support.InvocableHandlerMethod.doInvoke(InvocableHandlerMethod.java:190)
	at org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest(InvocableHandlerMethod.java:138)
	at org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:106)
	at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:888)
	at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:793)
	at org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:87)
	at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:1040)
	at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:943)
	at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:1006)
	at org.springframework.web.servlet.FrameworkServlet.doGet(FrameworkServlet.java:898)
	at javax.servlet.http.HttpServlet.service(HttpServlet.java:634)
	at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:883)
```

此错误需要修改 表字段长度来进行解决