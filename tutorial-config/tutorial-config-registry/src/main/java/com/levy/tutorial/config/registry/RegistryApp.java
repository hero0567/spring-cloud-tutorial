package com.levy.tutorial.config.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Author: Levy
 *  
 * @CreateTime: 2017/6/1 10:56
 * @Description:
 */
@SpringBootApplication
@EnableEurekaServer
public class RegistryApp {
    public static void main(String[] args) {
        SpringApplication.run(RegistryApp.class, args);
    }
}
