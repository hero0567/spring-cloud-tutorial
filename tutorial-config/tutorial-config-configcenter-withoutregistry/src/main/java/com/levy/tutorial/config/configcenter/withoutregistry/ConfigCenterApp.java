package com.levy.tutorial.config.configcenter.withoutregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @Author: Levy
 *  
 * @CreateTime: 2017/6/1 14:18
 * @Description:
 */
@EnableConfigServer
@SpringBootApplication
public class ConfigCenterApp {
    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterApp.class, args);
    }
}
