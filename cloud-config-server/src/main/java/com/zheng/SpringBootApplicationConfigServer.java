package com.zheng;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * SpringCloud启动类
 *
 * @author 郑国超
 * @Version 1.0
 * @Data 2018/7/2 8:53
 */
@EnableConfigServer
@EnableEurekaServer
@org.springframework.boot.autoconfigure.SpringBootApplication
public class SpringBootApplicationConfigServer {
    /*
    *访问路径
    * http://localhost:8080/springcloud-summary-config-client-dev/properties
    */
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationConfigServer.class,args);
    }
}
