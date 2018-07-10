package com.zheng.service;

import com.zheng.binder.Shop_Binder;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class Shop_Server {
    @Resource(name = Shop_Binder.SHOP_SERVER_OUTPUT)
    private MessageChannel shopMessage;

    @RequestMapping("/test")
    public String send(){
        shopMessage.send(MessageBuilder.withPayload("test").build(), 3000);
        return "发送成功";
    }

    @StreamListener(Shop_Binder.SHOP_SERVER_INPUT)
    public void receive(String message) {
        System.out.println(message);
    }
}
