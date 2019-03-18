package com.levy.tutorial.stream.consumer0.channel;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @Author: Levy
 *  
 * @CreateTime: 2017/6/9 10:29
 * @Description:
 */
public interface LogSubscribeChannel {
    String SUBSCRIBE = "subscribe";

    @Input(SUBSCRIBE)
    SubscribableChannel subscribe();
}
