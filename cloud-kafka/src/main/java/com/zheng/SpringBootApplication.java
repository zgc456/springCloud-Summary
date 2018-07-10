package com.zheng;

import com.zheng.binder.Shop_Binder;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * SpringCloud启动类
 *
 * @author 郑国超
 * @Version 1.0
 * @Data 2018/7/2 8:53
 */
@org.springframework.boot.autoconfigure.SpringBootApplication
@EnableBinding(Shop_Binder.class)
public class SpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication.class,args);
    }
}
