package com.levy.tutorial.bus.service0.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Levy
 *  
 * @CreateTime: 2017/6/1 22:45
 * @Description:
 */
@RestController
@RefreshScope
public class Service0Controller {
    @Value("${tips}")
    String tips;

    @GetMapping("tips")
    public String tips() {
        return tips;
    }
}
