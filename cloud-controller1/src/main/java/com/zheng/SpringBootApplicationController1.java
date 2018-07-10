package com.zheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author
 * @Version 1.0
 * @Data 2018/7/3 10:46
 */
@SpringBootApplication
@EnableDiscoveryClient //去注册中心发现服务
@EnableHystrixDashboard //开启熔断器
@EnableCircuitBreaker //熔断器
public class SpringBootApplicationController1 {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationController1.class,args);
    }
}
