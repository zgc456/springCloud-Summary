package com.zheng.binder;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;

/**
 * Created by lenovo on 2018/4/2.
 */
public interface Shop_Binder {
    String SHOP_SERVER_INPUT="input";
    String SHOP_SERVER_OUTPUT="output";
    /**
     * 发消息的通道
     *
     * @return
     */
    @Output(SHOP_SERVER_OUTPUT)
    MessageChannel sendShopMessage();

    /**
     * 收消息的通道
     *
     * @return
     */
    @Input(SHOP_SERVER_INPUT)
    SubscribableChannel recieveShopMessage();

}
