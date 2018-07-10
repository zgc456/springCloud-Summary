package com.zheng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author
 * @Version 1.0
 * @Data 2018/7/3 11:34
 */
@SpringBootApplication
@EnableZuulProxy      //zuul服务
@EnableDiscoveryClient  //从注册中心发现服务
public class SpringBootApplicationZuul {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationZuul.class,args);
    }
}
