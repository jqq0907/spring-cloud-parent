package com.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: jqq
 * @time: 2021/5/7 9:43
 */
@RestController
public class NacosProvider9001 {
    @Value("${server.port}")
    private String port;

    @GetMapping("/payment/nacos/getString/{id}")
    public String getString(@PathVariable("id") Long id) {
        return "nacos" + port + "\t" + id;
    }
}
