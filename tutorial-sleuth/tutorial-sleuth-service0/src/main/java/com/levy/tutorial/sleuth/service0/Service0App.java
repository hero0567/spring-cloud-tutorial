package com.levy.tutorial.sleuth.service0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * @Author: Levy
 *  
 * @CreateTime: 2017/6/1 11:03
 * @Description:
 */
@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class Service0App {
    public static void main(String[] args) {
        SpringApplication.run(Service0App.class, args);
    }
}
