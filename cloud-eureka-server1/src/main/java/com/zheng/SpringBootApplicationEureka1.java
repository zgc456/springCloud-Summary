package com.zheng;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
public class SpringBootApplicationEureka1 {
    public static final Logger logger=LoggerFactory.getLogger(SpringBootApplicationEureka1.class);
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplicationEureka1.class,args);
        logger.info("eureka1启动成功");
    }
}
