package com.zheng;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import zipkin.server.internal.EnableZipkinServer;


/**
 * SpringCloud启动类
 *
 * @author 郑国超
 * @Version 1.0
 * @Data 2018/7/2 8:53
 */
@EnableDiscoveryClient
@EnableZipkinServer
@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplicationSleuth {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationSleuth.class,args);
    }
}
