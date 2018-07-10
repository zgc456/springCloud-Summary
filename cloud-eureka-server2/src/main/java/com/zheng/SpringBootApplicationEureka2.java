package com.zheng;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * SpringCloud启动类
 *
 * @author 郑国超
 * @Version 1.0
 * @Data 2018/7/2 8:53
 */
@EnableEurekaServer
@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplicationEureka2 {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationEureka2.class,args);
    }
}
