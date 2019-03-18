package com.levy.tutorial.bus.configcenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author: Levy
 *  
 * @CreateTime: 2017/6/1 14:18
 * @Description:
 */
@EnableEurekaClient
@EnableConfigServer
@SpringBootApplication
public class ConfigCenterApp {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterApp.class, args);
    }
}
