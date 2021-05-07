package com.example.controller;

import com.example.feign.service.FeignService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @description:
 * @author: jqq
 * @time: 2021/4/14 13:49
 */
@RestController
public class DemoController {
    @Resource
    private RestTemplate restTemplate;
    @Resource
    private FeignService feignService;
    private static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";

    @RequestMapping("/consume/select")
    public String getDemo() {
        String forObject = restTemplate.getForObject(PAYMENT_URL + "/payment/select", String.class);
        return forObject;
    }

    @RequestMapping("/consume/openfeign/string")
    public String getString() {
        String s = feignService.getString();
        return s;
    }
}
