package com.levy.tutorial.sleuth.service0.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author: Levy
 *  
 * @CreateTime: 2017/6/1 11:18
 * @Description:
 */
@FeignClient("service1")
@RequestMapping("service1")
public interface Service1Client {

    @GetMapping("service1")
    public String service1();

}
