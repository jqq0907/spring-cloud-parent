package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @description:
 * @author: jqq
 * @time: 2021/5/7 9:48
 */
@RestController
public class NacosConsumer83 {
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/nacos/getString/{id}")
    public String getString(@PathVariable("id") Long id) {
        return restTemplate.getForObject("http://nacos-payment-provider" + "/payment/nacos/getString/" + id, String.class);
    }
}
