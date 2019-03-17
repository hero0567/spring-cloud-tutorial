package com.levy.tutorial.stream.consumer0;

import com.levy.tutorial.stream.consumer0.channel.LogSubscribeChannel;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;

/**
 * @Author: Leo
 * @Blog: http://blog.csdn.net/lc0817
 * @CreateTime: 2017/6/8 18:24
 * @Description:
 */
@EnableBinding({
        LogSubscribeChannel.class
})
@SpringBootApplication
public class Consumer0App {
    public static void main(String[] args) {
        SpringApplication.run(Consumer0App.class, args);
    }
}
